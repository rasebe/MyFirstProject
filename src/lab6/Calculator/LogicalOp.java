package lab6.Calculator;

import java.util.List;

public class LogicalOp {

    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
    // pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printList(List<Integer> listName) {
       for (int i : listName) {
            System.out.println(i);
    }
    }

    //Scrieti o metoda Java, care sa primeasca doi parametri: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addToList(List <Integer> list, int number) {
        list.add (number);
        }

    //Scrieti o metoda Java, care sa primeasca doi parametri: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
    // pornind de la numarul intreg primit ca si parametru.

    public void printFromPosition(List<Integer> myList, int position) {
        for (int i = position; i < myList.size() && i >= 0; i++) {
            System.out.println(myList.get(i));
        }
    }

    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
    // pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void printBackwards (List<Integer> newList) {
        for (int i = newList.size() - 1; i >= 0 ; i--) {
            System.out.println(newList.get(i));
        }
    }

    //Scrieti o metoda Java, care sa primeasca trei parametri: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg
    // reprezinta pozitia la care sa fie pus acel String.

    public void addString (List <String> anotherList, String string) {
        anotherList.add (2,string);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametri. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addElement (List <Integer> someList, int num) {
        someList.add(0,num);
    }

    //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void printIndex (List <String> thisList) {
        int index=0;
        for(String s : thisList){
            System.out.println("Pe pozitia "+(index++)+" valoarea este "+s);
        }
    }

    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int printLargest (List <Integer> intList) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<intList.size(); i++){
            if(intList.get(i) > max){
                max = intList.get(i);
            }
        }
        return max;
    }
}
