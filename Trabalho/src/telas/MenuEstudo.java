package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;

public class MenuEstudo extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private HashMap <String, Aluno > alunos = new HashMap<String, Aluno>();

	
	public MenuEstudo(HashMap <String, Aluno > alunos) {
		setTitle("Portal");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		this.setAlunos(alunos);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(598, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estudo");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNewLabel.setBounds(249, 11, 153, 55);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("COMO ESTUDAR?");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(51, 153, 102));
		btnNewButton.setBounds(10, 84, 551, 81);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("CALENDÁRIO");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 30));
		btnNewButton_1.setBackground(new Color(51, 153, 102));
		btnNewButton_1.setBounds(10, 176, 551, 81);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		btnNewButton_2 = new JButton("SAIR");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Cambria", Font.PLAIN, 30));
		btnNewButton_2.setBackground(new Color(51, 153, 102));
		btnNewButton_2.setBounds(10, 268, 551, 81);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
	
		
		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(MenuEstudo.class.getResource("/telas/fudLogin.png")));
		lblNewLabel.setBounds(10, 11, 171, 52);
		contentPane.add(lblNewLabel);
	}


	public HashMap <String, Aluno > getAlunos() {
		return alunos;
	}


	public void setAlunos(HashMap <String, Aluno > alunos) {
		this.alunos = alunos;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			ComoEstudar menu = new ComoEstudar(alunos);
			menu.setVisible(true);
			setVisible(false);
		}
		if(e.getSource()==btnNewButton_2) {
			setVisible(false);
			
		}
		if(e.getSource()==btnNewButton_1) {
			Calendario tela = new Calendario(alunos);
			tela.setVisible(true);
			setVisible(false);
		}
		
	}
	
	
}
