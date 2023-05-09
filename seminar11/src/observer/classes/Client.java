package observer.classes;

public class Client implements IClient {
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void afiseazaMesaj(String mesaj) {
        System.out.println("Clientul " + this.numeClient + " a primit mesajul " + mesaj);
    }
}
