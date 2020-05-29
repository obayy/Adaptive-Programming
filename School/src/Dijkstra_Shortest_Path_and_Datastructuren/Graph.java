package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public void addNodes(Node... nodeA) {
        nodes.addAll(Arrays.asList(nodeA));
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }
}
