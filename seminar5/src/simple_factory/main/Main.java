package simple_factory.main;

import simple_factory.Asistent;
import simple_factory.Factory;
import simple_factory.PersonalSpital;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factoryPersonal = new Factory();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        PersonalSpital brancardier = factoryPersonal.createObject(TipPersonal.BRANCARDIER, "Gigel");
        PersonalSpital asistent = factoryPersonal.createObject(TipPersonal.ASISTENT, "Marcel");
        PersonalSpital medic = factoryPersonal.createObject(TipPersonal.MEDIC, "Frone");

        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add(medic);
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.MEDIC, "Ion"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.MEDIC, "Alex"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.ASISTENT, "Dan"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.ANESTEZIST, "Gabi", 10));

        for (PersonalSpital p : listaPersonal) {
            p.descriere();
        }


    }
}
