package stb.state.clase;

public class BusInRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " a ajuns la capatul liniei");
            bus.setState(this);
        }
        else {
            System.out.println("Autobuzul nu poate pleca intr-o cursa noua");
        }
    }
}
