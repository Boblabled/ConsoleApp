package Commands;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Класс команды которая удаляет все элементы с указанным id
 */
public class CommandRemoveById extends Command{
    /**
     * Метод который удаляет все элементы с указанным id
     *
     * @param command - команда которую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, LinkedHashSet collection){
        String fields[];
        Object arr[];
        Boolean work;
        work = false;
        int index;
        String id[];
        fields = command.split(" ");
        if (fields.length == 2){
            arr = collection.toArray();
            for (index = 0; index<collection.size(); index++){
                id = (arr[index].toString()).split(",");
                if (id[0].equals(fields[1])){
                    collection.remove((arr[index]));
                    System.out.println("\nЭлемент успешно удалён\n");
                    work = true;
                }
            }
        } else {
            System.out.println("\nНеверный формат ввода данных\n");
            work = false;
        }
        if (!work) System.out.println("\nНе найдено элемента с таким id\n");
    }
}
