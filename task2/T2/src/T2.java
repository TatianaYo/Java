// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 



package task2.T2.src;

import java.util.Scanner;

public class T2 {
    // private static void ComandOne(int a, int b) {
    //     // int K1 = a + 1;
    //      while (a < b){
    //          a = a + 1;
    //          System.out.println(a);
    //     }
        
    // }
    public static void main(String[] args) throws Exception {
        System.out.println("enter a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("enter b:");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        //ComandOne(a, b);
        if (a < b){
            while (a != b){
                a = a + 1;
            }
        }
        if (a >= b){
            System.out.println("Нет решения!");
        }
    }
}
