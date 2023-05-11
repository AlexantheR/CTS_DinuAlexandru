package transport.commandF16.clase;

public class CommandPlecareInCursa implements ICommand {
    private int numarLinie;
    private Automobil automobil;

    public CommandPlecareInCursa(int numarLinie, Automobil automobil) {
        this.numarLinie = numarLinie;
        this.automobil = automobil;
    }

    @Override
    public void executa() {
        automobil.plecareInCursa(this.numarLinie);
    }
}
