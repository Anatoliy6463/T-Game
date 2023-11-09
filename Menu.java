import java.util.Scanner;
import TGame.Experimental;
public class Menu {
    public static void menu(String[] args){
        System.out.println("Добро пожаловать в T-Game!\n Чтобы зайти в игру, нажмите S, чтобы выйти из игры, нажмите Q");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        if (line.startsWith("E")) {
            Experimental.engine();
        }
        else if (line.startsWith("!")) {
            System.out.println("Завершение работы...");
            scan.close();
            System.exit(0);
        }
    }
}