package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.util.*;
public class Sistema {
	List<String> numeros = new ArrayList<String>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void agregarNumero(String numero) {
		this.numeros.add(numero);
	}
	
	public void altaPersonaFisica(Fisico fisico) {
		fisico.registrarNumero(this.numeros.remove(0));
		this.clientes.add(fisico);
	}
	
	public void altaPersonaJurida(Juridica juridica) {
		juridica.registrarNumero(this.numeros.remove(0));
		this.clientes.add(juridica);
	}
	
	public List<String> getNumeros(){
		return this.numeros;
	}
	
}
