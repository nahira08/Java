package OOP.AccessModifier.Package2;

import OOP.AccessModifier.Package1.KelasH;

public class KelasI extends KelasH {
    
    @Override
    protected void methodJ() {
        super.methodJ();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
