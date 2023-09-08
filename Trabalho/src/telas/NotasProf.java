package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;

public class NotasProf extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
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
	private JButton btnSalvar;
	private HashMap <String, Aluno> alunos = new HashMap<String, Aluno>();
	private String id;
	
	NotasProf(HashMap <String, Aluno> alunos, String id){
		this.alunos=alunos;
		this.id=id;
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
		txtPoo1.setBounds(120, 70, 90, 40);
		txtPoo1.setText(Double.toString(alunos.get(id).getNotas().getPoo1()));
		contentPane.add(txtPoo1);
		
		txtPoo2 = new JTextField();
		txtPoo2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPoo2.setColumns(10);
		txtPoo2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPoo2.setBounds(221, 70, 90, 40);
		txtPoo2.setText(Double.toString(alunos.get(id).getNotas().getPoo2()));
		contentPane.add(txtPoo2);
		
		txtPort1 = new JTextField();
		txtPort1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPort1.setColumns(10);
		txtPort1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPort1.setBounds(120, 120, 90, 40);
		txtPort1.setText(Double.toString(alunos.get(id).getNotas().getPort1()));
		contentPane.add(txtPort1);
		
		txtPort2 = new JTextField();
		txtPort2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPort2.setColumns(10);
		txtPort2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtPort2.setBounds(221, 120, 90, 40);
		txtPort2.setText(Double.toString(alunos.get(id).getNotas().getPort2()));
		contentPane.add(txtPort2);
		
		txtMat1 = new JTextField();
		txtMat1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMat1.setColumns(10);
		txtMat1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtMat1.setBounds(120, 170, 90, 40);
		txtMat1.setText(Double.toString(alunos.get(id).getNotas().getMat1()));
		contentPane.add(txtMat1);
		
		txtMat2 = new JTextField();
		txtMat2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMat2.setColumns(10);
		txtMat2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtMat2.setBounds(221, 170, 90, 40);
		txtMat2.setText(Double.toString(alunos.get(id).getNotas().getMat2()));
		contentPane.add(txtMat2);
		
		txtFis1 = new JTextField();
		txtFis1.setHorizontalAlignment(SwingConstants.CENTER);
		txtFis1.setColumns(10);
		txtFis1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtFis1.setBounds(120, 220, 90, 40);
		txtFis1.setText(Double.toString(alunos.get(id).getNotas().getFis1()));
		contentPane.add(txtFis1);
		
		txtFis2 = new JTextField();
		txtFis2.setHorizontalAlignment(SwingConstants.CENTER);
		txtFis2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtFis2.setColumns(10);
		txtFis2.setBounds(221, 220, 90, 40);
		txtFis2.setText(Double.toString(alunos.get(id).getNotas().getFis2()));
		contentPane.add(txtFis2);
		
		txtBio1 = new JTextField();
		txtBio1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBio1.setColumns(10);
		txtBio1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtBio1.setBounds(120, 270, 90, 40);
		txtBio1.setText(Double.toString(alunos.get(id).getNotas().getBio1()));
		contentPane.add(txtBio1);
		
		txtBio2 = new JTextField();
		txtBio2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBio2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtBio2.setColumns(10);
		txtBio2.setText(Double.toString(alunos.get(id).getNotas().getBio2()));
		txtBio2.setBounds(221, 270, 90, 40);
		contentPane.add(txtBio2);
		
		txtQui1 = new JTextField();
		txtQui1.setHorizontalAlignment(SwingConstants.CENTER);
		txtQui1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtQui1.setColumns(10);
		txtQui1.setBounds(120, 320, 90, 40);
		txtQui1.setText(Double.toString(alunos.get(id).getNotas().getQui1()));
		contentPane.add(txtQui1);
		
		txtQui2 = new JTextField();
		txtQui2.setHorizontalAlignment(SwingConstants.CENTER);
		txtQui2.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		txtQui2.setColumns(10);
		txtQui2.setText(Double.toString(alunos.get(id).getNotas().getQui2()));
		txtQui2.setBounds(221, 320, 90, 40);
		contentPane.add(txtQui2);
		
		provPoo = new JTextField();
		provPoo.setEnabled(false);
		provPoo.setEditable(false);
		provPoo.setHorizontalAlignment(SwingConstants.CENTER);
		provPoo.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provPoo.setColumns(10);
		provPoo.setBounds(321, 70, 155, 40);
		contentPane.add(provPoo);
		
		provPort = new JTextField();
		provPort.setEnabled(false);
		provPort.setEditable(false);
		provPort.setHorizontalAlignment(SwingConstants.CENTER);
		provPort.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provPort.setColumns(10);
		provPort.setBounds(321, 120, 155, 40);
		contentPane.add(provPort);
		
		provMat = new JTextField();
		provMat.setEnabled(false);
		provMat.setEditable(false);
		provMat.setHorizontalAlignment(SwingConstants.CENTER);
		provMat.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provMat.setColumns(10);
		provMat.setBounds(321, 170, 155, 40);
		contentPane.add(provMat);
		
		provFis = new JTextField();
		provFis.setEnabled(false);
		provFis.setEditable(false);
		provFis.setHorizontalAlignment(SwingConstants.CENTER);
		provFis.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provFis.setColumns(10);
		provFis.setBounds(321, 220, 155, 40);
		contentPane.add(provFis);
		
		provBio = new JTextField();
		provBio.setEnabled(false);
		provBio.setEditable(false);
		provBio.setHorizontalAlignment(SwingConstants.CENTER);
		provBio.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provBio.setColumns(10);
		provBio.setBounds(321, 270, 155, 40);
		contentPane.add(provBio);
		
		provQui = new JTextField();
		provQui.setEnabled(false);
		provQui.setEditable(false);
		provQui.setHorizontalAlignment(SwingConstants.CENTER);
		provQui.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 20));
		provQui.setColumns(10);
		provQui.setBounds(321, 320, 155, 40);
		contentPane.add(provQui);
		
		bttSair = new JButton("Cancelar");
		bttSair.setForeground(Color.WHITE);
		bttSair.setBackground(new Color(153, 204, 204));
		bttSair.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		bttSair.setBounds(387, 377, 89, 23);
		contentPane.add(bttSair);
		bttSair.addActionListener(this);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnSalvar.setBackground(new Color(153, 204, 204));
		btnSalvar.setBounds(286, 377, 89, 23);
		contentPane.add(btnSalvar);
		btnSalvar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bttSair) {
			MenuProf menu = new MenuProf(alunos);
			setVisible(false);
			menu.setVisible(true);
		}else 
		if(e.getSource()==btnSalvar) {
			
			try {int i=0;
			if(Double.parseDouble(txtPoo1.getText())>10||Double.parseDouble(txtPoo1.getText())<0) { JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10"); i=1;}
			else if(Double.parseDouble(txtPoo2.getText())>10||Double.parseDouble(txtPoo2.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtPort1.getText())>10||Double.parseDouble(txtPort1.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtPort2.getText())>10||Double.parseDouble(txtPort2.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtMat1.getText())>10||Double.parseDouble(txtMat1.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtMat2.getText())>10||Double.parseDouble(txtMat2.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtQui1.getText())>10||Double.parseDouble(txtQui1.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtQui2.getText())>10||Double.parseDouble(txtQui2.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtBio1.getText())>10||Double.parseDouble(txtBio1.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtBio2.getText())>10||Double.parseDouble(txtBio2.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtFis1.getText())>10||Double.parseDouble(txtFis1.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			else if(Double.parseDouble(txtFis2.getText())>10||Double.parseDouble(txtFis2.getText())<0) {JOptionPane.showMessageDialog(null, "Notas deverão está entre 0 e 10");i=1;}
			
			if(i==0) {
			alunos.get(id).getNotas().setPoo1(Double.parseDouble(txtPoo1.getText()));
			alunos.get(id).getNotas().setPoo2(Double.parseDouble(txtPoo2.getText()));
			alunos.get(id).getNotas().setPort1(Double.parseDouble(txtPort1.getText()));
			alunos.get(id).getNotas().setPort2(Double.parseDouble(txtPort2.getText()));
			alunos.get(id).getNotas().setMat1(Double.parseDouble(txtMat1.getText()));
			alunos.get(id).getNotas().setMat2(Double.parseDouble(txtMat2.getText()));
			alunos.get(id).getNotas().setBio1(Double.parseDouble(txtBio1.getText()));
			alunos.get(id).getNotas().setBio2(Double.parseDouble(txtBio2.getText()));
			alunos.get(id).getNotas().setFis1(Double.parseDouble(txtFis1.getText()));
			alunos.get(id).getNotas().setFis2(Double.parseDouble(txtFis2.getText()));
			alunos.get(id).getNotas().setQui1(Double.parseDouble(txtQui1.getText()));
			alunos.get(id).getNotas().setQui2(Double.parseDouble(txtQui2.getText()));
			MenuProf menu = new MenuProf(alunos);
			setVisible(false);
			menu.setVisible(true);
			}			
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Erro");
			}
			
			
		}
				
	}

}
