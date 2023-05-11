package strategy.clase;

public class Calator {

    private String nume;
    private TipPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;

    }

    public TipPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(TipPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(double tarifBilet) {
        this.metodaPlata.plateste(tarifBilet);
    }
}