package com.example.domain_design_and_implementation;

import java.util.ArrayList;

public class Autogarage {

    private String locatie;
    private String naam;
    private ArrayList<Medewerker> medewerkers = new ArrayList<Medewerker>();
    private ArrayList<Auto> autos = new ArrayList<Auto>();

    public Autogarage(String locatie, String naam)
    {
        setLocatie(locatie);
        setNaam(naam);
    }

    public String getLocatie()
    {
        return locatie;
    }

    public void setLocatie(String locatie)
    {
        this.locatie = locatie;
    }

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public ArrayList<Medewerker> getMedewerkers()
    {
        return medewerkers;
    }

    public void setMedewerkers(Medewerker medewerker)
    {
        medewerkers.add(medewerker);
    }

    public ArrayList<Auto> getAutos()
    {
        return autos;
    }

    public void setAutos(Auto auto)
    {
        autos.add(auto);
    }

    public String toString()
    {
        return getNaam() + ":" + getLocatie();
    }

}
