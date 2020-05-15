package com.example.finite_state_machine;

import java.util.ArrayList;

public class Node {

    private String sequenceEnd;
    private ArrayList<Node> nodeConnections = new ArrayList<Node>();
    private ArrayList<Double> nodeChances = new ArrayList<Double>();
    private ArrayList<String> nodeTransitions = new ArrayList<String>();

    public Node(String sequenceEnd)
    {
        this.sequenceEnd = sequenceEnd;
    }

    public void setConnections(Node... nodes)
    {
        for (Node n : nodes) {
            nodeConnections.add(n);
        }
    }

    public void setChances(double... chances)
    {
        for (double chance: chances) {
            nodeChances.add(chance);
        }
    }

    public void setTransitions(String... transitions)
    {
        for (String transition: transitions) {
            nodeTransitions.add(transition);
        }
    }

    public String readInput(String input)
    {
        double rand = Math.random();
        double c = 0;
        for (int i = 0; i < nodeConnections.size(); i++) {
            if (rand <= nodeChances.get(i) + c && nodeTransitions.get(i).equals(input.substring(0, 1))) {
                String inputString = (input.length() > 1) ? input.substring(1) : input;
                return nodeConnections.get(i).readInput(inputString);
            }
            c += nodeChances.get(i);
        }

        return sequenceEnd;
    }

}
