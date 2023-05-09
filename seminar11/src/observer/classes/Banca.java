package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca {
    public List<IClient> observatori;
    public String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.observatori = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient client) {
        this.observatori.add(client);
    }

    @Override
    public void stergeObserver(IClient client) {
        this.observatori.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
        for (IClient client : observatori) {
            client.afiseazaMesaj(mesaj);
        }
    }

    public void adaugaTipCreditNou() {
        notifica(this.numeBanca + ": Am adaugat un nou tip de credit!");
    }

    public void actualizeazaAplicatie() {
        notifica(this.numeBanca + ": aplicatia a fost actualizata!");
    }
}
