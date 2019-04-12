package lab131.project.structuredata.pilas;

import lab131.project.models.Transaccion;

class PilaColaTransaccion {
	protected int max;
	protected Transaccion[] transacciones;

	protected PilaColaTransaccion(int max) {
		this.max = max;
		this.transacciones = new Transaccion[this.max];
	}
}
