package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("CL28ALX", 20);
        MijlocTransport autobuz1 = new Autobuz("CL30NOP", 40);

        Autobuz autobuz2 = (Autobuz) autobuz1.clone();
        Autobuz autobuz3 = (Autobuz) autobuz1.clone();
        autobuz2.setNrInmatriculare("CL45NUL");
        autobuz3.setNrInmatriculare("CL50CTS");

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
        System.out.println(autobuz3.toString());
    }
}
