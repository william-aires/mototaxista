package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLoginAdmin extends Tela implements ActionListener {
	private JTextField tfNome;
	private JTextField tfEmail;
	private JPasswordField tfSenha;

	public TelaLoginAdmin() {
		setTitle("Login do administrador");
		addLabels();
		addTextFilds();
		addButton();

		setVisible(true);
	}

	public void addLabels() {
		JLabel lbNome = new JLabel("Nome :");
		lbNome.setBounds(50, 110, 60, 20);
		lbNome.setFont(new Font("Arial", Font.ITALIC, 18));
		lbNome.setForeground(Color.WHITE);
		getBackgroundImg().add(lbNome);

		JLabel lbEmail = new JLabel("Email :");
		lbEmail.setBounds(50, 150, 60, 20);
		lbEmail.setFont(new Font("Arial", Font.ITALIC, 18));
		lbEmail.setForeground(Color.WHITE);
		getBackgroundImg().add(lbEmail);

		JLabel lbSenha = new JLabel("Senha :");
		lbSenha.setBounds(50, 190, 70, 20);
		lbSenha.setFont(new Font("Arial", Font.ITALIC, 18));
		lbSenha.setForeground(Color.WHITE);
		getBackgroundImg().add(lbSenha);

	}

	public void addTextFilds() {
		this.tfNome = new JTextField();
		tfNome.setBounds(130, 110, 200, 20);
		tfNome.setVisible(true);
		getBackgroundImg().add(tfNome);

		this.tfEmail = new JTextField();
		tfEmail.setBounds(130, 150, 200, 20);
		tfEmail.setVisible(true);
		getBackgroundImg().add(tfEmail);

		this.tfSenha = new JPasswordField();
		tfSenha.setBounds(130, 190, 200, 20);
		tfSenha.setVisible(true);
		getBackgroundImg().add(tfSenha);
	}

	public void addButton() {
		JButton btCadastrar = new JButton();
		btCadastrar.setText("Cadastrar admin");
		btCadastrar.setBounds(135, 220, 130, 20);
		getBackgroundImg().add(btCadastrar);

		// EVENTO DO BOTÃO
		btCadastrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaLoginAdmin tela = new TelaLoginAdmin();
	}

}
