package stb.state.main;

import stb.state.clase.Bus;
import stb.state.clase.BusAtEndOfRoute;
import stb.state.clase.IBusState;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("VL21BUN");
        bus.goInService();
        bus.arriveAtEndOfRoute();
        bus.arriveAtEndOfRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtEndOfRoute();
    }
}
