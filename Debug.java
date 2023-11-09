import java.util.Scanner;
public class Debug {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double posX = 1;
        double posY = 1;
        int persiki = 100000;
        double hunger = 100;
        String input = "\0";
        while (!input.equals("q")) {
        
        System.out.println("Введите координаты для телепортации");
        posX = sc.nextInt();
        posY = sc.nextInt();
            System.out.println("X =" + posX + "Y =" + posY + "У вас " + persiki + "персиков");
            input = sc.nextLine();
        if (input.equalsIgnoreCase("e")) {
            persiki--;
            hunger -= 5;
        }
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Закрытие игры");
                    System.out.println("Готово");
                    sc.close(); 
                    break;  
                    }
                }
            }
        }