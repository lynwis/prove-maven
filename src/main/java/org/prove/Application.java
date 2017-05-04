package org.prove;

import java.util.List;
import java.util.ArrayList;

public class Application {
	
	public List<String> lista;
    
    public Application() {
        System.out.println ("Inside Application");
		lista = new ArrayList<>();
		lista.add("Item1");
		
    }
	
	public void listAllItems() {
		for (String s : lista) {
			System.out.println(s);
		}
	}

    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.listAllItems();
		
    }
}