package Commands;

import Elements.MusicBand;

import java.util.LinkedHashSet;

/**
 * Класс команды которая выводит количество элементов, значение поля albumsCount которых больше заданного
 */
public class CommandCountGreaterThanAlbumsCountAlbumsCount extends Command{
    /**
     * Метод который выводит количество элементов, значение поля albumsCount которых больше заданного
     *
     * @param command - строка котрую вводят с консоли
     * @param collection - коллекция
     */
    public static void action(String command, LinkedHashSet<MusicBand> collection){
        String[] fields;
        Object[] arr;
        boolean parse;
        parse = true;
        int index;
        String[] albumsCount;
        int count = 0;
        fields = command.split(" ");
        if (fields.length == 2 ){

            try {
                if (fields[1] == null){
                    System.out.println("albumsCount не может быть null");
                    parse = false;
                } else fields[1]= String.valueOf(Long.parseLong(fields[1]));
            } catch (NumberFormatException e) {
                System.out.println("albumsCount неверный формат строки!");
                parse = false;
            }

            if (parse = true) {
                arr = collection.toArray();
                for (index = 0; index < collection.size(); index++) {
                    albumsCount = (arr[index].toString()).split(",");
                    if ((Long.parseLong(albumsCount[6]) > Long.parseLong(fields[1]))) {
                        count++;
                    }
                }
               System.out.println("\nКоличество элементов у которых больше albumsCount: " + count + "\n");
            }
        } else {
            System.out.println("\nНеверный формат ввода данных\n");
        }
    }
}
