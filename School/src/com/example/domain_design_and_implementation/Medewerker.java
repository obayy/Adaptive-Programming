package com.example.domain_design_and_implementation;

public class Medewerker implements Persoon {

    private String naam;
    private int leeftijd;
    private Autogarage autogarage;

    public Medewerker(String naam, int leeftijd, Autogarage autogarage)
    {
        setNaam(naam);
        setLeeftijd(leeftijd);
        setAutogarage(autogarage);
    }

    public Autogarage getAutogarage()
    {
        return autogarage;
    }

    public void setAutogarage(Autogarage autogarage)
    {
        this.autogarage = autogarage;
    }

    public String toString()
    {
        return getAutogarage().getNaam() + ":" + getNaam() + ":" + getLeeftijd();
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
