import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class ConversorMonedas {

	JFrame frame;
	private JButton btnNewButton;
	private JComboBox<Moneda> cbValores;
	private JTextField lbValor;
	private JLabel lbl;
	
	public enum Moneda {
		Boliviano_a_Dólar, Boliviano_a_Euros, Boliviano_a_Libras_Esterlinas, Boliviano_a_Yen_Japonés,
		Boliviano_a_Won_sul_coreano, Dólar_a_Boliviano, Euros_a_Boliviano, Libras_Esterlinas_a_Boliviano,
		Yen_Japonés_a_Boliviano, Won_sul_coreano_a_Boliviano,
	}

	public double dolar=6.91;
	public double euro=7.69;
	public double libra=8.86;
	public double yen=0.049;
	public double won=0.0054;
	
	public double valorIngresado=0.0;
	public double resultado=0.0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorMonedas window = new ConversorMonedas();
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
	public ConversorMonedas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 448);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido al Conversor de Monedas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 545, 41);
		frame.getContentPane().add(lblNewLabel);

		btnNewButton = new JButton("Convertir");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Convertir();
			}

		});
		btnNewButton.setBounds(28, 196, 158, 23);
		frame.getContentPane().add(btnNewButton);

		lbValor = new JTextField();
		lbValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbValor.setBounds(28, 88, 158, 41);
		frame.getContentPane().add(lbValor);
		lbValor.setColumns(10);
		
		

		JLabel lblIngreseLaCantidad = new JLabel("Ingrese la Cantidad a Convertir");
		lblIngreseLaCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIngreseLaCantidad.setBounds(28, 49, 200, 41);
		frame.getContentPane().add(lblIngreseLaCantidad);

		cbValores = new JComboBox<Moneda>();
		cbValores.setModel(new DefaultComboBoxModel<Moneda>(Moneda.values()));
		cbValores.setToolTipText("");
		cbValores.setBounds(30, 152, 156, 33);
		frame.getContentPane().add(cbValores);

		JLabel lblSeleccioneAQue = new JLabel("Seleccione la divisa a convertir");
		lblSeleccioneAQue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSeleccioneAQue.setBounds(28, 121, 265, 41);
		frame.getContentPane().add(lblSeleccioneAQue);
		
		lbl = new JLabel("00.00");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl.setBounds(260, 100, 158, 47);
		frame.getContentPane().add(lbl);
	}

	// creacion de metodos
	private void Convertir() {
		if (SoloNumeros(lbValor.getText())) {
		Moneda moneda =(Moneda) cbValores.getSelectedItem();
		switch (moneda) {
		case Boliviano_a_Dólar:
			BolAMoneda(dolar);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Bolivianos son: "+Math.round(resultado*100.0)/100.0 +" dolares");
			break;
		case Boliviano_a_Euros:
			BolAMoneda(euro);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Bolivianos son: "+Math.round(resultado*100.0)/100.0 +" Euros");
			break;
		case Boliviano_a_Libras_Esterlinas:
			BolAMoneda(libra);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Bolivianos son: "+Math.round(resultado*100.0)/100.0 +" Libras");
			break;
		case Boliviano_a_Yen_Japonés:
			BolAMoneda(yen);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Bolivianos son: "+Math.round(resultado*100.0)/100.0 +" Yebn Japonés");
			break;
		case Boliviano_a_Won_sul_coreano:
			BolAMoneda(won);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Bolivianos son: "+Math.round(resultado*100.0)/100.0 +" Won Sur Coreano");
			break;
		case Dólar_a_Boliviano:
			MonedaABol(dolar);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Dolares son: "+Math.round(resultado*100.0)/100.0 +" Bolivianos");
			break;
		case Euros_a_Boliviano:
			MonedaABol(euro);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Euros son: "+Math.round(resultado*100.0)/100.0 +" Bolivianos");
			break;
		case Libras_Esterlinas_a_Boliviano:
			MonedaABol(libra);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Libras son: "+Math.round(resultado*100.0)/100.0 +" Bolivianos");
			break;
		case Yen_Japonés_a_Boliviano:
			MonedaABol(yen);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Yen Japones son: "+Math.round(resultado*100.0)/100.0 +" Bolivianos");
			break;
		case Won_sul_coreano_a_Boliviano:
			MonedaABol(won);
			JOptionPane.showMessageDialog(null,lbValor.getText()+" Won Sur Coreano son: "+Math.round(resultado*100.0)/100.0 +" Bolivianos");
			break;
			
		default:
			JOptionPane.showMessageDialog(null,"Valor invalido");
			
		}
		}
		
	}

	public void BolAMoneda(double moneda) {
		resultado= Double.parseDouble(lbValor.getText())/moneda;
		lbl.setText(""+Math.round(resultado*100.0)/100.0);
		
	}

	public void MonedaABol(double moneda) {
		 resultado= Double.parseDouble(lbValor.getText())*moneda;
		lbl.setText(""+Math.round(resultado*100.0)/100.0);
		
	}
	public boolean SoloNumeros(String valor) {
		try {
			double n=Double.parseDouble(valor);
			if (n>0);
			valorIngresado=n;
			return true;
				}
		catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null,"Debe ingresar solo numeros, gracias");
			return false;
			
		}
	}

}
