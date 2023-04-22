package factory_method;

public class Medic implements PersonalSpital{   //method factory

    private String nume;

    protected Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + this.nume);
    }
}
