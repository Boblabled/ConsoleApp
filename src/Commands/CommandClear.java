package Commands;

import Elements.MusicBand;

import java.util.LinkedHashSet;

/**
 * Класс команды которая удаляет все элементы из коллекции
 */
public class CommandClear extends Command{
    /**
     * Метод который удаляет все элементы из коллекции
     *
     * @param collection - коллекция
     */
    public static void action(LinkedHashSet<MusicBand> collection){
        collection.clear();
        System.out.println("\nКоллекция успешно очищена\n");
    }
}
