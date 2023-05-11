package strategy.main;

import strategy.clase.Calator;
import strategy.clase.PlataCardBancar;
import strategy.clase.PlataCardCalatorii;
import strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Aleps");

        calator.platesteBilet(10);
        calator.setMetodaPlata(new PlataSMS());

        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardBancar());

        calator.platesteBilet(30);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(11);
    }
}
