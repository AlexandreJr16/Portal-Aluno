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
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Classes.Aluno;

@SuppressWarnings("serial")
public class ComoEstudar extends JFrame implements ActionListener{

	
	private JPanel contentPane;
	private JButton Start;
	private JButton Zerar;
	private JLabel timeLabel = new JLabel();
	private HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
	private JButton Start_1;
	private int elapsedTime = 0;
	private int seconds =0;
	private int minutes =25;
	private boolean started = false;
	private String seconds_string = String.format("%02d", seconds);
	private String minutes_string = String.format("%02d", minutes);

	 
	 public HashMap<String, Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(HashMap<String, Aluno> alunos) {
		this.alunos = alunos;
	}

	Timer timer = new Timer(1000, new ActionListener() {
		  
		  public void actionPerformed(ActionEvent e) {
		   
		   elapsedTime=elapsedTime+1000;
		   if(seconds==0) {
			   if(minutes==0) {
				   started=false;
				   Zerar.setText("Começar"); 				   
				   JOptionPane.showMessageDialog(null, "Você conseguiu um ciclo Pomodoro");
				   reset();

			   }else {
			   minutes-=1;
			   seconds=59;}
		   }
		   seconds-=1;
		   seconds_string = String.format("%02d", seconds);
		   minutes_string = String.format("%02d", minutes);
		   timeLabel.setText(minutes_string+":"+seconds_string);
		   
		  }
		  
		 });

	public ComoEstudar(HashMap<String, Aluno> alunos) {
		setTitle("Portal");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fudLogin.png")));				
		this.alunos=alunos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(598, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(ComoEstudar.class.getResource("/telas/fudLogin.png")));
		lblNewLabel.setBounds(10, 11, 171, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblPomodoro = new JLabel("POMODORO");
		lblPomodoro.setForeground(Color.WHITE);
		lblPomodoro.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblPomodoro.setBounds(239, 8, 153, 55);
		contentPane.add(lblPomodoro);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ComoEstudar.class.getResource("/telas/pomodoro.png")));
		lblNewLabel_1.setBounds(37, 76, 239, 251);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnCriadoNosAnos = new JTextPane();
		txtpnCriadoNosAnos.setForeground(new Color(255, 255, 255));
		txtpnCriadoNosAnos.setBackground(new Color(143, 188, 143));
		txtpnCriadoNosAnos.setBounds(295, 85, 262, 96);
		contentPane.add(txtpnCriadoNosAnos);
		txtpnCriadoNosAnos.setEditable(false);
		txtpnCriadoNosAnos.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 13));
		txtpnCriadoNosAnos.setText("Criado nos anos 80 pelo então universitário italiano Francesco Cirillo, o Método Pomodoro se resume em separar 25 minutos para fazer uma determinada tarefa.");
		
		Zerar = new JButton("Zerar");
		Zerar.setForeground(new Color(255, 255, 255));
		Zerar.setBackground(new Color(255, 102, 51));
		Zerar.setBounds(430, 284, 89, 23);
		contentPane.add(Zerar);
		Zerar.addActionListener(this);
		
		timeLabel= new JLabel("25:00");
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 65));
		timeLabel.setBounds(295, 212, 239, 52);
		contentPane.add(timeLabel);
		
		 Start= new JButton("Começar");	
		Start.setForeground(new Color(255, 255, 255));
		Start.setBackground(new Color(255, 102, 51));
		Start.setBounds(295, 284, 89, 23);
		contentPane.add(Start);
		Start.addActionListener(this);
		
		Start_1 = new JButton("Sair");
		Start_1.setForeground(Color.WHITE);
		Start_1.setBackground(new Color(255, 102, 51));
		Start_1.setBounds(468, 377, 89, 23);
		contentPane.add(Start_1);
		Start_1.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		  
		  if(e.getSource()==Start) {
		   
		   if(started==false) {
		    started=true;
		    Start.setText("Parar");
		    start();
		   }
		   else {
		    started=false;
		    Start.setText("Começar");
		    stop();
		   }
		   
		  }
		  if(e.getSource()==Zerar) {
		   started=false;
		   Start.setText("Começar");
		   reset();
		  }
		  if(e.getSource()==Start_1) {
			  
			  setVisible(false);
		  }
		 }
		 
		 void start() {
		  timer.start();
		 }
		 
		 void stop() {
		  timer.stop();
		 }
		 
		 void reset() {
		  timer.stop();
		  elapsedTime=0;
		  seconds =0;
		  minutes=25;
		  seconds_string = String.format("%02d", seconds);
		  minutes_string = String.format("%02d", minutes);
		  timeLabel.setText("25:00");
		  
		 }
}
