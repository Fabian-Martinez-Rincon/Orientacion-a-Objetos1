package ar.edu.unlp.info.oo1.Parcial1;

import java.util.*;
import java.util.stream.Collectors;

public class Sistema {
	private List<Contribuyente> contribuyentes = new ArrayList<>();
	
	public void altaContribuyente(Contribuyente c) {
		this.contribuyentes.add(c);
	}
	
	public List<Contribuyente> masPagan(Integer n){
		return this.contribuyentes.stream().limit(n)
				.sorted((ex1, ex2) -> Double.compare (
				ex1.impuestosAPagar(),ex2.impuestosAPagar()
				))
				.collect(Collectors.toList());
	}
}
