package singletonregistry;

import java.util.HashMap;
import java.util.Map;

public class DomeniuWeb {
    private static Map<String, DomeniuWeb> domeniiWeb = new HashMap<>();
    private String nume;
    private int anInregistrare;

    private DomeniuWeb(String nume, int anInregistrare) {
        this.nume = nume;
        this.anInregistrare = anInregistrare;
    }

    public static DomeniuWeb getDomeniu(String nume) {
        if (domeniiWeb.containsKey(nume)) {
            return domeniiWeb.get(nume);
        } else {
            DomeniuWeb domeniuWeb = new DomeniuWeb(nume, 2023);
            domeniiWeb.put(nume, domeniuWeb);
            return domeniuWeb;
        }
    }

    public void setAnInregistrare(int anInregistrare) {
        this.anInregistrare = anInregistrare;
    }

    @Override
    public String toString() {
        return "DomeniuWeb{" +
                "nume='" + nume + '\'' +
                ", anInregistrare=" + anInregistrare +
                '}';
    }
}
