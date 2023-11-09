import java.util.Scanner;
public class Experimental {
    public static void main(String[] args) {
        System.out.println("T-Game 0.0.1");
        System.out.println("Загрузка...");
        engine();
    }
    public static void engine(){
        Scanner sc = new Scanner(System.in);
        double posX = 1;
        double posY = 1;
        int money = 50;
        int shopmoney = 0;
        int flag = 0;
        int persiki = 0;
        int mech = 0;
        int armor = 0;
        int hp = 100;
        int zapasPersikov = 10000;
        int counter = 0;
        char magazin = 'r';
        double hunger = 0;
        String input = "\0";
        while (!input.equals("q")) {
        input = sc.nextLine();
        System.out.println("Ваши координаты: x=" + posX + " y=" + posY + "\nКоличество монет=" + money + " Уровень голода=" + hunger + " HP=" + hp);

        if (input.equalsIgnoreCase("w")) {
            posY++;
        }
        else if (input.equalsIgnoreCase("a")) {
            posX--;
        }
        else if (input.equalsIgnoreCase("s")) {
            posY--;
        }
        else if (input.equalsIgnoreCase("d")) {
            posX++;
        }
        else if (input.equalsIgnoreCase("e") && persiki >= 1) {
            if (hunger <= 5) hunger = 0;
            else hunger -= 5;
        }
        else if (input.equalsIgnoreCase("e") && persiki < 1) {
            hunger+=0.25;
        }
        else if (input.equalsIgnoreCase("p") && persiki >= 1) {
            System.out.println("У вас " + persiki + "персиков");
        }
        else if (input.equalsIgnoreCase("p") && persiki < 1) {
            System.out.println("У вас нет персиков, попробуйте найти их или купить в магазине");
            hunger+=0.15;
        }
        else {
            System.out.println("Нажмите одну из следующих клавиш: W, A, S, D, Q");
        }
        
                
                if (posX % 7 == 0 && posY % 7 == 0 && posX != 0 && posY != 0) {
                    persiki = persiki + 1;
                    System.out.println("Вы нашли персик! Ваше количество персиков: " + persiki);
                }
                if (posX % 100 == 0 && posY % 100 == 0 && posX != 0 && posY != 0 && flag == 0) {
                    System.out.println("Вы нашли сокровища!");
                    money += 1000;
                }
                    if (posX % 100 == 0 && posY % 100 == 0 && posX != 0 && posY != 0 && flag == 1) {
                    System.out.println("Здесь уже нет сокровищ");
                }
                
                if (posX % 19 == 0 && posY % 19 == 0 && posX != 0 && posY != 0 && magazin == 'r') {
                    System.out.println("Что вы хотите купить? Меч = S, броня = A, персик = P, чтобы выйти, нажмите Q");
                    if (input.equalsIgnoreCase("S")) {
                        mech = 1;
                        money-=10;
                        System.out.println("С вас 10 монет");
                        shopmoney += 10;
                    }
                    else if (input.equalsIgnoreCase("A")) {
                        armor = 1;
                        money-=20;
                        System.out.println("С вас 20 монет");
                        shopmoney += 20;
                    }
                    else if (input.equalsIgnoreCase("P") && zapasPersikov > 0) {
                        System.out.println("Сколько вам персиков?");
                        int skolko = sc.nextInt();
                        if (skolko <= zapasPersikov) {
                            persiki += skolko;
                            zapasPersikov -= skolko;
                            money -= 2 * skolko;
                            shopmoney += 2 * skolko;
                        }
                        else if (skolko > zapasPersikov) {
                            skolko = zapasPersikov - 5;
                            persiki += skolko;
                            money -= 2 * persiki;
                            System.out.println("Извините, у нас было всего лишь " + zapasPersikov + " персиков");
                            zapasPersikov -= skolko;
                        }
                        else if (input.equalsIgnoreCase("Q")) {
                            magazin = 'v';
                            posX++;
                        }
                    }
                }
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Закрытие игры");
                    System.out.println("Готово");
                    sc.close(); 
                    break;
                }
                if (posX >= 400 || posY >= 350 || posX <= -400 || posY <= -350 || posX >= 400 && posY >= 350 || posX <= -400 && posY <= -350) {
                    hp--;
                }
                counter++;
                hunger+=0.15;
                zapasPersikov++;
                magazin = 'r';
                if (hunger >= 100) {
                    hp--;
                }
                if (hunger <= 10) {
                    hp++;
                }
                if (hp >= 100) {
                    hp = 100;
                }
                if (hp <= 0) {
                    System.out.println("Game over");
                    money = 0;
                    mech = 0;
                    persiki = 0;
                    System.out.println("Возродиться? Y/n");
                    if (input.equalsIgnoreCase("Y")) {
                        posX = 0;
                        posY = 0;
                        hp = 100;
                    }
                    
                    else if (input.equalsIgnoreCase("N")) {
                        System.out.println("Закрытие игры");
                        System.out.println("Готово");
                        sc.close();
                        break;
                    }
                }
        }
    }
}
