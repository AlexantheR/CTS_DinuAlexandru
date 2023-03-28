package builder.main;

import builder.model.BuilderPacient;
import builder.model.BuilderPacientV2;
import builder.model.IBuilder;
import builder.model.Pacient;

public class Main {
    public static void main(String[] args) {

        //VARIANTA 1
        IBuilder builderPacient = new BuilderPacient("Aleps");
        Pacient pacient = builderPacient.setHalatInterior(true).build();
        Pacient pacient2 = builderPacient.setMicDejunInclus(true).build();
        //pacient2.setMicDejunInclus(true);

        System.out.println(pacient.toString());
        System.out.println(pacient2.toString());


        System.out.println("------VARIANTA 2---------");

        IBuilder builderPacient2 = new BuilderPacientV2();
        Pacient pacient3 = builderPacient2.setNume("Gigel").setPapuciCamera(true).build();
        Pacient pacient4 = builderPacient2.setNume("Marcel").setPatRabatabil(true).build();
        System.out.println(pacient3.toString());
        System.out.println(pacient4.toString());
    }
}