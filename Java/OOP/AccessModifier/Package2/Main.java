package OOP.AccessModifier.Package2;

import OOP.AccessModifier.Package1.KelasH;

public class Main {
    public static void main(String[] args) {
        
        // kode ini pasti akan mengalami kompiler error

        KelasH kelasH = new KelasH();

        //System.out.println(kelasH.functionI());

        //System.out.println(kelasH.memberI);
        //System.out.println(kelasH.memberJ);

        KelasI kelasI = new KelasI();
        kelasI.methodJ();
    }
}
