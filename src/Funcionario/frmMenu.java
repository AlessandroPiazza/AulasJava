package Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;

public class frmMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtAumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu(new Funcionario());
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
					frmMenu frame = new frmMenu(func);
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
	public frmMenu(Funcionario fff) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxCargo = new JComboBox();
		comboBoxCargo.setModel(new DefaultComboBoxModel(new String[] {OpcoesFuncionario.FUNCIONARIO.getItemMenu(), OpcoesAssistente.ASSISTENTE_TECNICO.getItemMenu(), OpcoesAssistente.ASSISTENTE_ADMINISTRATIVO.getItemMenu()}));
		comboBoxCargo.setToolTipText("");
		comboBoxCargo.setBounds(27, 51, 162, 20);
		contentPane.add(comboBoxCargo);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(27, 11, 380, 14);
		contentPane.add(lblMenu);
		
		JButton btnCadastrar = new JButton(Opcoes.CADASTRAR.getItemMenu());
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxCargo.getSelectedItem().equals(OpcoesFuncionario.FUNCIONARIO.getItemMenu())) {
				frmCadastrarFuncionario.main(fff);
				}else if(comboBoxCargo.getSelectedItem().equals(OpcoesAssistente.ASSISTENTE_TECNICO.getItemMenu())) {
					frmCadastroAssistenteTecnico.main(fff);
				}else {
					frmCadastroAssistenteAdministrativo.main(fff);
				}	
				frmMenu.this.dispose();
			}
		});
		btnCadastrar.setBounds(60, 85, 108, 23);
		contentPane.add(btnCadastrar);
		JButton btnExibirDados = new JButton(Opcoes.EXIBIR.getItemMenu());
		btnExibirDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(fff.getNome() != null) {
				JOptionPane.showMessageDialog(null, fff.mostrarDados());
				}else if(((Assistente)fff).getMatriculaString() != null){
					JOptionPane.showMessageDialog(null, ((Assistente)fff).mostrarDados());
				}else {
				
					JOptionPane.showMessageDialog(null, "Nenhum Funcionario cadastrado");
				}
				}
				catch(ClassCastException e1) {
					JOptionPane.showMessageDialog(null,"Precisa cadastrar funcionário antes de ver os dados.");
				}
			}
		});
		btnExibirDados.setBounds(60, 151, 108, 23);
		contentPane.add(btnExibirDados);
		
		JButton btnExibirSalarioAnual = new JButton(Opcoes.EXIBIR_GANHO_ANUAL.getItemMenu());
		btnExibirSalarioAnual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,"Ganho Anual: "  + fff.calculoSalarioAnual());
				}
				catch(ClassCastException e1) {
					
					System.out.println("Erro no sistema!");
					
				}
				}
		});
		btnExibirSalarioAnual.setBounds(257, 85, 150, 23);
		contentPane.add(btnExibirSalarioAnual);
		
		txtAumento = new JTextField();
		txtAumento.setBounds(257, 199, 133, 20);
		contentPane.add(txtAumento);
		txtAumento.setColumns(10);
		JLabel lblAumento = new JLabel("Aumento:");
		lblAumento.setBounds(257, 185, 80, 14);
		contentPane.add(lblAumento);
		if(fff.getNome() != null) {
			txtAumento.setVisible(true);
			lblAumento.setVisible(true);
		}else {
			txtAumento.setVisible(false);
			lblAumento.setVisible(false);
		}
		JButton btnAumentarSalario = new JButton(Opcoes.ADICIONAR_AUMENTO.getItemMenu());
		btnAumentarSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fff.addAumento(Double.parseDouble(txtAumento.getText()));
				txtAumento.setText("");
			}
		});
		btnAumentarSalario.setBounds(257, 151, 167, 23);
		contentPane.add(btnAumentarSalario);
		
		
		
		
		
		
	}
}
