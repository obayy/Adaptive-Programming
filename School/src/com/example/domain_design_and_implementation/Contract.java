package com.example.domain_design_and_implementation;

public class Contract {

    private double prijs;
    private Klant klant;
    private Auto auto;

    public Contract(double prijs, Klant klant, Auto auto)
    {
        setPrijs(prijs);
        setKlant(klant);
        setAuto(auto);
    }

    public double getPrijs()
    {
        return prijs;
    }

    public void setPrijs(double prijs)
    {
        this.prijs = prijs;
    }

    public Klant getKlant()
    {
        return klant;
    }

    public void setKlant(Klant klant)
    {
        this.klant = klant;
    }

    public Auto getAuto()
    {
        return auto;
    }

    public void setAuto(Auto auto)
    {
        this.auto = auto;
    }

    public String toString()
    {
        return getKlant().getNaam() + ":" + getAuto().getNaam() + ":" + getPrijs();
    }

}
