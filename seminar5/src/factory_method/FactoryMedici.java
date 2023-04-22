package factory_method;

public class FactoryMedici implements Factory{  //method factory

    public PersonalSpital crearePersonal(String nume){
        return new Medic(nume);
    }
}
