package restaurant.proxy.clase;

public class ProxyRestaurant implements IRestaurant {

    private IRestaurant restaurant;

    public ProxyRestaurant(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {
        if (nrPersoane >= 4) {
            this.restaurant.rezervaMasa(nrPersoane);
        } else {
            System.out.println("Nu s-a putut face rezervarea");
        }
    }
}
