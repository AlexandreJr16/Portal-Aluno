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

public class MenuAluno extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Nome2;
	private JLabel Ra2;
	private JButton Estudo;
	private JPanel panel;
	private JLabel Perfil8080;
	private JLabel lblNewLabel_2_1_1;
	private JButton Notas;
	private JButton Creditos;
	private JButton Sair;

	private HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
	private Aluno aluno = new Aluno();
	
	
	ImageIcon foto;

	public MenuAluno(HashMap <String, Aluno> alunos, Aluno aluno){	
		this.alunos = alunos;
		this.aluno = aluno;
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		setTitle("Portal");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(598, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBackground(new Color(153, 204, 204));
		panel.setBounds(386, 75, 153, 274);
		contentPane.add(panel);
		
		
		
		Nome2 = new JLabel("New label");
		Nome2.setText(aluno.getNome());
		Nome2.setBounds(27, 138, 124, 27);	
		panel.add(Nome2);
		
		Ra2 = new JLabel("New label");
		Ra2.setText(aluno.getLogin());
		Ra2.setBounds(27, 176, 124, 27);
		panel.add(Ra2);
		
		foto = aluno.getFoto();
		
		Perfil8080 = new JLabel(foto);
		Perfil8080.setBounds(35, 25, 84, 90);
		panel.add(Perfil8080);
		
		
		
		
		
		
		lblNewLabel_2_1_1 = new JLabel("Aluno");
		lblNewLabel_2_1_1.setBounds(0, 214, 97, 38);
		panel.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 102));
		
		Estudo = new JButton("Estudo");
		Estudo.setForeground(Color.WHITE);
		Estudo.setBackground(new Color(153, 204, 204));
		Estudo.setBounds(10, 11, 132, 33);
		contentPane.add(Estudo);
		Estudo.addActionListener(this);
		
		Notas = new JButton("Notas");
		Notas.setForeground(Color.WHITE);
		Notas.setBackground(new Color(153, 204, 204));
		Notas.setBounds(140, 11, 132, 33);
		contentPane.add(Notas);
		Notas.addActionListener(this);
		
		Creditos = new JButton("Créditos");
		Creditos.setForeground(Color.WHITE);
		Creditos.setBackground(new Color(153, 204, 204));
		Creditos.setBounds(269, 11, 132, 33);
		contentPane.add(Creditos);
		Creditos.addActionListener(this);
		
		Sair = new JButton("Sair");
		Sair.setForeground(Color.WHITE);
		Sair.setBackground(new Color(153, 204, 204));
		Sair.setBounds(397, 11, 145, 33);
		contentPane.add(Sair);
		Sair.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 57, 366, 210);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(MenuAluno.class.getResource("/telas/painel.jpeg")));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("Button.border"));
		panel_2.setBounds(10, 267, 180, 109);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(143, 188, 143));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuAluno.class.getResource("/telas/deusa__.jpg")));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(189, 267, 180, 109);
		panel_2_1.setBackground(new Color(143, 188, 143));
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MenuAluno.class.getResource("/telas/mulherBracoCruzado.jpg")));
		panel_2_1.add(lblNewLabel_1);
		
	}

	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Creditos) {
			JOptionPane.showMessageDialog(null, "Alexandre Pereira\nDanilo Magalhães\nJoão Carlos\nDavi Santos");
		}else
		if(e.getSource()==Estudo) {
			MenuEstudo menu = new MenuEstudo(alunos);
			menu.setVisible(true);
			
		}else
		if(e.getSource()==Notas) {
			aluno.VerNotas();
		}else
		if(e.getSource()==Sair) {
			TelaLogin tela = new TelaLogin(alunos);
			setVisible(false);
			tela.frame.setVisible(true);
		}
	}
	
	
}
