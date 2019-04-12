package lab131.project.models;

public class Cajero extends Persona {

	private String codigoCajero;

	public String getCodigoCajero() {
		return codigoCajero;
	}

	public void setCodigoCajero(String codigoCajero) {
		this.codigoCajero = codigoCajero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cajero [codigoCajero=");
		builder.append(codigoCajero);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
