import java.util.Scanner;
public class Experimental {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int posX = 0;
        int posY = 0;
        int money = 50;
        String input = "\0";
        while (input != "q") {
        input = sc.nextLine();
            if (input.equals("w")) {
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
                System.out.println("Ваши координаты: x=" + posX + " y=" + posY + "Количество монет=" + money);
                int persiki = 0;
                if (posY % 7 == 0 || posX % 7 == 0 || posY % 7 == 0 && posX % 7 == 0) {
                    persiki++;
                    System.out.println("Вы нашли персик! Ваше количество персиков: " + persiki);
                }
                if (posY == 43 && posX == 50 || posY ==  79 && posX == 11 && !input.equals("i")) {
                    input = "R";
                    System.out.println("Добро пожаловать на рынок! Что вы хотите купить/продать? \n Чтобы что-то купить нажмите B, а чтобы продать нажмите S\n Чтобы выйти, нажмите i");
                    if (input.equals("b") && !input.equals("f") {
                        System.out.println("Машина = 400 монет, персик: 10 монет, телефон: 200 монет\n чтобы купить машину, нажмите M, чтобы купить персик, нажмите P, а чтобы купить телефон нажмите S\n нажмите F для выхода");
                        input = sc.nextLine();
                        if (input.equals("m")) {
                            if (money >= 400) money -= 400;
                            if (money < 400) System.out.println("Попробуйте продать что-нибудь");
                            input = "f";
                        }
                        if (input == "p") {
                            if (money >= 10) money -= 10;
                            if (money < 10) System.out.println("Попробуйте продать 
                        }
                        if (input.equals("p")) {
                            if (money >= 200) money -= 200;
                            if (money < 200) System.out.println("Попробуйте продать что-нибудь");
                            input = "f";
                        }
                    }
                    if (input == "s") {
                        System.out.println("Что вы хотите продать, персики, телефон или машину? \n чтобы продать машину, нажмите M, чтобы продать персик, нажмите P, а чтобы продать телефон нажмите S\\n нажмите F для выхода ");
                        input = sc.nextLine();
                        if (input == "m") {
                            money += 390;
                            input = "I";
                        }
                        if (input == "p") {
                            money += 10;
                            input = "I";
                        }
                        if (input == "s") {
                            money += 185;
                            input = "I";
                        }
                    }
                }
                if (posX % 100 == 0 || posY % 100 == 0 || posX % 100 == 0 && posY % 100 == 0) {
                    System.out.println("Вы нашли сокровища!");
                    money += 1000;
                }
                if (input == "q") {
                    System.out.println("Спасибо за игру!\n Автор: Анатолий6463");
                }
        }
    }
}
