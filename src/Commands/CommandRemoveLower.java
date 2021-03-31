package Commands;

import java.util.LinkedHashSet;

/**
 * Класс команды который удаляет из коллекции все элементы, меньшие, чем заданный
 */
public class CommandRemoveLower extends Command{
    /**
     * Метод который удаляет из коллекции все элементы, меньшие, чем заданный
     *
     * @param command - команда которую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, LinkedHashSet collection){
        String[] field;
        Object[] arr;
        String element;
        boolean work;
        work = false;
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
            arr = collection.toArray();
            for (index = 0; index<collection.size(); index++) {
                if (element.hashCode() < arr[index].hashCode()) {
                    collection.remove(arr[index]);
                    work = true;
                }
            }
            if (!work) {
                System.out.println("\nЭлементов меньше указанного не существует\n");
            } else System.out.println("\nНаименьшие элементы удалены\n");

        } else System.out.println("\nНеверный формат ввода данных\n");
    }
}
