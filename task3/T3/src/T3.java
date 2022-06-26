// Написать программу вычисления n-ого треугольного числа.
package task3.T3.src;

import java.util.Scanner;

public class T3 {
    private static void TriangularNumber(int n) {
        int F = (n*(n+1)/2); 
        System.out.println("F = " + F);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TriangularNumber(n);
    }
}
