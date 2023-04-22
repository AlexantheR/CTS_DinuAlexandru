package restaurant.adapter.bar;

public class SoftBar implements ISoftBar {

    String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaBauturi(double totalPlata) {

        System.out.println("Barul " + this.denumire +
                " a emis nota totala de " + totalPlata);
    }
}
