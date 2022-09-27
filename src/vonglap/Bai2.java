package vonglap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1;
        int month = 1;
        double laiSuat = 1;
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        money = scanner.nextInt();
        System.out.println("Enter annual interest in percentage: ");
        laiSuat = scanner.nextDouble();
        double totalInterest = 0;
        for (int i=0; i< month;i++){
            totalInterest += money*(laiSuat/100)/12*month;
        }
        System.out.println("total of interest "+totalInterest);
    }
}
