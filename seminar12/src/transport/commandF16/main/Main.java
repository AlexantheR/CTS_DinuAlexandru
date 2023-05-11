package transport.commandF16.main;

import transport.commandF16.clase.Autobuz;
import transport.commandF16.clase.Automobil;
import transport.commandF16.clase.CommandPlecareInCursa;
import transport.commandF16.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args) {

        ManagerComenzi managerComenzi = new ManagerComenzi();
        Automobil autobuz = new Autobuz(13);
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(32)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}