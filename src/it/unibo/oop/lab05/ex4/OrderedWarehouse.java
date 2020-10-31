package it.unibo.oop.lab05.ex4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WharehouseImpl;

public class OrderedWarehouse extends WharehouseImpl {

	public Set<Product> allProducts() {
		return new TreeSet<>(super.allProducts());
	}
	
}
