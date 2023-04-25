package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    private String denumireGrup;
    private List<Element> elemente;

    public Grup(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.elemente = new ArrayList<>();
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = 0;
        for (Element grupGeneral : elemente) {
            suma += grupGeneral.calculareSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaGrup(Element grupGeneral) {
        this.elemente.add(grupGeneral);
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        this.elemente.remove(grupGeneral);
    }

    @Override
    public Element getGrup(int pozitie) {
        return this.elemente.get(pozitie);
    }

    @Override
    public void afisareSuma() {
        System.out.println("Suma asigurare este de " + calculareSumaAsigurare());
    }
}
