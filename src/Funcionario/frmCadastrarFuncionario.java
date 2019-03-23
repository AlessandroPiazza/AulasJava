package Funcionario;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class frmCadastrarFuncionario extends JFrame {

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
					frmCadastrarFuncionario frame = new frmCadastrarFuncionario(new Funcionario());
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
					
					frmCadastrarFuncionario frame = new frmCadastrarFuncionario(func);
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
	public frmCadastrarFuncionario(Funcionario fff) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 393);
		contentPane = new JPanel();
		contentPane.setToolTipText("Noturno,Diurno,Vespertino");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblCadastroFuncionarios = new JLabel("Cadastro Funcionario");
		lblCadastroFuncionarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroFuncionarios.setBounds(0, 11, 281, 30);
		contentPane.add(lblCadastroFuncionarios);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(61, 66, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(61, 78, 140, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(61, 122, 46, 14);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(61, 134, 86, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
			
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Funcionario fff = new Funcionario();
				fff.setNome(txtNome.getText());
				 fff.setSalario(Double.parseDouble(txtSalario.getText()));
				 frmMenu.main(fff);
				 frmCadastrarFuncionario.this.dispose();
				 
				}catch(NumberFormatException e1){
					System.out.println("Erro no sistema!");
				}
				
			}
		});
		btnGravar.setBounds(83, 220, 89, 23);
		contentPane.add(btnGravar);
		
		
	}
}
