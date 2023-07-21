import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Conversor {

	private JFrame frame;
	private JButton btnConversor;
	private JButton btnTemperatura;
	private JButton btnLongitud;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnConversor = new JButton("Conversor de Monedas");
		btnConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ConversorMonedas window1 = new ConversorMonedas();
							window1.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			}
		});
		btnConversor.setBounds(78, 39, 155, 34);
		frame.getContentPane().add(btnConversor);

		JLabel lblNewLabel = new JLabel("Seleccione la opcion que desea:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(218, 0, 267, 45);
		frame.getContentPane().add(lblNewLabel);

		btnTemperatura = new JButton("Conversor de Temperaturas");
		btnTemperatura.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ConversorTemperaturas window1 = new ConversorTemperaturas();
							window1.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnTemperatura.setBounds(260, 39, 155, 34);
		frame.getContentPane().add(btnTemperatura);

		btnLongitud = new JButton("Conversor de Longitud");
		btnLongitud.setBounds(456, 39, 155, 34);
		frame.getContentPane().add(btnLongitud);

		JPanel panelConversor = new JPanel();
		panelConversor.setBounds(31, 96, 644, 151);
		frame.getContentPane().add(panelConversor);

		JButton btnNewButton = new JButton("New button");
		panelConversor.add(btnNewButton);
	}
}
