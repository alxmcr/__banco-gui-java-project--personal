package lab131.project.views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import lab131.project.constantes.DateStyles;
import lab131.project.models.Persona;
import utils.Utilitarios;

public class JPanelRegistroPersona extends JPanel {

	// TITLE JPANEL
	private JLabel tituloFormRegPersona;

	// LABELS
	private JLabel lblNombre;
	private JLabel lblPaterno;
	private JLabel lblMaterno;
	private JLabel lblDireccionPersona;
	private JLabel lblFechaNacimiento;

	// Cajas de Texto
	private JTextField cajaNombrePersona;
	private JTextField cajaPaternoPersona;
	private JTextField cajaMaternoPersona;
	private JTextArea cajaDireccionPersona;
	private JTextField cajaFechaNacimiento;

	// Button
	private JButton btnRegistrarPersona;
	private JButton btnCleanRegistrarPersona;

	public JPanelRegistroPersona() {
		setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(82dlu;pref):grow"),
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.GROWING_BUTTON_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.GROWING_BUTTON_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.GROWING_BUTTON_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		// TITULO
		tituloFormRegPersona = DefaultComponentFactory.getInstance().createTitle("Registro de Persona");
		tituloFormRegPersona.setFont(new Font("Tahoma", Font.BOLD, 16));

		// LABELs
		lblNombre = new JLabel("Nombre:");
		lblPaterno = new JLabel("Paterno:");
		lblMaterno = new JLabel("Materno");
		lblDireccionPersona = new JLabel("Direccion:");
		lblFechaNacimiento = new JLabel("Fecha Nacimiento (yyyy-mm-dd):");

		// INPUTS
		cajaNombrePersona = new JTextField();
		cajaNombrePersona.setColumns(10);
		cajaPaternoPersona = new JTextField();
		cajaPaternoPersona.setColumns(10);
		cajaMaternoPersona = new JTextField();
		cajaMaternoPersona.setColumns(10);
		cajaFechaNacimiento = new JTextField();
		cajaFechaNacimiento.setColumns(10);
		String fechaActual = Utilitarios.showCalendar(DateStyles.NORMAL, Calendar.getInstance());
		cajaFechaNacimiento.setText(fechaActual);

		// TEXT AREA
		cajaDireccionPersona = new JTextArea();

		// BUTTONS
		btnRegistrarPersona = new JButton("Registrar");
		btnCleanRegistrarPersona = new JButton("Limpiar");

		// ADD
		add(tituloFormRegPersona, "6, 4, 4, 1, center, default");
		add(lblNombre, "4, 8, right, default");
		add(cajaNombrePersona, "6, 8, 4, 1, fill, default");
		add(lblPaterno, "4, 10, right, default");
		add(cajaPaternoPersona, "6, 10, 4, 1, fill, default");
		add(lblMaterno, "4, 12, right, default");
		add(cajaMaternoPersona, "6, 12, 4, 1, fill, default");
		add(lblDireccionPersona, "4, 14, right, default");
		add(cajaDireccionPersona, "6, 14, 4, 1, fill, fill");
		add(lblFechaNacimiento, "4, 16, right, fill");
		add(cajaFechaNacimiento, "6, 16, 4, 1, fill, default");
		add(btnCleanRegistrarPersona, "9, 20");
		add(btnRegistrarPersona, "6, 20");

		// ACTIONS
		this.actionsButtonsRegistrarPersona();

	}

	private void actionsButtonsRegistrarPersona() {
		btnCleanRegistrarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Clean inputs...");
				cajaNombrePersona.setText("");
				cajaPaternoPersona.setText("");
				cajaMaternoPersona.setText("");
				cajaDireccionPersona.setText("");
				cajaFechaNacimiento.setText("");
			}
		});

		btnRegistrarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Registrar Persona");
				Persona persona = new Persona();

				String nombre = cajaNombrePersona.getText();
				String paterno = cajaPaternoPersona.getText();
				String materno = cajaMaternoPersona.getText();
				String direccion = cajaDireccionPersona.getText();
				String fechaNacimientoStr = cajaFechaNacimiento.getText();
				Calendar fechaNacimientoCal = Utilitarios.convertStringToCalendar(fechaNacimientoStr,
						DateStyles.NORMAL);

				persona.setNombre(nombre);
				persona.setPaterno(paterno);
				persona.setMaterno(materno);
				persona.setDireccion(direccion);
				persona.setFechaNacimiento(fechaNacimientoCal);

				System.out.println("New persona: " + persona);

			}
		});

	}

}