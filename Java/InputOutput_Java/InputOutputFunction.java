package InputOutput_Java;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjualan sangat seederhana");
        System.out.println("Masukkan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukkan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);

        scanner.close();
    }
}
