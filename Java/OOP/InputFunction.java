package OOP;

public class InputFunction {
    public static void main(String[] args) {
        // Menyimpan hasil perhitungan ke variabel hasil
        double hasil = hitungLuas(7, 6.5);
        
        // Mencetak hasil
        System.out.println("Hasilnya adalah = " + hasil);
    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}