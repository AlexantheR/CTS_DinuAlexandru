package composite.clase;

import jdk.jshell.spi.ExecutionControl;

public interface Element {
    public float calculareSumaAsigurare();

    public void adaugaGrup(Element grupGeneral) throws ExecutionControl.NotImplementedException;

    public void stergeGrup(Element grupGeneral) throws ExecutionControl.NotImplementedException;

    public Element getGrup(int pozitie) throws ExecutionControl.NotImplementedException;
    public void afisareSuma();

}
