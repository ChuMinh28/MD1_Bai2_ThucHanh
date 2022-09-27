package vonglap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num<2){
            System.out.println(num+"is not a prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i<num){
                if (num%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num+" is a prime ");
            else
                System.out.println(num+" is not a prime");
        }
    }
}
