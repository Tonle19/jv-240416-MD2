package btvn;

import java.util.Scanner;

public class bài01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số tự nhiên");
        int n = scanner.nextInt();
        if (n%3==0&&n%5==0) {
           System.out.println("số này chia hết cho 3 và 5 ");
        }
        else {
            System.out.println("số này không chia hết cho 3 và 5");
        }
    }
}
