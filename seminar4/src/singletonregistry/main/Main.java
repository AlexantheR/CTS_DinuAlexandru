package singletonregistry.main;

import singletonregistry.DomeniuWeb;

public class Main {
    public static void main(String[] args) {    //singleton registry
        DomeniuWeb domeniuWeb1 = DomeniuWeb.getDomeniu("seminar4.ro");
        DomeniuWeb domeniuWeb2 = DomeniuWeb.getDomeniu("seminar5.ro");
        DomeniuWeb domeniuWeb3 = DomeniuWeb.getDomeniu("seminar5.ro");

        domeniuWeb1.setAnInregistrare(2020);
        domeniuWeb2.setAnInregistrare(2021);
        domeniuWeb3.setAnInregistrare(2022);

        System.out.println(domeniuWeb2.toString());
        System.out.println(domeniuWeb1.toString());
        System.out.println(domeniuWeb3.toString());
    }
}
