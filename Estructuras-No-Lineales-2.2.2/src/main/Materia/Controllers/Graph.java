package main.Materia.Controllers;
import java.util.List;
import java.util.ArrayList;

import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;

public class Graph {

    private List<NodeGraph> nodes;
    public Graph(){
        this.nodes = new ArrayList<>();
    }
    public NodeGraph addNode(int value){
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }
    public void addEdge(NodeGraph src,NodeGraph dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void printGraph(){
        for(NodeGraph node : nodes){
            System.out.print("Vertex "+ node.getValue()+ ":");
            for(NodeGraph neighbor : node.getNeighbor()){
                System.out.print(" -> "+ neighbor.getValue());
            }
            System.out.println("");
        }

    }
    public getDFS(Node starNode){
        
    }
    private getDFSUtil(Node node, boolean[]visited){

    }
    public void getBFS(Node starNode){

    }
    public int [][]getAdjacencyMatrix(){

    }
    public void printAdjacencyMatrix(){

    }

    
}

