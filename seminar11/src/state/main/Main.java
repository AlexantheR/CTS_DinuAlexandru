package state.main;

import state.classes.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(2000);

        bancomat.introducePIN();
        bancomat.retrageCard();
        bancomat.introducePIN();
        bancomat.retrageBani(200);
        bancomat.introduceCard();
        bancomat.retrageBani(500);
        bancomat.introducePIN();
        bancomat.retrageBani(1000);
        bancomat.retrageCard();
    }
}
