package Dijkstra_Shortest_Path_and_Datastructuren;

public class Vlucht extends Stap {

    public Vlucht(String name) { super(name); }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    private int price;

    @Override
    public int getValue() {
        setPrice(getDistance() * 2);
        return price;
    }
}
