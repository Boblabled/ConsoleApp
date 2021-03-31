package Commands;

import java.util.LinkedHashSet;

/**
 * Класс команды которая выводит все элементы коллекции
 */
public class CommandShow extends Command{
    /**
     * Метод который выводит все элементы коллекции
     *
     * @param collection - коллекция
     */
    public static void action(LinkedHashSet collection){
        System.out.println("\n" + collection + "\n");
    }
}
