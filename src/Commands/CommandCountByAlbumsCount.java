package Commands;

import Elements.MusicBand;

import java.util.LinkedHashSet;

/**
 * Класс команды которая выводит количество элементов, значение поля albumsCount которых равно заданному
 */
public class CommandCountByAlbumsCount extends Command{
    /**
     * Метод который выводит количество элементов, значение поля albumsCount которых равно заданному
     *
     * @param command - строка котрую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, LinkedHashSet<MusicBand> collection){
        String[] fields;
        Object[] arr;
        boolean work;
        work = false;
        int index;
        String[] albumsCount;
        int count = 0;
        fields = command.split(" ");
        if (fields.length == 2 ){
            arr = collection.toArray();
            for (index = 0; index<collection.size(); index++){
                albumsCount = (arr[index].toString()).split(",");
                if (albumsCount[6].equals(fields[1])){
                    count++;
                    work = true;
                }
            }
            if (work) System.out.println("\nКоличество элементов с таким albumsCount: " + count + "\n");
            if (!work) System.out.println("\nНе найдены элементы с таким albumsCount\n");
        } else {
            System.out.println("\nНеверный формат ввода данных\n");
        }
    }
}
