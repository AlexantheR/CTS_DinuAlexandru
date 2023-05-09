package observer.main;

import observer.classes.Banca;
import observer.classes.Client;
import observer.classes.IBanca;
import observer.classes.IClient;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("BCR");
        IClient client = new Client("Marcel");
        IClient client2 = new Client("Gigel");
        IClient client3 = new Client("George");

        banca.actualizeazaAplicatie();
        banca.adaugaObserver(client);
        banca.adaugaTipCreditNou();
        banca.adaugaObserver(client2);
        banca.adaugaObserver(client3);
        banca.stergeObserver(client);

        banca.actualizeazaAplicatie();
    }
}