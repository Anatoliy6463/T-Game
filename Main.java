import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int posX = 0;
        int posY = 0;
        int money = 50;
        int flag = 0;
        String input = sc.nextLine();
        while (input != "q") {
        if (input == "w") {
            posY++;
        }
        else if (input.equals("a")) {
            posX--;
        }
        else if (input.equals("s")) {
            posY--;
        }
        else if (input.equals("d")) {
            posX++;
        }
        else {
            System.out.println("Нажмите одну из следующих клавиш: W, A, S, D, Q");
        }
        input = sc.nextLine();
                System.out.println("Ваши координаты: x=" + posX + " y=" + posY + "Количество монет=" + money);
                int persiki = 0;
                if (posY % 7 == 0 || posX % 7 == 0 || posY % 7 == 0 && posX % 7 == 0) {
                    persiki++;
                    System.out.println("Вы нашли персик! Ваше количество персиков: " + persiki);
                }
                if (posX % 100 == 0 && posY % 100 == 0 && posX != 0 %% posY != 0 && flag == 0) {
                    System.out.println("Вы нашли сокровища!");
                    money += 1000;
                }
                    if (posX % 100 == 0 && posY % 100 == 0 && posX != 0 %% posY != 0 && flag == 1) {
                    System.out.println("Здесь уже нет сокровищ");
                }
                if (input == "q") {
                    System.out.println("Спасибо за игру!\n Автор: Анатолий6463");
                }
        }
    }
}
