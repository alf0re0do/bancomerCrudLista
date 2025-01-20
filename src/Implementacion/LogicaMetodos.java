package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;

import Model.Clientes;

public class LogicaMetodos implements Metodos {

	private List<Clientes> lista = new ArrayList();

	@Override
	public void altaCliente(Clientes cliente) {

		boolean bandera = false;
		for (Clientes a : lista) {
			if (a.getNumCuenta() == (cliente.getNumCuenta())) {
				// si entra significa que la cliente existe
				System.out.println("El cliente ya existe");
				bandera = true;
				break;
			}

		}
		if (bandera == false) {

			lista.add(cliente);
			System.out.println("Guardado con exito " + cliente.getNombre());

		}

	}

	@Override
	public Clientes consultarSaldo(int numCuenta) {

		Clientes cliente = null;

		for (Clientes clientes : lista) {

			if (clientes.getNumCuenta() == numCuenta) {

				cliente = clientes;

				break;

			}

		}

		return cliente;
	}

	@Override
	public Clientes depositoEfectivo(int numCuenta) {

		Clientes cliente = null;

		for (Clientes clientes : lista) {

			if (clientes.getNumCuenta() == numCuenta) {

				cliente = clientes;

				break;

			}

		}

		return cliente;

		// TODO Auto-generated method stub

	}

	@Override
	public void buscarNumCliente(Clientes cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retiroEfectivo(String numCuenta, float Saldo) {
		// TODO Auto-generated method stub

	}

}
