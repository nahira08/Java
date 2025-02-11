package pbo;

import java.util.Scanner;
import java.time.Year;

public class demoCalcYearsOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

    
        System.out.println("Masukkan Tahun Kelahiran: ");
        int birthYear = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Umur anda: " + age);

        scanner.close();
    }
}
