package Main;

import Main.Materia.Controllers.ArbolBinario;
import Main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Node nodeRaiz = new Node(1);
        ArbolBinario arbolBinario = new ArbolBinario();
        nodeRaiz.setLeft(new Node(2));
        nodeRaiz.setRight(new Node(3));

        nodeRaiz.getLeft().setLeft(new Node(4));
        nodeRaiz.getLeft().setRight(new Node(5));

        nodeRaiz.getRight().setRight(new Node(6));
        nodeRaiz.getLeft().getLeft().setLeft(new Node(7));
        nodeRaiz.getLeft().getRight().setRight(new Node(8));

        System.out.println("PreOrder - Loop");
        arbolBinario.preeOrderLoop(nodeRaiz);
        System.out.println("");
        System.out.println("PreOrder - Recursivo");
        arbolBinario.preOrderRecursivo(nodeRaiz);
        System.out.println("");
        System.out.println("PostOrder - Loop");
        arbolBinario.postOrderLoop(nodeRaiz);
        System.out.println("");
        System.out.println("PostOrder - Recursivo");
        arbolBinario.postOrderRecursivo(nodeRaiz);
        System.out.println("");
        //System.out.println("InOrder - Loop");
        //arbolBinario.inOrderLoop(nodeRaiz);
        System.out.println("InOrder - Recursivo");
        arbolBinario.inOrderRecursivo(nodeRaiz);
    }
}
