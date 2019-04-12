package lab131.project.models;

public class Transaccion {
	private int idTransaccion;
	private Persona persona;
	private Cajero cajero;
	private double monto;
	private String tipo;

	public int getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaccion [idTransaccion=");
		builder.append(idTransaccion);
		builder.append(", persona=");
		builder.append(persona);
		builder.append(", cajero=");
		builder.append(cajero);
		builder.append(", monto=");
		builder.append(monto);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}
