package Behavioral.Iterator;

public class Client {
    public static void main(String argv[]) {
    	Vector2 vector = new Vector2(5);
    	
    	//Creación del iterador
    	IteratorVector iterator = vector.iterator();
    	
    	//Recorrido con el iterador
    	while (iterator.hasNext())
            System.out.println(iterator.next());    	    	
    }
}
