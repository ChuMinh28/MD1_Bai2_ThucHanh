package vonglap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b =scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b== 0){
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if (a>b){
                a = a -b;
                System.out.println("a = "+a);
            }else {
                b = b - a ;
                System.out.println("b = "+b);
            }
        }
        System.out.println("Greatest common factor: "+a);
    }
}
