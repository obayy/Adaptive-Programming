package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {

    static PriorityQueue<Reis> reizen = new PriorityQueue<>();

    public static void main(String[] args) {
        Rit ritA = new Rit("Texas");
        Rit ritB = new Rit("Colorado");
        Rit ritC = new Rit("Utha");
        Rit ritD = new Rit("Neveda");
        Rit ritE = new Rit("Washington");
        Rit ritF = new Rit("Minesota");

        ritA.addDestination(ritB, 10);
        ritA.addDestination(ritC, 15);

        ritB.addDestination(ritD, 12);
        ritB.addDestination(ritF, 15);

        ritC.addDestination(ritE, 10);

        ritD.addDestination(ritE, 2);
        ritD.addDestination(ritF, 1);

        ritF.addDestination(ritE, 5);

        Graph graph = new Graph();
        graph.addNodes(ritA, ritB, ritC, ritD, ritE, ritF);
        graph = Dijkstra.calculateShortestPathFromSource(graph, ritA);

        Reis reis1 = new Reis();
        reis1.setStaps(getConvertedList(ritE));

        ////////////////////////////////////////////////////

        Rit ritG = new Rit("Wyoming");

        ritA.addDestination(ritG, 5);
        ritG.addDestination(ritE, 5);

        graph.addNode(ritG);
        graph = Dijkstra.calculateShortestPathFromSource(graph, ritA);

        Reis reis2 = new Reis();
        reis2.setStaps(getConvertedList(ritE));

        ////////////////////////////////////////////////////

        reizen.add(reis1);
        reizen.add(reis2);

        for (Reis reis: reizen) {
            reis.printRoute();
        }
    }

    public static List<Stap> convert(List<Node> nodeSet)
    {
        List<Stap> outputList = new ArrayList<>();

        Stap s = null;
        int counter = 0;
        for (Node node : nodeSet)
        {
            if (counter % 2 == 0)
            {
                s = new Stap("");
                s.setBeginNode(node);
                if (nodeSet.size() % 2 != 0 && nodeSet.size() - 1 == counter)
                {
                    s.setEndNode(node);
                    outputList.add(s);
                }
            }
            else
            {
                s.setEndNode(node);
                outputList.add(s);
            }
            counter++;
        }

        return outputList;
    }

    private static List<Stap> getConvertedList(Node end)
    {
        List<Node> nodes = end.getShortestPath();
        nodes.add(end);
        return convert(nodes);
    }

}
