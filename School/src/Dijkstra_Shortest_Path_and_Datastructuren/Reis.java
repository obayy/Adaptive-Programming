package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable<Reis> {

    @Override
    public int compareTo(Reis o) {
        int other = 0;
        for (Stap stap : o.staps)
        {
            other += stap.getEndNode().getValue();
        }
        int own = 0;
        for (Stap stap : staps)
        {
            own += stap.getEndNode().getValue();
        }

        return own - other;
    }

    private List<Stap> staps = new ArrayList<>();

    public void setStaps(List<Stap> staps) { this.staps = staps; }

    public List<Stap> getStaps() { return staps; }

    public void printRoute()
    {
        for(Stap stap : getStaps())
        {
            System.out.println(stap.getBeginNode().getName());
            System.out.println(stap.getEndNode().getName());
        }
        System.out.println("\n");
    }

}
