package btvn;

import java.util.Scanner;

public class bài08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh a của tam giác");
        int a = sc.nextInt();
        System.out.println("nhập cạnh b của tam giác");
        int b = sc.nextInt();
        System.out.println("nhập cạnh c của tam giác");
        int c = sc.nextInt();
        float p = (a+b+c)/2;
        if(a+b>c && a+c>b && b+c>a){
            float perimeter = (a+b+c);
            float area = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        System.out.printf("chuvi%f\tdientich%f",perimeter,area);
    }
}
