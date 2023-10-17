package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cham> chams = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("nhập tên người chơi đội SKT thứ"+(i+1));
            String name = scanner.nextLine();
            System.out.println("nhập vị trí người chơi đội SKT thứ"+(i+1));
            String position = scanner.nextLine();
            Cham cham = new Cham(name, position);
            chams.add(cham);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("nhập tên người chơi đội G2 thứ"+(i+1));
            String name = scanner.nextLine();
            System.out.println("nhập vị trí người chơi đội G2 thứ"+(i+1));
            String position = scanner.nextLine();
            Cham cham = new Cham(name, position);
            chams.add(cham);
        }

        System.out.println("Tên và các vị trí tuyển thủ là:" +chams);

    }
}
