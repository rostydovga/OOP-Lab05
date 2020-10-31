package it.unibo.oop.lab05.ex1;

import java.util.*;
import java.lang.Integer;
/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	 private static final int ELEMS = 20;
	
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
    	final Set<String> tree = new TreeSet<String>();
    	//2
    	for ( int i = 1; i <= ELEMS; i++) {
    		tree.add(Integer.toString(i));
    	}
    	
    	
    	//3
    	System.out.println("initial Set: " + tree);
    	
    	//4
    	final Iterator<String> iter = tree.iterator();
    	while (iter.hasNext()) {
    		if(Integer.parseInt(iter.next()) % 3 == 0) {
    			iter.remove();
    		}
    	}
    	
    	//5
    	//System.out.println("Print col for each");
    	for(String s: tree) {
    		System.out.println(s);
    	}
    	System.out.println(tree.toString());
    	
    	//6
    	final Set<String> set = new TreeSet<>();
    	for(int i = 2; i < ELEMS; i+=2) {
    		set.add(Integer.toString(i));
    	}
    	System.out.println("Elemnet: " + set);
    	System.out.println(set.containsAll(tree));
    	
    }
}
