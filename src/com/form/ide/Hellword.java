package com.form.ide;

import java.util.ArrayList;
import java.util.List;

public class Hellword {
    public static void main(String[] args) {

        Aa a = new Aa();
        System.out.println("hihihi"+a.getA());
        List<Aa>   aas = new ArrayList<Aa>();
        aas.add(a);
        aas.add(a);
        aas.add(a);
        for (Aa aa : aas) {
            System.out.println(aa.getA());
        }
    }
}
