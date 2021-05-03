package Commands;

import Elements.MusicBand;

import java.io.*;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;

/**
 * Класс команды которая считывает команды из файла и выполняет их
 */
public class CommandExecuteScript extends Command{
    /**
     * Метод который считывает команды из файла и выполняет их
     *
     * @param collection - коллекция
     * @param line - строка котрую вводят с консоли
     * @param command - комманда котрую вводят с консоли
     * @param file - файл в котором храниться коллекция
     * @param time - текущее время
     */
    public static void action(LinkedHashSet<MusicBand> collection, String line, String command, String file, LocalDateTime time){
        //execute_script commands.txt
        String temp = System.getenv().get("MusicBandPATH");
        String[] fields;
        fields = line.split(" ");
        int index;
        String InPut;

        if (fields.length >= 2) {
            InPut = temp + fields[1];
            if (fields.length >= 3){
                for (index = 2; index < fields.length; index++) {
                    InPut = InPut + " " + fields[index];
                }
            }
            File way = new File(InPut);
            FileInputStream fis = null;

            try {
                fis = new FileInputStream(way);
            } catch (FileNotFoundException e) {
                System.err.println("Файл не найден");
            }

            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String newLine = null;
            while (true) {
                try {
                    newLine = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (newLine == null) break;
                String[] newCommand;
                newCommand = newLine.split(" ");
                CommandExecution.action(collection, newLine, newCommand[0], file, time);
            }

        } else System.out.println("\nНеверный формат ввода данных\n");
    }
}
