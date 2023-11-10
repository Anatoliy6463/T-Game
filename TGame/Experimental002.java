package TGame;
import java.util.Scanner;
public class Experimental002 {
    public static void main(String[] args) {
        System.out.println("T-Game 0.0.2");
        System.out.println("В версии 0.0.2 клавиши управления WASD заменили на ESDF");
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
        int dragonhp = 5000;
        int car = 0;
        char magazin = 'r';
        double hunger = 0;
        String input = "\0";
        while (!input.equals("q")) {
        System.out.println("Ваши координаты: x=" + posX + " y=" + posY + "\nКоличество монет=" + money + " Уровень голода=" + hunger + " HP=" + hp);
        input = sc.nextLine();
        if (input.equalsIgnoreCase("e") && car != 1) {
            posY++;
        }
        else if (input.equalsIgnoreCase("s") && car != 1) {
            posX--;
        }
        else if (input.equalsIgnoreCase("d") && car != 1) {
            posY--;
        }
        else if (input.equalsIgnoreCase("f") && car != 1) {
            posX++;
        }
        if (input.equalsIgnoreCase("e") && car == 1) {
            posY+=3;
        }
        else if (input.equalsIgnoreCase("s") && car == 1) {
            posX-=3;
        }
        else if (input.equalsIgnoreCase("d") && car == 1) {
            posY-=3;
        }
        else if (input.equalsIgnoreCase("f") && car == 1) {
            posX+=3;
        }
        else if (input.equalsIgnoreCase("a") && persiki >= 1) {
            if (hunger <= 20) { 
                hunger = 0;
                persiki--;
            }
            hunger-=20;
            persiki--;
        }
        else if (input.equalsIgnoreCase("a") && persiki < 1) {
            hunger+=0.5;
        }
        else if (input.equalsIgnoreCase("p") && persiki >= 1) {
            System.out.println("У вас " + persiki + "персиков");
        }
        else if (input.equalsIgnoreCase("p") && persiki < 1) {
            System.out.println("У вас нет персиков, попробуйте найти их или купить в магазине");
        }
        else if (input.equalsIgnoreCase("N") && car == 2) {
            car = 1;
        }
        else if (input.equalsIgnoreCase("V") && car == 2) {
            car = 2;
        }    
                if (posX % 4 == 0 && posY % 4 == 0 && posX != 0 && posY != 0) {
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
                    System.out.println("Что вы хотите купить? Меч = O, броня = R, персик = P, машина = C, чтобы выйти, нажмите Q");
                    if (input.equalsIgnoreCase("O") && shopmoney < 5000) {
                        mech = 1;
                        money-=10;
                        System.out.println("С вас 10 монет");
                        shopmoney += 10;
                    }
                    if (input.equalsIgnoreCase("O") && shopmoney >= 5000) {
                        mech = 1;
                        money-=7;
                        System.out.println("С вас 7 монет");
                        shopmoney += 7;
                    }
                    else if (input.equalsIgnoreCase("R") && shopmoney < 7500) {
                        armor = 1;
                        money-=20;
                        System.out.println("С вас 20 монет");
                        shopmoney += 20;
                    }
                    else if (input.equalsIgnoreCase("R") && shopmoney >= 7500) {
                        armor = 1;
                        money-=15;
                        System.out.println("С вас 15 монет");
                        shopmoney += 15;
                    }
                    else if (input.equalsIgnoreCase("C")) {
                        car = 2;
                        money-=200;
                        System.out.println("С вас 200 монет");
                        shopmoney += 200;
                        System.out.println("Чтобы завести машину, нажмите N, а чтобы остановить, нажмите V");
                    }
                    else if (input.equalsIgnoreCase("C")) {
                        car = 2;
                        money-=200;
                        System.out.println("С вас 200 монет");
                        shopmoney += 200;
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
                if (posX >= 21 && posY >= 19 && posX <= 31 && posY <= 69 && dragonhp > 0) {
                    System.out.println("Здесь живёт дракон! Бегите или сражайтесь!");
                    if (armor == 0) {
                        hp-=15;
                    }
                    if (armor == 1) {
                        hp-=5;
                    }
                    if (input.equalsIgnoreCase("x")) {
                        if (mech == 0) {
                            dragonhp -= 2;
                            hp -= 3;
                        }
                        if (mech == 1 && armor == 0) {
                            dragonhp -= 8;
                            hp -= 1;
                        }
                        if (mech == 1 && armor == 1) {
                            dragonhp -= 8;
                        }
                        
                    }
                        System.out.println("Здоровье дракона: " + dragonhp);
                        if (dragonhp <= 0) {
                            System.out.println("Вы победили дракона!");
                            money+=5000;
                        }
                }
                counter++;
                hunger+=0.15;
                if (counter % 5 == 0) zapasPersikov++;
                magazin = 'r';
                if (hunger >= 100) {
                    hp-=30;
                }
                if (hunger <= 10) {
                    hp+=10;
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
                    else {
                        System.out.println("Закрытие игры");
                        System.out.println("Готово");
                        sc.close();
                        break;
                    }
                }
        }
    }
}
