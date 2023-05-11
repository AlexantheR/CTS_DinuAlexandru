package state.classes;

public class StareNuAreCard implements IStare{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareAreCard || bancomat.getStare() instanceof StareArePinIntrodus){
            bancomat.setStare(this);
            System.out.println("A fost scos cardul din bancomat!");
        }
        else {
            System.out.println("Nu s-a introdus cardul!");
        }
    }
}
