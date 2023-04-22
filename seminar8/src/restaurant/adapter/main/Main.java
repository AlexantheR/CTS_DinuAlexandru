package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, double suma) {
        restaurant.printeazaNota(suma);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Apollo");
        bar.printeazaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("Mircea");
        bucatarie.printeazaNota(300);

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
        adapter.printeazaNota(1244);

        AdapterObiecteRestaurant aor = new AdapterObiecteRestaurant(bar);
        Main.imprimare(aor,12);
    }
}