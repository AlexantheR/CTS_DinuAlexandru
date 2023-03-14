package classes;

public class Soare {
    //lazy initialization
    private static Soare instanta = null;
    private String culoare;
    private int dimensiune;

    private Soare(String culoare, int dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public static synchronized Soare getInstance(String culoare, int dimensiune) {
        if (instanta == null) {
            instanta = new Soare(culoare, dimensiune);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Soare{" +
                "culoare='" + culoare + '\'' +
                ", dimensiune=" + dimensiune +
                '}';
    }
}
