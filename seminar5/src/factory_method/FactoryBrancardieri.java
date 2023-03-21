package factory_method;

public class FactoryBrancardieri implements Factory {
    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Brancardier(nume);
    }
}
