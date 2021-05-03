import Commands.*;
import Elements.MusicBand;
import Manager.Manager;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String temp = System.getenv().get("MusicBandPATH");
        Manager manager = new Manager();
        LinkedHashSet<MusicBand> collection = new LinkedHashSet<MusicBand>();
        LocalDateTime today = LocalDateTime.now();
        String file;
        file = temp + "MusicBand.csv";
        manager.fill(file, collection);
        System.out.println("\nhelp : вывести справку по доступным командам\n");

        while (true){
            System.out.println("Введите команду:");
            String line;
            String command;
            line = in.nextLine();
            String[] field;
            field = line.split(" ");
            command = field[0];
            CommandExecution.action(collection, line, command, file, today);
        }
    }
}