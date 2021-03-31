package Commands;

import Manager.Manager;
import java.util.LinkedHashSet;

/**
 * Класс команды которая обновляет id элемента
 */
public class CommandUpdateId extends Command{
    /**
     * Метод который обновляет id элемента
     *
     * @param command - команда которую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, LinkedHashSet collection){
        Manager manager = new Manager();
        String element = "";
        String field[];
        int index;
        field = command.split(" ");
        if (field.length == 1){
            System.err.println("\nЭлемент отсутствует\n");
        } else  if (field.length >= 2){
            element = field[1];
            if (field.length > 2){
                for (index = 2; index<field.length; index++) {
                    element = element + " " + field[index];
                }
            }
        } else element = field[1];

        if (collection.contains(element)){
            collection.remove(element);
            collection.add(manager.idUpdate(element));
            System.out.println("\nid успешно обновлён\n");
        } else System.out.println("\nТакого элемента не существует\n");
    }
}
