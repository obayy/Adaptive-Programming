package com.example.domain_design_and_implementation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Autogarage autogarageHU = new Autogarage("Utrecht", "Autogarage HU");
        Medewerker piet = new Medewerker("Piet", 22, autogarageHU);
        Medewerker hans = new Medewerker("Hans", 36, autogarageHU);

        System.out.println(autogarageHU.toString());
        System.out.println(piet.toString());
        System.out.println(hans.toString());

        Auto ferrari = new Auto("Ferrari", "Ferrari model1", 120121.12);
        Contract contract = new Contract(ferrari.getPrijs(), ferrari);
        Klant obay = new Klant("Obay", 18, contract);
        contract.setKlant(obay);
        autogarageHU.setAutos(ferrari);

        System.out.println(obay.toString());
        System.out.println(contract.toString());
        System.out.println(ferrari.toString());
    }

}
