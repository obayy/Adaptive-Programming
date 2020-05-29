package Dijkstra_Shortest_Path_and_Datastructuren;

public class Treinrit extends Stap {

    public Treinrit(String name) { super(name); }

    public int getTijd() {
        return tijd;
    }

    public void setTijd(int tijd) {
        this.tijd = tijd;
    }

    private int tijd;

    @Override
    public int getValue() {
        setTijd(getDistance() / 10);
        return tijd;
    }
}
