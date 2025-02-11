package OOP.ProperTimeMetode;

public class Manusia {
    
    double tinggi = 158;
    double berat = 65;

    int umur;

    // konstruktor dengan parameter
    Manusia(int umur){
        this.umur = umur;
    }

    void lari() {
        System.out.println("Berlari dengan cepat..");
    }

    void makan() {
        System.out.println("Makan dengan menggunakan mulut..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur () {
        return umur;
    }
}
