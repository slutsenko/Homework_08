package Homework_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        double money = scanner.nextDouble();
        System.out.println("Enter the period of deposit (years) : ");
        int year = scanner.nextInt();
        double percentPerMonth = 0.015;
        int month = year * 12;
        for ( int i = 0; i < month; i++) {
            double allMoney = money * percentPerMonth + money;
            money = allMoney;
            System.out.println(money);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(money));
    }
}