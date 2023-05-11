package state.classes;

public class Bancomat {
    private IStare stare;
    private Integer baniRamasi;

    public Bancomat(Integer baniRamasi) {
        this.baniRamasi = baniRamasi;
        stare = new StareNuAreCard();
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public void introduceCard(){
        IStare stare = new StareAreCard();
        stare.modificaStare(this);
    }

    public void introducePIN(){
        IStare stare = new StareArePinIntrodus();
        stare.modificaStare(this);
    }

    public void retrageBani(Integer sumaRetrasa){
        if(stare instanceof StareArePinIntrodus){
            if(baniRamasi >= sumaRetrasa){
                System.out.println("A fost retrasa suma de " + sumaRetrasa);
                this.baniRamasi = this.baniRamasi - sumaRetrasa;
                if(baniRamasi==0){
                    IStare stare = new StareNuAreCard();
                    stare.modificaStare(this);
                }
            }
        }
    }

    public void retrageCard(){
        IStare stare = new StareNuAreCard();
        stare.modificaStare(this);
    }
}
