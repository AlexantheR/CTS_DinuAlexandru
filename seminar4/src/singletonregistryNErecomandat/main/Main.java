package singletonregistryNErecomandat.main;

import singletonregistryNErecomandat.Firma;
import singletonregistryNErecomandat.Registru;

public class Main {
    public static void main(String[] args) {
        Firma firma1 = Registru.getFirma("Amicii SRL");
        Firma firma2 = Registru.getFirma("Amicii SRL");
        Firma firma3 = Registru.getFirma("Mititei SRL");

        firma1.incheieContract(100);
        firma2.incheieContract(200);
        firma3.incheieContract(3000);

        System.out.println(firma1.toString());
        System.out.println(firma2.toString());
        System.out.println(firma3.toString());
    }
}
