package stb.state.clase;

public class BusInService implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " este in service");
            bus.setState(this);
        }
        else {
            System.out.println("Autobuzul nu poate ajunge la service!");
        }
    }
}
