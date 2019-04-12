package lab131.project.models;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

import lab131.project.constantes.DateStyles;
import utils.Utilitarios;

public class Persona {
	private String nombre;
	private String paterno;
	private String materno;
	private String direccion;
	private Calendar fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", paterno=");
		builder.append(paterno);
		builder.append(", materno=");
		builder.append(materno);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", fechaNacimiento=");
		builder.append(Utilitarios.showCalendar(DateStyles.NORMAL, fechaNacimiento));
		builder.append("]");
		return builder.toString();
	}
}
