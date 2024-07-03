package main.Materia.Controllers;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SetsClase {
    public SetsClase(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();
    }

    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana"); //Repetidos no se añaden
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("HashSet: "+conjunto);

        //Eliminar un elemento
        conjunto.remove("Banana");
        System.out.println("HashSet despues de eliminar 'Banana' ");
        conjunto.remove("Uvas");
        conjunto.remove("Piña");
        System.out.println("HashSet despues de eliminar: "+conjunto);

        //Verificar si un elemento existe
        boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("¿HashSet contiene 'Naranja'? "+contieneNaranja);

        //Obtener el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del HashSet: "+tamaño);
        
    }

    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        //Agregar elementos
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("LinkedHashSet: "+conjunto);
    }

    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        //Agregar elementos
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("TreeSet: "+conjunto);
    }

    public void construirTreeSetConComparador(){

    }

}
