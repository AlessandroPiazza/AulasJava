package Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCadastroAssistenteTecnico extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSalario;
	private JTextField txtMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroAssistenteTecnico frame = new frmCadastroAssistenteTecnico(new Funcionario());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			
		});
	}
	public static void main(Funcionario func) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frmCadastroAssistenteTecnico frame = new frmCadastroAssistenteTecnico(func);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public frmCadastroAssistenteTecnico(Funcionario ff) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroAssistenteTecnico = new JLabel("Cadastro Assistente Tecnico");
		lblCadastroAssistenteTecnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroAssistenteTecnico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroAssistenteTecnico.setBounds(0, 11, 304, 14);
		contentPane.add(lblCadastroAssistenteTecnico);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(33, 54, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(33, 99, 46, 14);
		contentPane.add(lblSalario);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(33, 143, 85, 14);
		contentPane.add(lblMatricula);
		
		txtNome = new JTextField();
		txtNome.setBounds(32, 68, 167, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(32, 112, 86, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(32, 156, 167, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Funcionario ff = new AssistenteTecnico();
				((AssistenteTecnico)ff).setNome(txtNome.getText());
				((AssistenteTecnico)ff).setSalario(Double.parseDouble(txtSalario.getText()));
				((AssistenteTecnico)ff).setMatricula(Integer.parseInt(txtMatricula.getText()));
				((AssistenteTecnico)ff).setCargo("Assistente Tecnico");
				frmMenu.main(ff);
				frmCadastroAssistenteTecnico.this.dispose();
				
				}
				catch(NumberFormatException e1){
					System.out.println("Erro no sistema");
				}
				}	
		});
		
		btnGravar.setBounds(110, 227, 89, 23);
		contentPane.add(btnGravar);
	}
	
}
