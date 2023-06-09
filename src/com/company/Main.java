package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List <Integer> queue = new ArrayList<>();

    public static boolean menu(){
        while (true) {
            System.out.println("Ожидаю ввода следующего этажа: (для завершения введите 0)");
            int floor = scanner.nextInt();
            if(floor == 0){
                System.out.println("Программа завершена!");
                return  false;
            } else if (floor < 0 || floor > 25){
                System.out.println("Введен недопустимый этаж");
            }else{
                queue.add(floor);
            }

            }

            //Дополнительные проверки
        }
        public static void allQueue(){
            for (int i = 0; i < queue.size(); i++)
            {
                System.out.println("Этаж " + queue.get(i));
            }
        }
        public static void drivingTime(){
        int sek = 0;
            for (int i = 0; i < queue.size()-1; i++)
            {
                sek =sek + Math.abs(queue.get(i)-queue.get(i+1))*5+10;
            }
            System.out.println(sek + " секунд");
        }


    public static void main(String[] args) {
	menu();
    allQueue();
    drivingTime();

    }
}
