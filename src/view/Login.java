package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	private JLabel lbUsuario, lbSenha, lbTitulo;
	private JTextField txUsuario, txSenha;
	
	public Login() {

		setTitle("Login");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
		// setResizable(false);

		setLayout(null);
		
		//Título
		lbTitulo = new JLabel();
		lbTitulo.setText("Academia Angry Birds");
		lbTitulo.setBounds(330, 80, 150, 70);
		add(lbTitulo);
	
	

		setVisible(true);
}
	
	
}
