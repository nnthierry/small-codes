package basics;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = number.nextInt();

        int days;
        switch(month)
        {
            case 1:
                System.out.println("january");
            case 3:
                System.out.println("march");
            case 5:
                System.out.println("may");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 10:
                System.out.println("october");
            case 12:
                System.out.println("december");
                days = 31;
            break;
            case 4:
                System.out.println("april");
            case 6:
                System.out.println("june");
            case 9:
                System.out.println("september");
            case 11:
                System.out.println("november");
                days = 30;
            break;
            case 2:
                System.out.println("february");
                days = 28;
                break;
                default:
                days = -1;
            break;
        }
        if(days==-1)
        {
            System.out.println("invalid month number");
        }
        else
        {
            System.out.println(days+" days");
        }
    }
}
