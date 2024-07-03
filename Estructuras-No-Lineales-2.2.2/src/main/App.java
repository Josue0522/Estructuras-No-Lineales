package main;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;
import main.Materia.Controllers.*;
/*
 *            ____1___
 *           /        \
 *          /           \
 *        2              3
 *      /    \          /
 *    4       5        6
 *  /        /
 * 7        8
 * 
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estructura de Datos No Lienales");
        runGraph();
        runSets();
}

    private static void runSets(){
        new SetsClase();
    }
    

    private static void runGraph() {
        Graph graph = new Graph();
        
        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);
        
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);

        //Imprime el grafo
        graph.printGraph();
    }
}
