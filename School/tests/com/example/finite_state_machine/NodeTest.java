package com.example.finite_state_machine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testSetConnections() {
        Node n1 = new Node("The node ended at N1");
        Node n2 = new Node("The node ended at N2");
        n1.setConnections(n1, n2);
        assertSame(n1.getNodeConnections().get(0), n1);
        assertSame(n1.getNodeConnections().get(1), n2);
    }

    @Test
    void testSetChances() {
        Node n1 = new Node("The node ended at N1");
        n1.setChances(0.5, 0.3, 0.2);
        assertEquals(n1.getNodeChances().get(0), 0.5);
        assertEquals(n1.getNodeChances().get(1), 0.3);
        assertEquals(n1.getNodeChances().get(2), 0.2);
    }

    @Test
    void testSetTransitions() {
        Node n1 = new Node("The node ended at N1");
        n1.setTransitions("A", "B", "C");
        assertEquals(n1.getNodeTransitions().get(0), "A");
        assertEquals(n1.getNodeTransitions().get(1), "B");
        assertEquals(n1.getNodeTransitions().get(2), "C");
    }

    @Test
    void testReadInput() {
        Node n1 = new Node("The node ended at N1");
        Node n2 = new Node("The node ended at N2");

        n1.setConnections(n2, n2);
        n1.setChances(1, 1);
        n1.setTransitions("A", "B");

        assertEquals(n1.readInput("A"), "The node ended at N2");
        assertEquals(n1.readInput("B"), "The node ended at N2");
    }

    @Test
    void testMainMachine()
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

        assertTrue(n1.readInput("BA").equals("You rolled 3") || n1.readInput("BA").equals("The node ended at N1"));
    }
}