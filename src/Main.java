import tasks.util.Tasks;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        while (true){
            System.out.println("Which task? ");
            text = scan.nextLine();
            if (text.equals("1")){
                Tasks.task1(scan);
            }
            else if (text.equals("2")){
                Tasks.task2(scan);
            }
            else if (text.equals("3")){
                Tasks.task3(scan);
            }
            else if (text.equals("4")){
                Tasks.task4(scan);
            }
            else if (text.equals("5")){
                Tasks.task5(scan);
            }
            else if (text.equals("6")){
                Tasks.task6(scan);
            }
            else if (text.equals("q")){
                break;
            }
        }
    }
}