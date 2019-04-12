package lab131.project.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class FrameRegistroPersona extends JFrame {

	private JPanelRegistroPersona registroPersonaPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameRegistroPersona frame = new FrameRegistroPersona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameRegistroPersona() {
		setTitle("LAB-131: BANCO \"EL MAS RICO\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 469);
		registroPersonaPanel = new JPanelRegistroPersona();
		registroPersonaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		// registroPersonaPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(registroPersonaPanel);
	}

}
