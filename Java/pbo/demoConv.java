package pbo;
public class demoConv {
    public static void main(String[] args) {
        double meter = 1.00;

        System.out.printf("%.2f Meter = %.2f cm, %.2f mm%n",
        meter,
        meter * 100, 
        meter * 1000
        );
    }
}
