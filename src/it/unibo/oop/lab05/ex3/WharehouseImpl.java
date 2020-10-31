package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WharehouseImpl implements Warehouse {

	final private Set<Product> set = new LinkedHashSet<Product>();
	
	@Override
	public void addProduct(Product p) {
		this.set.add(p);
	}

	@Override
	public Set<String> allNames() {
		final var nomi = new TreeSet<String>();
		for(Product p: set) {
			nomi.add(p.getName());
		}
		return nomi;
	}

	@Override
	public Set<Product> allProducts() {
		return new HashSet<>(this.set);
	}

	@Override
	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for(Product p: set) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return 0;
	}

}
