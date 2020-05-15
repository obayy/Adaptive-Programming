package com.example.finite_state_machine;

public class Main {

    public static void main(String[] args)
    {
        Node n1 = new Node("The node ended at N1");
        Node n2 = new Node("The node ended at N2");
        Node d1 = new Node("You rolled 3");

        n1.setConnections(n1, n2, d1);
        n1.setChances(0.5, 0.3, 0.2);
        n1.setTransitions("A", "B", "A");

        n2.setConnections(d1);
        n2.setChances(1);
        n2.setTransitions("A");

        System.out.println(n1.readInput("BA"));
    }

}
