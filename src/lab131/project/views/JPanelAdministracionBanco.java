package lab131.project.views;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import java.awt.GridLayout;

public class JPanelAdministracionBanco extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelAdministracionBanco() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);

	}

}
