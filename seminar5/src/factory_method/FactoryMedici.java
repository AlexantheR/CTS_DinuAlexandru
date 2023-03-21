package factory_method;

public class FactoryMedici implements Factory{

    public PersonalSpital crearePersonal(String nume){
        return new Medic(nume);
    }
}
