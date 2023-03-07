package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;
import cts.s02.principii_clean_code.clase.readere.ReaderAngajat;
import cts.s02.principii_clean_code.clase.readere.ReaderAplicant;
import cts.s02.principii_clean_code.clase.readere.ReaderStudent;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try {
            ReaderAplicant readerAngajat = new ReaderAngajat("angajati.txt");
            listaAngajati = readerAngajat.readAplicanti();
            Angajat.setSumaFinantata(10);
            for (Aplicant angajat : listaAngajati){
                System.out.println(angajat.toString());
                angajat.afisareFinantare();
                angajat.afisareStatut();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
