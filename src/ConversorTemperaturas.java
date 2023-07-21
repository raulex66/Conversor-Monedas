import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ConversorTemperaturas {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperaturas window = new ConversorTemperaturas();
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
	public ConversorTemperaturas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 524, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBienvenidoAlConversor = new JLabel("Bienvenido al Conversor de Temperaturas");
		lblBienvenidoAlConversor.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoAlConversor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBienvenidoAlConversor.setBounds(10, 11, 498, 41);
		frame.getContentPane().add(lblBienvenidoAlConversor);
	}

}
