package cts.s02.principii_clean_code.clase;

public abstract class Aplicant {
    protected static Integer punctajAcceptare = 80;
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumiriProiect;


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumiriProiect = denumiriProiect;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisareStatut() {
        System.out.println("Aplicantul " + nume + " " + prenume + (this.punctaj > Aplicant.punctajAcceptare ? " " : " nu ") + "a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte) {
        this.nrProiecte = nrProiecte;
    }

    public abstract void afisareFinantare();
}
