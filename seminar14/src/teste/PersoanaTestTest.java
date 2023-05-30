package teste;

import dubluri.StubPersoana;
import dubluri.StubPersoanaMinora;
import models.IPersoana;
import models.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTestTest {
    @Test
    void poateRezervaraPachet(){
        StubPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Dubai", 1500.0);
        assertTrue(pachet.poateRezerva());
    }

    @Test
    void nuPoateRezervaPachet(){
        IPersoana persoana = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti", 50.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
}