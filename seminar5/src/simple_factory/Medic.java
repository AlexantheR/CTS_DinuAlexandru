package simple_factory;

public class Medic implements PersonalSpital {  //simple factory

    private String nume;

    protected Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + this.nume);
    }
}
