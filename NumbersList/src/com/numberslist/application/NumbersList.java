package com.numberslist.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersList {

	public static void main(String[] args) {
		List<Integer> miLista= new ArrayList<Integer>();
		miLista.add(1);
		miLista.add(1);
		miLista.add(2);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);
		miLista.add(4);
	
		
		Set<Integer> hashSet = new HashSet<Integer>(miLista);
		for(Integer a: hashSet) {
			System.out.println(a);
		}
        for (Integer key : hashSet) {         
            if(Collections.frequency(miLista, key)==1) {
            	System.out.println("El numero repetido una sola vez es" + key );
            }
        }
		
	}

}
