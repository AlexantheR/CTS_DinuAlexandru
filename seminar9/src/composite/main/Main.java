package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Element autobuz1 = new Autobuz("Renault", 3000, 9);
        Element autobuz2 = new Autobuz("Mercedes", 3000, 7);

        Element grupAutobuzeMici = new Grup("GrupAutobuzeMici");
        grupAutobuzeMici.adaugaGrup(autobuz1);
        grupAutobuzeMici.adaugaGrup(autobuz2);
        grupAutobuzeMici.afisareSuma();


        Element autobuz3 = new Autobuz("Ford", 5000, 15);
        Element autobuz4 = new Autobuz("Mercedes", 4000, 20);

        Element grupAutobuzeMijlocii = new Grup("AutobuzeMijlocii");
        grupAutobuzeMijlocii.adaugaGrup(autobuz3);
        grupAutobuzeMijlocii.adaugaGrup(autobuz4);
        grupAutobuzeMijlocii.afisareSuma();


        Element flota = new Grup("Autobuze");
        flota.adaugaGrup(grupAutobuzeMici);
        flota.adaugaGrup(grupAutobuzeMijlocii);
        flota.afisareSuma();

        Element autobuzVIP = new Autobuz("VIP", 12000, 300);
        flota.adaugaGrup(autobuzVIP);
        flota.afisareSuma();
    }
}
