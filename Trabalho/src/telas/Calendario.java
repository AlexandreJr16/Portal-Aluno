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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;


public class Calendario extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel fundo;
	private JTextField txtClassesObjetosMetodos;
	private JTextField txtFraseOraoE;
	private JTextField txtMatemticaComercialE;
	private JTextField txtGravitaoUniversal;
	private JTextField txtFotossntese;
	private JTextField txtEstequiometriaMol;
	private JButton bttSair;
	
	public Calendario(HashMap <String, Aluno>alunos ){
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		setTitle("Portal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(598, 450);
		setLocationRelativeTo(null);
		fundo = new JPanel();
		fundo.setBackground(new Color(143, 188, 143));
		fundo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fundo);
		fundo.setLayout(null);
		
		JLabel calendario = new JLabel("");
		calendario.setHorizontalAlignment(SwingConstants.CENTER);
		calendario.setIcon(new ImageIcon(Calendario.class.getResource("/telas/calendario.png")));
		calendario.setBounds(27, 0, 545, 110);
		fundo.add(calendario);
		
		JLabel lblPort = new JLabel("Português");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		lblPort.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblPort.setBounds(27, 160, 90, 40);
		fundo.add(lblPort);
		
		JLabel lblMatemtica = new JLabel("Matemática");
		lblMatemtica.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatemtica.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblMatemtica.setBounds(27, 210, 90, 40);
		fundo.add(lblMatemtica);
		
		JLabel lblFsica = new JLabel("Física");
		lblFsica.setHorizontalAlignment(SwingConstants.CENTER);
		lblFsica.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblFsica.setBounds(27, 260, 90, 40);
		fundo.add(lblFsica);
		
		JLabel lblBiologia = new JLabel("Biologia");
		lblBiologia.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiologia.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblBiologia.setBounds(27, 310, 90, 40);
		fundo.add(lblBiologia);
		
		JLabel lblQumica = new JLabel("Química");
		lblQumica.setHorizontalAlignment(SwingConstants.CENTER);
		lblQumica.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblQumica.setBounds(27, 360, 90, 40);
		fundo.add(lblQumica);
		
		JLabel lblPoo = new JLabel("POO");
		lblPoo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoo.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblPoo.setBounds(27, 110, 90, 40);
		fundo.add(lblPoo);
		
		txtClassesObjetosMetodos = new JTextField();
		txtClassesObjetosMetodos.setText("Classes, Objetos e Métodos.");
		txtClassesObjetosMetodos.setEditable(false);
		txtClassesObjetosMetodos.setBounds(121, 110, 341, 40);
		fundo.add(txtClassesObjetosMetodos);
		txtClassesObjetosMetodos.setColumns(10);
		
		txtFraseOraoE = new JTextField();
		txtFraseOraoE.setText("Frase, oração e período. Tipos de sujeito. ");
		txtFraseOraoE.setEditable(false);
		txtFraseOraoE.setColumns(10);
		txtFraseOraoE.setBounds(121, 160, 341, 40);
		fundo.add(txtFraseOraoE);
		
		txtMatemticaComercialE = new JTextField();
		txtMatemticaComercialE.setText("Matemática comercial e financeira(Juros simples e composto).");
		txtMatemticaComercialE.setEditable(false);
		txtMatemticaComercialE.setColumns(10);
		txtMatemticaComercialE.setBounds(121, 211, 341, 40);
		fundo.add(txtMatemticaComercialE);
		
		txtGravitaoUniversal = new JTextField();
		txtGravitaoUniversal.setText("Gravitação Universal.");
		txtGravitaoUniversal.setEditable(false);
		txtGravitaoUniversal.setColumns(10);
		txtGravitaoUniversal.setBounds(121, 260, 341, 40);
		fundo.add(txtGravitaoUniversal);
		
		txtFotossntese = new JTextField();
		txtFotossntese.setText("Fotossíntese.");
		txtFotossntese.setEditable(false);
		txtFotossntese.setColumns(10);
		txtFotossntese.setBounds(121, 310, 341, 40);
		fundo.add(txtFotossntese);
		
		txtEstequiometriaMol = new JTextField();
		txtEstequiometriaMol.setText("Estequiometria: mol.");
		txtEstequiometriaMol.setEditable(false);
		txtEstequiometriaMol.setColumns(10);
		txtEstequiometriaMol.setBounds(121, 361, 341, 40);
		fundo.add(txtEstequiometriaMol);
		
		bttSair = new JButton("Cancelar");
		bttSair.setForeground(Color.WHITE);
		bttSair.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		bttSair.setBackground(new Color(102, 204, 0));
		bttSair.setBounds(472, 377, 89, 23);
		fundo.add(bttSair);
		bttSair.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bttSair) {
			
			setVisible(false);
		}
		
	}

}
