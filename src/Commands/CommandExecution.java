package Commands;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;

/**
 * Класс команды которая исполняет все команды
 */
public class CommandExecution extends Command{
    /**
     * Команда которая исполняет все команды
     *
     * @param collection - коллекция
     * @param line - строка котрую вводят с консоли
     * @param command - комманда котрую вводят с консоли
     * @param file - файл в котором храниться коллекция
     * @param time - текущее время
     */
    public static void action(LinkedHashSet collection, String line, String command, String file, LocalDateTime time){
        if (line.equals("help")){
            CommandHelp.action();
            CommandHistory.save(command);
        } else if (line.equals("exit")){
            CommandExit.action();
            CommandHistory.save(command);
        } else if (line.equals("info")){
            CommandInfo.action(collection, time);
            CommandHistory.save(command);
        } else if (line.equals("show")){
            CommandShow.action(collection);
            CommandHistory.save(command);
        } else if (command.equals("add")){
            CommandAdd.action(line, collection);
            CommandHistory.save(command);
        } else if ((command).equals("update_id")){
            CommandUpdateId.action(line, collection);
            CommandHistory.save(command);
        } else if ((command).equals("remove_by_id")){
            CommandRemoveById.action(line, collection);
            CommandHistory.save(command);
        } else if ((command).equals("add_if_min")){
            CommandAddIfMin.action(line, collection);
            CommandHistory.save(command);
        } else if ((command).equals("remove_lower")){
            CommandRemoveLower.action(line, collection);
            CommandHistory.save(command);
        } else if ((line).equals("group_counting_by_id")){
            CommandGroupCountingById.action(collection);
            CommandHistory.save(command);
        } else if ((command).equals("count_by_albums_count")){
            CommandCountByAlbumsCount.action(line, collection);
        } else if ((command).equals("count_greater_than_albums_count")){
            CommandCountGreaterThanAlbumsCountAlbumsCount.action(line, collection);
            CommandHistory.save(command);
        } else if ((line).equals("clear")){
            CommandClear.action(collection);
            CommandHistory.save(command);
        } else if ((line).equals("history")){
            CommandHistory.action();
            CommandHistory.save(command);
        } else if ((line).equals("save")){
            CommandSave.action(file, collection);
            CommandHistory.save(command);
        } else if ((command).equals("execute_script")){
            CommandExecuteScript.action(collection, line, command, file, time);
            CommandHistory.save(command);
        } else {
            System.out.println("\nНеизвестная команда");
            System.out.println("help : вывести справку по доступным командам\n");
        }
    }
}
