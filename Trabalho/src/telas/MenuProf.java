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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Classes.Aluno;

public class MenuProf extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Nome2;
	private JLabel Ra2;
	private JButton Perfil;
	private JPanel panel;
	private JLabel Perfil8080;

	private JLabel lblNewLabel_2_1_1;
	private JButton estudo;
	private JButton Creditos;
	private JButton Sair;

	private HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
	
	MenuProf(HashMap<String, Aluno> alunos){
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		setTitle("Portal");
		this.alunos=alunos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(598, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		panel = new JPanel();
		panel.setBounds(386, 75, 153, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBackground(new Color(153, 204, 204));
		contentPane.add(panel);
		
		

		
		Nome2 = new JLabel("New label");
		Nome2.setText("Prof. Gabriel");
		Nome2.setBounds(27, 138, 124, 27);	
		panel.add(Nome2);
		
		Ra2 = new JLabel("New label");
		Ra2.setText("2 horas de sono");
		Ra2.setBounds(27, 176, 124, 27);
		panel.add(Ra2);
		
		
		Perfil8080 = new JLabel(new ImageIcon(getClass().getResource("Prof80.jpg")));
		Perfil8080.setBounds(35, 25, 84, 90);
		panel.add(Perfil8080);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 57, 366, 210);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(MenuProf.class.getResource("/telas/painel.jpeg")));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("Button.border"));
		panel_2.setBounds(10, 267, 180, 109);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(143, 188, 143));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuProf.class.getResource("/telas/deusa__.jpg")));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(189, 267, 180, 109);
		panel_2_1.setBackground(new Color(143, 188, 143));
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MenuProf.class.getResource("/telas/mulherBracoCruzado.jpg")));
		panel_2_1.add(lblNewLabel_1);
		
		
		
		lblNewLabel_2_1_1 = new JLabel("Professor");
		lblNewLabel_2_1_1.setBounds(10, 214, 97, 38);
		panel.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 102));
		
		Perfil = new JButton("Alunos");
		Perfil.setForeground(Color.WHITE);
		Perfil.setBackground(new Color(153, 204, 204));
		Perfil.setBounds(10, 11, 132, 33);
		contentPane.add(Perfil);
		Perfil.addActionListener(this);
		
		estudo = new JButton("Estudo");
		estudo.setForeground(Color.WHITE);
		estudo.setBackground(new Color(153, 204, 204));
		estudo.setBounds(140, 11, 132, 33);
		contentPane.add(estudo);
		estudo.addActionListener(this);
		
		Creditos = new JButton("Créditos");
		Creditos.setForeground(Color.WHITE);
		Creditos.setBackground(new Color(153, 204, 204));
		Creditos.setBounds(269, 11, 132, 33);
		contentPane.add(Creditos);
		Creditos.addActionListener(this);
		
		Sair = new JButton("Sair");
		Sair.setForeground(Color.WHITE);
		Sair.setBackground(new Color(153, 204, 204));
		Sair.setBounds(397, 11, 132, 33);
		contentPane.add(Sair);
		Sair.addActionListener(this);
		
		
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Creditos) {
			JOptionPane.showMessageDialog(null, "Alexandre Pereira\nDanilo Magalhães\nJoão Carlos\nDavi Santos");
		}else
		if(e.getSource()==Perfil) {
			ListaAlunos lista = new ListaAlunos(alunos);
			setVisible(false);
			lista.setVisible(true);
			
		}else
		if(e.getSource()==estudo) {
			MenuEstudo tela = new MenuEstudo(alunos);
			
			tela.setVisible(true);
			
		}else
		if(e.getSource()==Sair) {
			TelaLogin login = new TelaLogin(alunos);
			setVisible(false);
			login.frame.setVisible(true);
		}
	}
	
}
