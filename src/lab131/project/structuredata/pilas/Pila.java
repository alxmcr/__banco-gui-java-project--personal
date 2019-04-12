package lab131.project.structuredata.pilas;

import lab131.project.models.Transaccion;

class Pila extends PilaColaTransaccion {
	private int tope;

	private Pila(int max) {
		super(max);
		tope = 0;
	}

	boolean esvacia() {
		if (tope == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (tope == this.max)
			return (true);
		return (false);
	}

	private void adicionar(Transaccion elem) {
		if (!esllena()) {
			tope++;
			transacciones[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	private Transaccion eliminar() {
		Transaccion elem = new Transaccion();
		if (!esvacia()) {
			elem = transacciones[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	private void mostrar() {
		Transaccion elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			Pila aux = new Pila(max);
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				System.out.println(elem);
			}
			while (!aux.esvacia()) {
				elem = aux.eliminar();

				adicionar(elem);
			}
		}
	}

}
