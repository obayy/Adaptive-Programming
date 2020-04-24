package com.example.domain_design_and_implementation;

public class Klant implements Persoon {

    private String naam;
    private int leeftijd;
    private Contract contract;

    public Klant(String naam, int leeftijd, Contract contract)
    {
        setNaam(naam);
        setLeeftijd(leeftijd);
        setContract(contract);
    }

    public Contract getContract()
    {
        return contract;
    }

    public void setContract(Contract contract)
    {
        this.contract = contract;
    }

    public String toString()
    {
        return getContract().getAuto().getNaam() + ":" + getNaam() + ":" + getLeeftijd();
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
