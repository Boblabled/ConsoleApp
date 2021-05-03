package Manager;

import Elements.MusicBand;
import java.io.*;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;

/**
 * Класс который заполняет коллекцию
 */
public class Manager {

    /**
     * Заполнение коллекции при первом запуске
     *
     * @param InPut - входный файл
     * @param collection - коллекция
     */
    public void fill(String InPut, LinkedHashSet<MusicBand> collection) {
        File file = new File(InPut);
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            System.exit(0);
        }

        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String[] fields;
        String element = null;
        int index;
        while (true) {
            MusicBand musicband = new MusicBand();
            try {
                element = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (element == null) break;
            fields = element.split(",");

            for (index = 0; index<fields.length; index++){
                if (fields[index].equals("null")){
                    fields[index] = null;
                }
            }

            musicband.setId(fields[0]);
            musicband.setName(fields[1]);
            musicband.setCoordinates(fields[2], fields[3]);
            musicband.setCreationDate(fields[4]);
            musicband.setNumberOfParticipants(fields[5]);
            musicband.setAlbumsCount(fields[6]);
            musicband.setEstablishmentDate(fields[7]);
            musicband.setGenre(fields[8]);
            musicband.setFrontMan(fields[9], fields[10], fields[11], fields[12], fields[13]);
            collection.add(musicband);
        }
    }

    /**
     * Добавляет новый файл в коллекцию
     *
     * @param element - элемент который вводят с консоли
     * @param collection - коллекция
     */
    public void add (String element, LinkedHashSet<MusicBand> collection){
        MusicBand musicband = new MusicBand();
        LocalDateTime today = LocalDateTime.now();
        String[] fields;
        String id;
        int index;
        fields = element.split(",");
        if (fields.length == 12) {
            for (index = 0; index < fields.length; index++) {
                if (fields[index].equals("null")) {
                    fields[index] = null;
                }
            }
            id = String.valueOf(Math.round(Math.random() * 1000000 + 1));
            musicband.setId(id);
            musicband.setName(fields[0]);
            musicband.setCoordinates(fields[1], fields[2]);
            musicband.setCreationDate(today.toString());
            musicband.setNumberOfParticipants(fields[3]);
            musicband.setAlbumsCount(fields[4]);
            musicband.setEstablishmentDate(fields[5]);
            musicband.setGenre(fields[6]);
            musicband.setFrontMan(fields[7], fields[8], fields[9], fields[10], fields[11]);

            collection.add(musicband);
            System.out.println("\nЭлемент добавлен в коллекцию\n");
        } else {
            System.out.println("\nНеверный формат элемента\n");
        }
    }

    /**
     * Обновляет поле id у элемента коллекции
     *
     * @param element - исходный элемент коллекции
     * @return - элемент с обновлённым id
     */
    public MusicBand idUpdate (String element){
        MusicBand musicband = new MusicBand();
        String[] fields;
        String id;
        fields = element.split(",");
        id = String.valueOf(Math.round(Math.random() * 1000000 + 1));
        while(fields[0] == id){
            id = String.valueOf(Math.round(Math.random() * 1000000 + 1));
        }
        fields[0] = id;
        musicband.setId(fields[0]);
        musicband.setName(fields[1]);
        musicband.setCoordinates(fields[2], fields[3]);
        musicband.setCreationDate(fields[4]);
        musicband.setNumberOfParticipants(fields[5]);
        musicband.setAlbumsCount(fields[6]);
        musicband.setEstablishmentDate(fields[7]);
        musicband.setGenre(fields[8]);
        musicband.setFrontMan(fields[9], fields[10], fields[11], fields[12], fields[13]);
        return (musicband);
    }

    public MusicBand set(String element){
        MusicBand musicband = new MusicBand();
        String[] fields;
        fields = element.split(",");
        musicband.setId(fields[0]);
        musicband.setName(fields[1]);
        musicband.setCoordinates(fields[2], fields[3]);
        musicband.setCreationDate(fields[4]);
        musicband.setNumberOfParticipants(fields[5]);
        musicband.setAlbumsCount(fields[6]);
        musicband.setEstablishmentDate(fields[7]);
        musicband.setGenre(fields[8]);
        musicband.setFrontMan(fields[9], fields[10], fields[11], fields[12], fields[13]);
        return (musicband);
    }
}
