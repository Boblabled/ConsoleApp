package Commands;

/**
 * Класс который хранит и выводит 12 последних команд
 */
public class CommandHistory extends Command{
    public static String[] storage = new String[12];
    public static int Index;

    /**
     *Метод который запускает вывод 12 последних команд
     */
    public static void action(){
        int i;
        System.out.println("\nПоследние 12 команд:");
        for (i = 0; i<Index; i++){
            System.out.println(storage[i]);
        }
        System.out.println("\n");
    }

    /**
     * Метод который сохраняет команду
     *
     * @param command - коммандв которую вводят с консоли
     */
    public static void save(String command){
        if (Index < storage.length){
            storage[Index] = command;
            Index++;
        } else{
            int i;
            for (i = 0; i+1 < storage.length; i++){
                storage[i] = storage[i+1];
            }
            storage[11] = command;
        }
    }
}
