package Dijkstra_Shortest_Path_and_Datastructuren;

public class Stap extends Node {

    private Reis reis;

    public Stap(String name) { super(name); }

    public void setReis(Reis reis) { this.reis = reis; }

    public Reis getReis() { return reis; }

    public Node getBeginNode() { return beginNode; }

    public void setBeginNode(Node beginNode) { this.beginNode = beginNode; }

    private Node beginNode;

    public Node getEndNode() { return endNode; }

    public void setEndNode(Node endNode) { this.endNode = endNode; }

    private Node endNode;

}
