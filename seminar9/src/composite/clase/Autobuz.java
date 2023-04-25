package composite.clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;
    private int numarLocuri;

    public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = 1.5f * this.capacitateCilindrica;
        return suma;
    }

    @Override
    public void adaugaGrup(Element grupGeneral) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Functia nu este valabila pentru clasa Autobuz");
    }

    @Override
    public void stergeGrup(Element grupGeneral) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Functia nu este valabila pentru clasa Autobuz");
    }

    @Override
    public Element getGrup(int pozitie) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Functia nu este valabila pentru clasa Autobuz");
    }

    @Override
    public void afisareSuma() {
        System.out.println("Suma de asigurare pentru autobuzul  " + this.producator + " este " + this.calculareSumaAsigurare());
    }


}
