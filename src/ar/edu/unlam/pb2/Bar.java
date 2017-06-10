package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Bar{
	
	private ArrayList <Cliente> clientes = new ArrayList <Cliente>();
	
	
public Integer obtenerCantidadDeClientes(){
	return clientes.size();
}

public ArrayList <Cliente> presentarClientes(){
	return clientes;
}


public void admitirClientes(Cliente cliente){
	clientes.add(cliente);
}
}