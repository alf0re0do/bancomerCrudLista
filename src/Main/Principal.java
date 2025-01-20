package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Clientes;

public class Principal {

	public static void main(String[] args) {

		Scanner lectura = null;
		int numCuenta;
		String nombre;
		float saldo;
		int menuPrincipal, subMenu, indice;

		Clientes cliente = null;

		LogicaMetodos imp = new LogicaMetodos();

		do {

			System.out.println("MENU BANCOMER BIENVENIDO");
			System.out.println("1----ALTA CLIENTE");
			System.out.println("2----CONSULTAR SALDO");
			System.out.println("3----DEPOSITO EFECTIVO");
			System.out.println("4----RETIRO EN EFECTIVO");
			System.out.println("5----SALIR");
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1:
				try {
					System.out.println("Ingrese la número de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();// polimorfismo puro

					System.out.println("Ingrese el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();// polimorfismo puro

					saldo = 0.0f;

					cliente = new Clientes(numCuenta, nombre, saldo);
					//

					imp.altaCliente(cliente);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erro al guardar " + e.getMessage());
				}

				break;
			case 2:
				try {

					System.out.println("Ingresa número de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					imp.consultarSaldo(numCuenta);

					if (imp.consultarSaldo(numCuenta) == null) {
						System.out.println("Esta cuenta no existe");
					} else {

						float saldoTotal = imp.consultarSaldo(numCuenta).getSaldo();
						String usuario = imp.consultarSaldo(numCuenta).getNombre();

						System.out.println(usuario + " Usted cuenta con un saldo de: " + saldoTotal);

					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Solo se admiten números " + e.getMessage());
				}

				break;
			case 3:
				try {

					System.out.println("Ingresa número de cuenta a depositar");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					cliente = imp.depositoEfectivo(numCuenta);
					float saldoActual = cliente.getSaldo();

					if (imp.depositoEfectivo(numCuenta) == null) {
						System.out.println("Esta cuenta no existe");
					} else {

						System.out.println("Ingresa la cantidad a depositar");
						lectura = new Scanner(System.in);
						saldo = lectura.nextInt();
						if (saldo > 0 && saldo <= 10000) {

							float deposito = saldoActual + saldo;
							cliente.setSaldo(deposito);

							System.out.println("Deposito exitoso saldo: " + imp.depositoEfectivo(numCuenta).getSaldo());

						} else {

							System.out.println("Solo se aceptan cantidades mayores a cero y menores a 10000 ");
						}

					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error solo se admiten números ");
				}

				break;
			case 4:

				try {

					System.out.println("Ingresa número de cuenta a retirar");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					cliente = imp.depositoEfectivo(numCuenta);
					float saldoActual = cliente.getSaldo();

					if (imp.depositoEfectivo(numCuenta) == null) {
						System.out.println("Esta cuenta no existe");
					} else {

						System.out.println("Ingresa la cantidad a retirar");
						lectura = new Scanner(System.in);
						saldo = lectura.nextInt();

						if (saldoActual > saldo) {

							if (saldo > 0 && saldo <= 10000) {

								float deposito = saldoActual - saldo;

								cliente.setSaldo(deposito);

								System.out
										.println("Retiro exitoso saldo: " + imp.depositoEfectivo(numCuenta).getSaldo());

							} else {

								System.out.println("Solo se aceptan cantidades mayores a cero y menores a 10000 ");
							}

						} else {

							System.out.println("Saldo insuficiente");
						}

					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error solo se admiten números ");
				}

				break;
			case 5:

				break;

			default:
				break;
			}

		} while (menuPrincipal < 5);

		// TODO Auto-generated method stub

	}

}
