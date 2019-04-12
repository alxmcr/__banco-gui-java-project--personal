package lab131.project.structuredata.listas;

import lab131.project.models.Cuenta;

class LSimple extends ListaSimpleCuentas {
	LSimple() {
		super();
	}

	int nronodos() {
		int c = 0;
		NodoCuenta r = p;
		while (r != null) {
			c = c + 1;
			r = r.Sig;
		}
		return c;

	}

	boolean esvacia() {
		if (p == null)
			return true;
		return false;
	}

	void adicionarCuenta(Cuenta cuenta) {
		NodoCuenta w = new NodoCuenta();
		w.cuenta = cuenta;
		w.Sig = p;
		p = w;
	}

	void mostrar() {
		NodoCuenta r;
		r = p;
		while (r != null) {
			System.out.println(r.cuenta);
			r = r.Sig;
		}
	}

	NodoCuenta eliprimero() {
		NodoCuenta x;
		x = p;
		p = p.Sig;
		x.Sig = null;
		return x;
	}

	NodoCuenta eliultimo() {
		NodoCuenta x, r;
		x = r = p;
		if (r.Sig == null)
			p = null;
		else
			while (r.Sig != null) {
				x = r;
				r = r.Sig;
			}
		x.Sig = null;
		x = r;
		return (x);
	}

	void llevafinal() {
		NodoCuenta x, r;
		r = p.Sig;
		x = p;
		p = r;
		while (r.Sig != null)
			r = r.Sig;
		r.Sig = x;
		x.Sig = null;
	}

}
