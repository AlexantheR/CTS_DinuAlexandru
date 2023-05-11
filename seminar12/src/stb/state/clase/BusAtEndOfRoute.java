package stb.state.clase;

public class BusAtEndOfRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInRoute || bus.getState() instanceof BusInService){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " a ajuns la capatul liniei");
            bus.setState(this);
        }
        else{
            System.out.println("Autobuzul nu poate ajunge la finalul liniei!");
        }
    }
}
