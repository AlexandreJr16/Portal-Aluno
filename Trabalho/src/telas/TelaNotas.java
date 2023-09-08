package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;

public class TelaNotas extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPoo1;
	private JTextField txtPoo2;
	private JTextField txtPort1;
	private JTextField txtPort2;
	private JTextField txtMat1;
	private JTextField txtMat2;
	private JTextField txtFis1;
	private JTextField txtFis2;
	private JTextField txtBio1;
	private JTextField txtBio2;
	private JTextField txtQui1;
	private JTextField txtQui2;
	private JTextField provPoo;
	private JTextField provPort;
	private JTextField provMat;
	private JTextField provFis;
	private JTextField provBio;
	private JTextField provQui;
	private JButton bttSair;
	private JLabel Notas;
	private JLabel lblPort;
	private JLabel lblMatemtica;
	private JLabel lblFsica;
	private JLabel lblBiologia;
	private JLabel lblQumica;
	private JLabel lblPoo;
	private Aluno aluno = new Aluno();
	
	
	public TelaNotas(Aluno aluno){
		
		this.setAluno(aluno);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		setSize(598, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Notas = new JLabel("Notas");
		Notas.setHorizontalAlignment(SwingConstants.CENTER);
		Notas.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 22));
		Notas.setBounds(217, 11, 139, 43);
		contentPane.add(Notas);
		
		lblPort = new JLabel("Português");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		lblPort.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblPort.setBounds(8, 120, 90, 40);
		contentPane.add(lblPort);
		
		lblMatemtica = new JLabel("Matemática");
		lblMatemtica.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatemtica.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblMatemtica.setBounds(8, 170, 90, 40);
		contentPane.add(lblMatemtica);
		
		lblFsica = new JLabel("Física");
		lblFsica.setHorizontalAlignment(SwingConstants.CENTER);
		lblFsica.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblFsica.setBounds(8, 220, 90, 40);
		contentPane.add(lblFsica);
		
		lblBiologia = new JLabel("Biologia");
		lblBiologia.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiologia.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblBiologia.setBounds(8, 270, 90, 40);
		contentPane.add(lblBiologia);
		
		lblQumica = new JLabel("Química");
		lblQumica.setHorizontalAlignment(SwingConstants.CENTER);
		lblQumica.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblQumica.setBounds(8, 320, 90, 40);
		contentPane.add(lblQumica);
		
		lblPoo = new JLabel("POO");
		lblPoo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoo.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		lblPoo.setBounds(8, 70, 90, 40);
		contentPane.add(lblPoo);
		
		txtPoo1 = new JTextField();
		txtPoo1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPoo1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPoo1.setColumns(10);
		txtPoo1.setEditable(false);
		txtPoo1.setBounds(120, 70, 90, 40);
		txtPoo1.setText(Double.toString(aluno.getNotas().getPoo1()));
		contentPane.add(txtPoo1);
		
		txtPoo2 = new JTextField();
		txtPoo2.setEditable(false);
		txtPoo2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPoo2.setColumns(10);
		txtPoo2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPoo2.setBounds(221, 70, 90, 40);
		txtPoo2.setText(Double.toString(aluno.getNotas().getPoo2()));
		contentPane.add(txtPoo2);
		
		txtPort1 = new JTextField();
		txtPort1.setEditable(false);
		txtPort1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPort1.setColumns(10);
		txtPort1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPort1.setBounds(120, 120, 90, 40);
		txtPort1.setText(Double.toString(aluno.getNotas().getPort1()));
		contentPane.add(txtPort1);
		
		txtPort2 = new JTextField();
		txtPort2.setEditable(false);
		txtPort2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPort2.setColumns(10);
		txtPort2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPort2.setBounds(221, 120, 90, 40);
		txtPort2.setText(Double.toString(aluno.getNotas().getPort2()));
		contentPane.add(txtPort2);
		
		txtMat1 = new JTextField();
		txtMat1.setEditable(false);
		txtMat1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMat1.setColumns(10);
		txtMat1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtMat1.setBounds(120, 170, 90, 40);
		txtMat1.setText(Double.toString(aluno.getNotas().getMat1()));
		contentPane.add(txtMat1);
		
		txtMat2 = new JTextField();
		txtMat2.setEditable(false);
		txtMat2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMat2.setColumns(10);
		txtMat2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtMat2.setBounds(221, 170, 90, 40);
		txtMat2.setText(Double.toString(aluno.getNotas().getMat2()));
		contentPane.add(txtMat2);
		
		txtFis1 = new JTextField();
		txtFis1.setEditable(false);
		txtFis1.setHorizontalAlignment(SwingConstants.CENTER);
		txtFis1.setColumns(10);
		txtFis1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtFis1.setBounds(120, 220, 90, 40);
		txtFis1.setText(Double.toString(aluno.getNotas().getFis1()));
		contentPane.add(txtFis1);
		
		txtFis2 = new JTextField();
		txtFis2.setEditable(false);
		txtFis2.setHorizontalAlignment(SwingConstants.CENTER);
		txtFis2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtFis2.setColumns(10);
		txtFis2.setBounds(221, 220, 90, 40);
		txtFis2.setText(Double.toString(aluno.getNotas().getFis2()));
		contentPane.add(txtFis2);
		
		txtBio1 = new JTextField();
		txtBio1.setEditable(false);
		txtBio1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBio1.setColumns(10);
		txtBio1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtBio1.setBounds(120, 270, 90, 40);
		txtBio1.setText(Double.toString(aluno.getNotas().getBio1()));
		contentPane.add(txtBio1);
		
		txtBio2 = new JTextField();
		txtBio2.setEditable(false);
		txtBio2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBio2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtBio2.setColumns(10);
		txtBio2.setBounds(221, 270, 90, 40);
		txtBio2.setText(Double.toString(aluno.getNotas().getBio2()));
		contentPane.add(txtBio2);
		
		txtQui1 = new JTextField();
		txtQui1.setEditable(false);
		txtQui1.setHorizontalAlignment(SwingConstants.CENTER);
		txtQui1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtQui1.setColumns(10);
		txtQui1.setBounds(120, 320, 90, 40);
		txtQui1.setText(Double.toString(aluno.getNotas().getQui1()));
		contentPane.add(txtQui1);
		
		txtQui2 = new JTextField();
		txtQui2.setEditable(false);
		txtQui2.setHorizontalAlignment(SwingConstants.CENTER);
		txtQui2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtQui2.setColumns(10);
		txtQui2.setBounds(221, 320, 90, 40);
		txtQui2.setText(Double.toString(aluno.getNotas().getQui2()));
		contentPane.add(txtQui2);
		
		provPoo = new JTextField();
		provPoo.setHorizontalAlignment(SwingConstants.CENTER);
		provPoo.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provPoo.setColumns(10);
		provPoo.setEditable(false);
		provPoo.setBounds(321, 70, 155, 40);
		if(aluno.getNotas().getPoo1()+aluno.getNotas().getPoo2()>=12) {
			provPoo.setText("Aprovado");
		}else provPoo.setText("Reprovado");
		contentPane.add(provPoo);
		
		provPort = new JTextField();
		provPort.setHorizontalAlignment(SwingConstants.CENTER);
		provPort.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provPort.setColumns(10);
		provPort.setEditable(false);
		provPort.setBounds(321, 120, 155, 40);
		if(aluno.getNotas().getPort1()+aluno.getNotas().getPort2()>=12) {
			provPort.setText("Aprovado");
		}else provPort.setText("Reprovado");
		contentPane.add(provPort);
		
		provMat = new JTextField();
		provMat.setEditable(false);
		provMat.setHorizontalAlignment(SwingConstants.CENTER);
		provMat.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provMat.setColumns(10);
		provMat.setBounds(321, 170, 155, 40);
		if(aluno.getNotas().getMat1()+aluno.getNotas().getMat2()>=12) {
			provMat.setText("Aprovado");
		}else provMat.setText("Reprovado");
		contentPane.add(provMat);
		
		provFis = new JTextField();
		provFis.setEditable(false);
		provFis.setHorizontalAlignment(SwingConstants.CENTER);
		provFis.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provFis.setColumns(10);
		provFis.setBounds(321, 220, 155, 40);
		if(aluno.getNotas().getFis1()+aluno.getNotas().getFis2()>=12) {
			provFis.setText("Aprovado");
		}else provFis.setText("Reprovado");
		contentPane.add(provFis);
		
		provBio = new JTextField();
		provBio.setEditable(false);
		provBio.setHorizontalAlignment(SwingConstants.CENTER);
		provBio.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provBio.setColumns(10);
		provBio.setBounds(321, 270, 155, 40);
		if(aluno.getNotas().getBio1()+aluno.getNotas().getBio2()>=12) {
			provBio.setText("Aprovado");
		}else provBio.setText("Reprovado");
		contentPane.add(provBio);
		
		provQui = new JTextField();
		provQui.setEditable(false);
		provQui.setHorizontalAlignment(SwingConstants.CENTER);
		provQui.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provQui.setColumns(10);
		provQui.setBounds(321, 320, 155, 40);
		if(aluno.getNotas().getQui1()+aluno.getNotas().getQui2()>=12) {
			provQui.setText("Aprovado");
		}else provQui.setText("Reprovado");
		contentPane.add(provQui);
		
		bttSair = new JButton("Sair");
		bttSair.setForeground(Color.WHITE);
		bttSair.setBackground(new Color(153, 204, 204));
		bttSair.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		bttSair.setBounds(387, 377, 89, 23);
		bttSair.addActionListener(this);
		contentPane.add(bttSair);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bttSair) {
			setVisible(false);
		}
		
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	
	
}
