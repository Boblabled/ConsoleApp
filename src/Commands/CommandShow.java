package Commands;

import Elements.MusicBand;

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
    public static void action(LinkedHashSet<MusicBand> collection){
        MusicBand[] arr;
        arr = collection.toArray(new MusicBand[0]);
        for (int i =0; i < collection.size(); i++){
            if (i == 0) {
                System.out.println("\n" + arr[i]);
            } else if (i == collection.size()-1) {
                System.out.println(arr[i] + "\n");
            } else System.out.println(arr[i]);

            /* Прям совсем красиво
            if (i == 0) {
                System.out.println("\n[" + arr[i] + ",");
            } else if (i == collection.size()-1) {
                System.out.print(arr[i] + "]\n");
            } else System.out.println(arr[i] + ",");
             */
        }
    }
}
