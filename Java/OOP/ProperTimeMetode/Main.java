package OOP.ProperTimeMetode;

public class Main {
    public static void main(String[] args) {
        
    Manusia astral = new Manusia(18);
    astral.makan();
    astral.jalan();
    astral.lari();

    System.out.println("Umurnya adalah " + astral.getUmur());

    double bmi = astral.getBerat() / ((astral.getTinggi()* 0.01) * (astral.getTinggi()* 0.01));
    System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}
