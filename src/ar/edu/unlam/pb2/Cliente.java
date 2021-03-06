package ar.edu.unlam.pb2;

public class Cliente {
	
	private String nombre;
	private Double dinero;

public Cliente(String nombre, Double dinero){
	this.nombre=nombre;
	this.dinero=dinero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Double getDinero() {
	return dinero;
}

public void setDinero(Double dinero) {
	this.dinero = dinero;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	return true;
}
}
