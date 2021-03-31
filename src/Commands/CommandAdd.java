package Commands;
import Manager.Manager;

import java.util.LinkedHashSet;

/**
 * Класс команды которая добавляет новый элемент в коллекцию
 */
public class CommandAdd extends Command{

    /**
     * Метод который добавляет новый элемент в коллекцию
     *
     * @param command - строка котрую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, LinkedHashSet collection){
        Manager manager = new Manager();
        String element = "";
        String field[];
        int index;
        field = command.split(" ");
        if (field.length == 1){
            System.out.println("\nЭлемент отсутствует\n");
        } else  if (field.length >= 2){
                element = field[1];
                if (field.length > 2){
                    for (index = 2; index<field.length; index++) {
                        element = element + " " + field[index];
                    }
                }
                manager.add(element, collection);
        } else {
            element = field[1];
            manager.add(element, collection);
        }
    }
}
