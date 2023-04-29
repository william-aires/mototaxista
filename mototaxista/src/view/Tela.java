package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class Tela extends JFrame {
	private JLabel backgroundImg;

	public Tela() {
		this.backgroundImg = new JLabel();
		addConfigTela();
	}

	public void addConfigTela() {
		//TELA DIMENSÔES
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

		// BACKGROUND
		ImageIcon imgBackground = new ImageIcon("fundoInvertido.png");
		backgroundImg = new JLabel("", imgBackground, JLabel.CENTER);
		backgroundImg.setBounds(0, 0, 400, 400);
		add(backgroundImg);
		
		JLabel logotipo = new JLabel(" MOTO - TAXI");
		logotipo.setBounds(15, 20, 130, 50);
		logotipo.setFont(new Font("",Font.ITALIC,20));
		logotipo.setForeground(Color.WHITE);
		backgroundImg.add(logotipo);
		
	}

	public JLabel getBackgroundImg() {
		return backgroundImg;
	}

}
