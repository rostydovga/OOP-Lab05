package it.unibo.oop.lab05.ex1;

import java.util.*;
import java.lang.Integer;
/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	//1
    	TreeSet<String> tree = new TreeSet();
    	//2
    	for ( int i = 1; i <= 20; i++) {
    		tree.add(String.valueOf(i));
    	}
    	
    	
    	//3
    	System.out.println(tree.toString());
    	
    	//4
    	String[] s1 = new String[20];
    	int n = 0;
    	for(String s : tree) {
    		int num = Integer.parseInt(s);
    		//System.out.println("Valore % num = " + num%3);
    		if(num%3 == 0) {
    			//tree.iterator().remove();
    			s1[n] = s;
    			n++;
    		}
    	}
    	tree.removeAll(Arrays.asList(s1));
    	//System.out.println("s1 to string " + Arrays.asList(s1));
    	
    	//5
    	//System.out.println("Print col for each");
    	for(String s: tree) {
    		System.out.println(s);
    	}
    	System.out.println(tree.toString());
    	
    }
}
