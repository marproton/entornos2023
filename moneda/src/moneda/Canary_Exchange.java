package moneda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Canary_Exchange extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField importe;
	private JTextField cambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Canary_Exchange frame = new Canary_Exchange();
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
	public Canary_Exchange() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC10\\Documents\\2023-2024\\CURSO ESCOLAR 2023-2024\\ENTORNOS DE DESARROLLO\\casa de cambios\\logo.jpg"));
		setTitle("Canary Exchange");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 360, 542);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//..para centrar la ventana setLocationRelativeTo
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta_importe = new JLabel("AÑADIR IMPORTE");
		etiqueta_importe.setBounds(209, 22, 172, 53);
		etiqueta_importe.setForeground(SystemColor.textText);
		etiqueta_importe.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(etiqueta_importe);
		
		importe = new JTextField();
		importe.setHorizontalAlignment(SwingConstants.RIGHT);
		importe.setForeground(SystemColor.textHighlightText);
		importe.setFont(new Font("Verdana", Font.PLAIN, 20));
		importe.setBackground(SystemColor.textText);
		importe.setBounds(10, 72, 326, 81);
		contentPane.add(importe);
		importe.setColumns(10);
		
		JLabel cambiar = new JLabel("CAMBIO");
		cambiar.setForeground(SystemColor.textText);
		cambiar.setFont(new Font("Open Sans", Font.PLAIN, 14));
		cambiar.setBounds(265, 149, 81, 43);
		contentPane.add(cambiar);
		
		cambio = new JTextField();
		cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		cambio.setForeground(SystemColor.textHighlightText);
		cambio.setFont(new Font("Verdana", Font.PLAIN, 20));
		cambio.setColumns(10);
		cambio.setBackground(SystemColor.textText);
		cambio.setBounds(10, 188, 326, 81);
		contentPane.add(cambio);
		
		JButton Vdolar = new JButton("DOLAR");
		Vdolar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorimporte;
				double cambiom;
				double dolar=0.92;
				String input =importe.getText();
				if (input.matches("\\d+")) {
					valorimporte=Integer.parseInt(input);
					cambiom=valorimporte*dolar;
					cambio.setText(String.format("%.2f",cambiom)+ " Dolar");
				}else {
					cambio.setText("Ingrese un importe Valido");
				}
				
			}
		});
		Vdolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Vdolar.setBackground(SystemColor.textHighlightText);
		Vdolar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		Vdolar.setBounds(10, 297, 150, 69);
		contentPane.add(Vdolar);
		
		JButton Vlibras = new JButton("LIBRAS");
		Vlibras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorimporte;
				double cambiom;
				double libra=1.17;
				String input =importe.getText();
				if (input.matches("\\d+")) {
					valorimporte=Integer.parseInt(input);
					cambiom=valorimporte*libra;
					cambio.setText(String.format("%.2f",cambiom));
				}else {
					cambio.setText("Ingrese un importe Valido");
				}
				
				
			}
		});
		Vlibras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Vlibras.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		Vlibras.setBackground(SystemColor.textHighlightText);
		Vlibras.setBounds(186, 297, 150, 69);
		contentPane.add(Vlibras);
		
		JButton Vrublos = new JButton("RUBLOS");
		Vrublos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					int valor;
				    double calculo;
				    double rubloss = 2.5;

				    // Asumiendo que "importecambio" es un JTextField y "resultado" es un JLabel o JTextField
				    // Si "resultado" es un JTextField, puedes usarlo directamente en lugar de castear a JLabel

				    try {
				        valor = Integer.parseInt(importe.getText());
				        calculo = valor * rubloss;

				        // Usar setText para mostrar el resultado en "resultado"
				       cambio.setText(String.format("%.2f", calculo));
				    } catch (NumberFormatException ex) {
				        // Manejar la excepción si el valor ingresado no es un número entero válido
				        cambio.setText("Ingrese un número válido");
				    }
					
				}
			
		});
		Vrublos.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		Vrublos.setBackground(SystemColor.textHighlightText);
		Vrublos.setBounds(10, 376, 150, 69);
		contentPane.add(Vrublos);
		
		JButton Vyenes = new JButton("YEN");
		Vyenes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		Vyenes.setBackground(SystemColor.textHighlightText);
		Vyenes.setBounds(186, 376, 150, 69);
		contentPane.add(Vyenes);
	}

}
