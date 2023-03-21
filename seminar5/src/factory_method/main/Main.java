package factory_method.main;

import factory_method.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factoryMedici = new FactoryMedici();
        Factory factoryAsistenti = new FactoryAsistenti();
        Factory factoryBrancardieri = new FactoryBrancardieri();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryAsistenti.crearePersonal("Ionescu"));
        listaPersonal.add(factoryMedici.crearePersonal("Andrei"));
        listaPersonal.add(factoryMedici.crearePersonal("Matei"));
        listaPersonal.add(factoryAsistenti.crearePersonal("Catalin"));
        listaPersonal.add(factoryBrancardieri.crearePersonal("Mihai"));

        for (PersonalSpital p : listaPersonal) {
            p.descriere();
        }
    }
}
