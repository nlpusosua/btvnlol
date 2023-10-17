package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thời gian bắt đầu trận đấu (yyyy/MM/dd HH:mm:ss) ");
        String timeStart = scanner.nextLine();
        LocalDateTime timeMatch = LocalDateTime.parse(timeStart, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        ArrayList<SKT> skt = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("nhập tên tướng đội SKT thứ"+(i+1)+":");
            String nameCham = scanner.nextLine();
            System.out.println("nhập vị trí tướng đội SKT thứ"+(i+1)+":");
            String position = scanner.nextLine();
            SKT skt1 = new SKT( nameCham, position );
            skt.add(skt1);
        }

        ArrayList<G2> g2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("nhập tên tướng đội G2 thứ"+(i+1)+":");
            String nameCham = scanner.nextLine();
            System.out.println("nhập vị trí tướng đội G2 thứ"+(i+1)+":");
            String position = scanner.nextLine();
            G2 g21 = new G2( nameCham, position );
            g2.add(g21);
        }
        SummonRift summonRift = new SummonRift(skt,g2,timeMatch );
        System.out.println(summonRift);



    }
}
