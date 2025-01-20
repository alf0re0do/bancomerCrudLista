package Model;

public class Clientes {

	private int numCuenta;
	private String nombre;
	private float saldo;

	// COSNTRUCTOR VACIO
	public Clientes() {

	}

//cONSTRUCTOR CON ATRIBUTOS
	public Clientes(int numCuenta, String nombre, float saldo) {
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	// ENCAPSULAMIENTO

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
