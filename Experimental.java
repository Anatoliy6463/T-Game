import java.util.Scanner;
public class Experimental {
    public static void controller(String[] args) {
        string input = "\0";
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
    }
    public static void teleportator(int X, int Y){
        System.out.println("ВВЕДИТЕ КООРИНАТЫ ТЕЛЕПОРТАЦИИ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int posX = 0;
        int posY = 0;
        int HP = 100;
        int armor = 0;
        int strength = 4.5;
        int money = 50;
        int persiki = 0;
        while (input != "q") {
        input = sc.nextLine();
            if (input.equals("w")) {
                controller();
            }
            else if (input.equals("a")) {
                controller();
            }
            else if (input.equals("s")) {
                controller();
            }
            else if (input.equals("d")) {
                controller();
            }
            else {
                System.out.println("Нажмите одну из следующих клавиш: W, A, S, D, Q");
            }
                System.out.println("Ваши координаты: x=" + posX + " y=" + posY + "Количество монет=" + money);
                
                if (posY % 7 == 0 || posX % 7 == 0 || posY % 7 == 0 && posX % 7 == 0) {
                    persiki++;
                    System.out.println("Вы нашли персик! Ваше количество персиков: " + persiki);
                }

                    if (posX >=50 && posY >=10 && pos X <= 51 && posY <= 11) {
                        System.out.println("Что вы хотите купить, меч или броню? Чтобы купить меч, нажмите M, а чтобы купить броню нажмите A");
                        input = sc.nextLine();
                        if (input.equals("a")) {
                            money-=25;
                            armor = 1;
                        }
                        if (input.equals("m")) {
                            money-=25;
                            strength+=10;
                        }
                    }
                
                if(posX >= 58 && posY >= 50 && posX <=69 && posY <=69){
                    System.out.println("Вы зашли на территорию дракона! Бегите или сражайтесь!");
                    input = "dragon";
                    input = sc.nextLine();
                    int dragonhp = 1000;
                    int dragonstrength = 20;
                    if (!input.equals("\0") && !input.equals("a"){
                        controller();
                        if (armor = 0) hp-=20;
                        if (armor = 1) {
                            hp-=20;
                            hp+=strength;
                        }
                    
                    if (input.equals("a")) {
                        dragonhp-=strength;
                    }
                    System.out.println("Здоровье дракона:" + dragonhp + ". Ваше здоровье:");
                        if (dragonhp <= 0) {
                            System.out.println("Вы победили дракона!");
                            money+=50;
                            hp+=75;
                            if (hp >= 100) hp = 100;
                        }
                    }
                }
                if (input == "q") {
                    System.out.println("Спасибо за игру!\n Автор: Анатолий6463");
                }
        }
        }
    }
}
