package template.main;

import template.classes.Bancomat;
import template.classes.BancomatAbstract;
import template.classes.BancomatBitcoin;

public class Main {
    public static void main(String[] args) {
        BancomatAbstract bancomat = new Bancomat("Romana");
        bancomat.scoateBaniDeLaBancomat(400);

        BancomatAbstract bancomatBitcoin = new BancomatBitcoin("Universitate");
        bancomatBitcoin.scoateBaniDeLaBancomat(1);
    }
}
