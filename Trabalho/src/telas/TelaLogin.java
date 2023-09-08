package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;
import Classes.Professor;



public class TelaLogin implements ActionListener{
	
	
	public JFrame frame = new JFrame();
	private JPanel contentPane;
	private JTextField LoginField;
	private JButton LoginButton;
	private JLabel LoginLabel;
	private JLabel Perfil;
	private JPasswordField passwordField;
	private JLabel SenhaLabel;
	private JLabel esqueci;
	private JButton esqueci1;
	private Professor prof = new Professor();
	private JLabel lblNewLabel;
	
	HashMap<String, Aluno> infoAluno = new HashMap<String, Aluno>();
	
	public TelaLogin(HashMap <String, Aluno> infoAluno){
		frame.setTitle("Portal");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));		
		prof.setNome("Gabriel");
		prof.setSenha("123");
		prof.setLogin("Gabriel");
		this.infoAluno=infoAluno;
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 450);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Portal");
		contentPane = new JPanel();
		frame.add(contentPane);
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("fudLogin.png")));
		lblNewLabel.setBounds(10, 11, 171, 52);
		contentPane.add(lblNewLabel);
		
		Perfil = new JLabel("");
		frame.add(Perfil);
		Perfil.setIcon(new ImageIcon(getClass().getResource("Perfil.png")));
		Perfil.setBounds(223, 39, 163, 162);
		contentPane.add(Perfil);
		
		LoginField = new JTextField();
		frame.add(LoginField);
		LoginField.setBounds(193, 243, 200, 23);
		contentPane.add(LoginField);
		LoginField.setColumns(10);
		
		LoginLabel = new JLabel("Login / RA");
		frame.add(LoginLabel);
		LoginLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		LoginLabel.setBounds(193, 229, 88, 14);
		contentPane.add(LoginLabel);
		
		SenhaLabel = new JLabel("Senha");
		frame.add(SenhaLabel);
		SenhaLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		SenhaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		SenhaLabel.setBounds(193, 278, 65, 14);
		contentPane.add(SenhaLabel);
		
		LoginButton = new JButton("Login");
		frame.add(LoginButton);
		LoginButton.setForeground(new Color(255, 255, 255));
		LoginButton.setBackground(new Color(0, 0, 0));
		LoginButton.setBounds(303, 330, 90, 23);
		contentPane.add(LoginButton);
		LoginButton.addActionListener(this);
		
		
		esqueci = new JLabel("Esqueceu a senha?");
		esqueci.setFont(new Font("Tahoma", Font.ITALIC, 9));
		esqueci.setForeground(Color.BLUE);
		esqueci.setBackground(Color.WHITE);
		esqueci.setBounds(193, 330, 93, 14);
		mouse enter = new mouse();
		esqueci.addMouseListener(enter);
		contentPane.add(esqueci);
		
		
		
		
		passwordField = new JPasswordField();
		frame.add(passwordField);
		passwordField.setBounds(190, 292, 200, 23);
		contentPane.add(passwordField);
		
		
		
	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==esqueci1) {
			JOptionPane.showMessageDialog(null, "Login: Gabriel\nSenha: 10");
		}
		
		if(e.getSource()==LoginButton) {
			
			String id = LoginField.getText();
			String password = String.valueOf(passwordField.getPassword());
			
			if(infoAluno.containsKey(id)) {
				if(infoAluno.get(id).getSenha().equals(password)) {

					MenuAluno menu = new MenuAluno(infoAluno, infoAluno.get(id));
					frame.setVisible(false);
					menu.setVisible(true);
					
				}else 
				 {
				JOptionPane.showMessageDialog(null, "Senha incorreta");
				passwordField.setText("");}
			}else
				if(id.equals(prof.getLogin())&&password.equals(prof.getSenha())){
					MenuProf menu = new MenuProf(infoAluno);
					menu.setVisible(true);
					frame.setVisible(false);
				}else {
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
			passwordField.setText("");
			LoginField.setText("");}
		}
		
		
	}
	
	
	public class mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "Login: Gabriel\nSenha: 123");
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		
	}
	
}
