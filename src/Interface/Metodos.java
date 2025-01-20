package Interface;

import java.util.List;

import Model.Clientes;

public interface Metodos {

	public void altaCliente(Clientes cliente);

	public void buscarNumCliente(Clientes cliente);

	public Clientes consultarSaldo(int numCuenta);

	public Clientes depositoEfectivo(int numCuenta);

	public void retiroEfectivo(String numCuenta, float Saldo);

}
