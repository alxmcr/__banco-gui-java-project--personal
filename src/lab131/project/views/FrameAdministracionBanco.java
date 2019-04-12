package lab131.project.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FrameAdministracionBanco extends JFrame {

	private JPanel contentPane;

	// TOOLBAR
	private JMenuBar menuBar;

	// MENU
	private JMenu mnNewMenu;

	// ITEM MENU
	private JMenuItem mntmRegistrarPersona;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAdministracionBanco frame = new FrameAdministracionBanco();
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
	public FrameAdministracionBanco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);

		// TOOLBAR
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// MENU
		mnNewMenu = new JMenu("Options");

		// ITEM MENU
		mntmRegistrarPersona = new JMenuItem("Registrar Persona");
		mnNewMenu.add(mntmRegistrarPersona);

		menuBar.add(mnNewMenu);

		// panel = new JPanel();
		// getContentPane().add(panel, BorderLayout.CENTER);

		JPanelRegistroPersona panelRegistrarPersona = new JPanelRegistroPersona();
		getContentPane().add(panelRegistrarPersona);
		getContentPane().getComponent(0).setVisible(false);
		
		this.actionsBanco();
		

	}

	private void actionsBanco() {

		mntmRegistrarPersona.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().getComponent(0).setVisible(true);
			}
		});

	}

}
