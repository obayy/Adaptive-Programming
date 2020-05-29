package Dijkstra_Shortest_Path_and_Datastructuren;

public class Rit extends Stap {

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    private int fuel;

    public Rit(String name) { super(name); }

    @Override
    public int getValue() {
        setFuel(getDistance() + 1);
        return fuel;
    }



}
