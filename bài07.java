package btvn;

import java.util.Scanner;

public class bài07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    do {
        System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số");
        System.out.println("2.Kiểm tra số nguyên tố ");
        System.out.println("3.Kiểm tra một số có chia hết cho 3 không");
        System.out.println("4.Thoát");
        System.out.println("lựa chọn của bạn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Bạn vừa chọn kiểm tra tính chẵn lẻ của 1 số");
                break;
            case 2:
                System.out.println("Bạn vừa chọn Kiểm tra số nguyên tố");
                break;
            case 3:
                System.out.println("Ban vừa chọn Kiểm tra một số có chia hết cho 3 không");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.err.println("Vui lòng chọn từ 1-4");
    }
    }while (true);
    }
}

