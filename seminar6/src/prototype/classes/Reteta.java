package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype {

    private String numeReteta;
    private Float gramajMedicament;
    private HashMap<String, Float> solutii;

    public Reteta(String numeReteta, Float gramajMedicament,
                  HashMap<String, Float> solutii) {
        this.numeReteta = numeReteta;
        this.gramajMedicament = gramajMedicament;
        float suma = 0;
        for (Float valoare : solutii.values()) {
            suma += valoare;
        }
        if (this.gramajMedicament > suma - 0.1 &&
                this.gramajMedicament < suma + 0.1) {
            this.solutii = solutii;
        } else {
            throw new IllegalArgumentException("Gramaj eronat!");
        }
    }

    private Reteta() {
        numeReteta = null;
        gramajMedicament = null;
        solutii = null;
    }

    @Override
    public Prototype clonare() {
        //deep copy
        Reteta reteta = new Reteta();
        reteta.numeReteta = this.numeReteta;
        reteta.gramajMedicament = this.gramajMedicament;
        reteta.solutii = new HashMap<String, Float>();
        for (String val : this.solutii.keySet()) {
            reteta.solutii.put(val, this.solutii.get(val));
        }
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeReteta='" + numeReteta + '\'' +
                ", gramajMedicament=" + gramajMedicament +
                ", solutii=" + solutii +
                '}';
    }
}
