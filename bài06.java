package btvn;

import java.util.Scanner;

public class bài06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên tố");
        int n = Integer.parseInt(sc.nextLine());
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i != 0) {
                i+=1;
                i=20;
                break;
            }
        }

    }
}
