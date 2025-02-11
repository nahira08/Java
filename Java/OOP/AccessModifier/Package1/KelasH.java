package OOP.AccessModifier.Package1;

public class KelasH {
    private int memberH = 5;

    char memberI = 'H';
    double memberJ = 1.5;

    private int functionH() {
        return memberH;
    }

    int functionI() {
        int hasil = functionH() + memberH;
        return hasil;
    }

    protected void methodJ() {
        System.out.println("Percobaan access modifier!!!");
    }
}
