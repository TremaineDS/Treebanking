package treesbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleGUI extends JFrame {

	private JPanel pnlContainer;
	private JLabel lblText;
	private JButton btnClickMe;

	public SampleGUI() {
		setSize(600, 400);
		setTitle("SampleGUI");

		pnlContainer = new JPanel();
		pnlContainer.setLayout(new FlowLayout());
		setContentPane(pnlContainer);

		lblText = new JLabel("Click the Button");
		pnlContainer.add(lblText);

		btnClickMe = new JButton("Click me");
		pnlContainer.add(btnClickMe);
		btnClickMe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Hello World!");
			}

		});

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				SampleGUI gui = new SampleGUI();
				gui.setVisible(true);
			}
		});
	}

}
