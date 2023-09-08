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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;

public class ListaAlunos extends JFrame implements ActionListener, MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JLabel lblTemTdah;
	private JPanel panelAlexandre;
	private JLabel FotoAlexandre;
	private JLabel Nometxt;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private JPanel DaviPane_1;
	private JLabel lblNewLabel_3_1_1_1;
	private JPanel panelJoao; 
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JLabel lblNewLabel_3_1;
	private JLabel lblLittleJohn;
	private JButton btnNewButton;
	private JPanel DaviPane;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_4_1_1;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_3_1_1;
	private JLabel lblLrioDoVale;
	private JLabel lblNewLabel_1_1_1_1;
	private HashMap <String, Aluno > alunos;

	
	public ListaAlunos(HashMap <String, Aluno> alunos) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		setTitle("Portal");
		this.alunos=alunos;
		setIconImage(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(598, 459);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelAlexandre = new JPanel();
		panelAlexandre.setBackground(new Color(153, 204, 204));
		panelAlexandre.setBounds(70, 10, 140, 200);
		contentPane.add(panelAlexandre);
		panelAlexandre.setLayout(null);
		panelAlexandre.addMouseListener(this);
		
		FotoAlexandre = new JLabel(new ImageIcon(getClass().getResource("Ale.jpg")));
		panelAlexandre.add(FotoAlexandre);
		FotoAlexandre.setBounds(30, 11, 80, 80);
		
		Nometxt = new JLabel("Alexandre");
		Nometxt.setBounds(10, 105, 64, 14);
		panelAlexandre.add(Nometxt);
		
		lblNewLabel_2 = new JLabel("login: 227067");
		lblNewLabel_2.setBounds(10, 134, 80, 14);
		panelAlexandre.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Senha: 10");
		lblNewLabel_3.setBounds(10, 148, 80, 14);
		panelAlexandre.add(lblNewLabel_3);
		
		lblNewLabel = new JLabel("Pipoqueiro no basquete");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblNewLabel.setBackground(new Color(204, 204, 204));
		lblNewLabel.setBounds(10, 173, 122, 14);
		panelAlexandre.add(lblNewLabel);
		
		panelJoao = new JPanel();
		panelJoao.setBackground(new Color(153, 204, 204));
		panelJoao.setLayout(null);
		panelJoao.setBounds(220, 10, 140, 200);
		contentPane.add(panelJoao);
		panelJoao.addMouseListener(this);
		
		lblNewLabel_4 = new JLabel(new ImageIcon(getClass().getResource("Joao.jpeg")));
		panelJoao.add(lblNewLabel_4);
		lblNewLabel_4.setBounds(30, 11, 80, 80);
		
		lblNewLabel_1_1 = new JLabel("João Carlos");
		lblNewLabel_1_1.setBounds(10, 105, 80, 14);
		panelJoao.add(lblNewLabel_1_1);
		
		lblNewLabel_2_1 = new JLabel("login: 227094");
		lblNewLabel_2_1.setBounds(10, 130, 80, 14);
		panelJoao.add(lblNewLabel_2_1);
		
		lblNewLabel_3_1 = new JLabel("Senha: 10");
		lblNewLabel_3_1.setBounds(10, 142, 80, 14);
		panelJoao.add(lblNewLabel_3_1);
		
		lblLittleJohn = new JLabel("Little john ou JC");
		lblLittleJohn.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblLittleJohn.setBackground(new Color(204, 204, 204));
		lblLittleJohn.setBounds(10, 173, 122, 14);
		panelJoao.add(lblLittleJohn);
		
		btnNewButton = new JButton("Sair");
		btnNewButton.setBackground(new Color(153, 204, 204));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		btnNewButton.setBounds(446, 375, 100, 34);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		DaviPane = new JPanel();
		DaviPane.setLayout(null);
		DaviPane.setBackground(new Color(153, 204, 204));
		DaviPane.setBounds(370, 10, 140, 200);
		contentPane.add(DaviPane);
		DaviPane.addMouseListener(this);
		
		lblNewLabel_4_1 = new JLabel(new ImageIcon(getClass().getResource("Davi.jpg")));
		lblNewLabel_4_1.setBounds(30, 11, 80, 80);
		DaviPane.add(lblNewLabel_4_1);
		
		lblNewLabel_1_1_1 = new JLabel("Davi Santos");
		lblNewLabel_1_1_1.setBounds(10, 105, 80, 14);
		DaviPane.add(lblNewLabel_1_1_1);
		
		lblNewLabel_2_1_1 = new JLabel("login: 227164");
		lblNewLabel_2_1_1.setBounds(10, 130, 80, 14);
		DaviPane.add(lblNewLabel_2_1_1);
		
		lblNewLabel_3_1_1 = new JLabel("Senha: 10");
		lblNewLabel_3_1_1.setBounds(10, 142, 80, 14);
		DaviPane.add(lblNewLabel_3_1_1);
		
		lblLrioDoVale = new JLabel("Chega 10h em casa");
		lblLrioDoVale.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblLrioDoVale.setBackground(new Color(204, 204, 204));
		lblLrioDoVale.setBounds(10, 167, 122, 25);
		DaviPane.add(lblLrioDoVale);
		
		DaviPane_1 = new JPanel();
		DaviPane_1.setLayout(null);
		DaviPane_1.setBackground(new Color(153, 204, 204));
		DaviPane_1.setBounds(70, 220, 140, 200);
		contentPane.add(DaviPane_1);
		DaviPane_1.addMouseListener(this);
		
		lblNewLabel_4_1_1 = new JLabel(new ImageIcon(getClass().getResource("perfil_80_80.png")));
		lblNewLabel_4_1_1.setBounds(30, 11, 80, 80);
		DaviPane_1.add(lblNewLabel_4_1_1);
		
		lblNewLabel_1_1_1_1 = new JLabel("Danilo Magalhães");
		lblNewLabel_1_1_1_1.setBounds(10, 105, 101, 14);
		DaviPane_1.add(lblNewLabel_1_1_1_1);
		
		lblNewLabel_2_1_1_1 = new JLabel("login: 227157");
		lblNewLabel_2_1_1_1.setBounds(10, 130, 80, 14);
		DaviPane_1.add(lblNewLabel_2_1_1_1);
		
		lblNewLabel_3_1_1_1 = new JLabel("Senha: 10");
		lblNewLabel_3_1_1_1.setBounds(10, 142, 80, 14);
		DaviPane_1.add(lblNewLabel_3_1_1_1);
		
		lblTemTdah = new JLabel("Tem TDAH");
		lblTemTdah.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblTemTdah.setBackground(new Color(204, 204, 204));
		lblTemTdah.setBounds(10, 167, 122, 25);
		DaviPane_1.add(lblTemTdah);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==panelAlexandre) {
			NotasProf notas = new NotasProf(alunos, "227067");
			setVisible(false);
			notas.setVisible(true);
		}else
		if(e.getSource()==panelJoao) {
			NotasProf notas = new NotasProf(alunos, "227094");
			setVisible(false);
			notas.setVisible(true);
		}else
			if(e.getSource()==DaviPane) {
				NotasProf notas = new NotasProf(alunos, "227164");
				setVisible(false);
				notas.setVisible(true);
		}else
		if(e.getSource()==DaviPane_1) {
			NotasProf notas = new NotasProf(alunos, "227157");
			setVisible(false);
			notas.setVisible(true);
		}
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnNewButton) {
			MenuProf menu = new MenuProf(alunos);
			setVisible(false);
			menu.setVisible(true);
		}
		
	}
	
}
