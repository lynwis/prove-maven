package org.prove;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public List<String> lista;
    
    public Application() {
        System.out.println ("Inside Application");
		lista = new ArrayList<>();
		lista.add("Item1");
		
    }
	
	public int countWords(String text) {
		String[] words = StringUtils.split(text, ' ');
		return (words == null) ? 0 : words.length;
	}
	
	public void listAllItems() {
		for (String s : lista) {
			System.out.println(s + " (" + countWords(s) + ")");
		}
	}

    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.listAllItems();
		
		
		
    }
}