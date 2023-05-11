package strategy.clase;

public class PlataSMS implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost realizata prin SMS, in valoare de " + pretBilet);
    }
}