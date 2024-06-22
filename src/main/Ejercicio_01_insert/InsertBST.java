package main.Ejercicio_01_insert;
import main.Materia.Models.Node;

public class InsertBST {

    //Metodo para insertar un valor en el BST
    //[5, 3, 7, 2, 4, 6, 8]
    //Node(5)

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        }else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }
    
} 