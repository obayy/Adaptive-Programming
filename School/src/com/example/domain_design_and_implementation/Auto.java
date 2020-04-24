package com.example.domain_design_and_implementation;

public class Auto {

    private String merk;
    private String naam;
    private double prijs;

    public Auto(String merk, String naam, double prijs)
    {
        setMerk(merk);
        setNaam(naam);
        setPrijs(prijs);
    }

    public String getMerk()
    {
        return merk;
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public double getPrijs()
    {
        return prijs;
    }

    public void setPrijs(double prijs)
    {
        this.prijs = prijs;
    }

    public String toString()
    {
        return getNaam() + ":" + getMerk() + ":" + getPrijs();
    }

}
