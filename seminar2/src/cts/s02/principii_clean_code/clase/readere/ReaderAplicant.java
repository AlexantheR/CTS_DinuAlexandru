package cts.s02.principii_clean_code.clase.readere;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
    public String numeFisier;

    public ReaderAplicant(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public String getNumeFisier() {
        return numeFisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
}
