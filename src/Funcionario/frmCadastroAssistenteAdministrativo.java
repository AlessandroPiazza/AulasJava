package Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCadastroAssistenteAdministrativo extends JFrame {

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
					frmCadastroAssistenteAdministrativo frame = new frmCadastroAssistenteAdministrativo(
							new Funcionario());
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

					frmCadastroAssistenteAdministrativo frame = new frmCadastroAssistenteAdministrativo(func);
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
	public frmCadastroAssistenteAdministrativo(Funcionario ff) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroAssistenteAdministrativo = new JLabel("Cadastro Assistente Administrativo");
		lblCadastroAssistenteAdministrativo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroAssistenteAdministrativo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroAssistenteAdministrativo.setBounds(10, 11, 402, 14);
		contentPane.add(lblCadastroAssistenteAdministrativo);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(25, 51, 96, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(25, 69, 164, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(25, 100, 110, 14);
		contentPane.add(lblSalario);

		txtSalario = new JTextField();
		txtSalario.setBounds(25, 114, 86, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);

		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setHorizontalAlignment(SwingConstants.LEFT);
		lblMatricula.setBounds(25, 155, 96, 14);
		contentPane.add(lblMatricula);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(25, 170, 164, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);

		JComboBox comboBoxTurno = new JComboBox();
		comboBoxTurno.setModel(
				new DefaultComboBoxModel(new String[] { "<Selecione o turno>", Turno.TURNO_NOTURNO.getMensssagem(),
						Turno.TURNO_DIURNO.getMensssagem(), Turno.TURNO_VESPERTINO.getMensssagem() }));
		comboBoxTurno.setBounds(251, 69, 149, 20);
		contentPane.add(comboBoxTurno);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Funcionario ff = new AssistenteAdministrativo();
				((AssistenteAdministrativo) ff).setNome(txtNome.getText());
				((AssistenteAdministrativo) ff).setSalario(Double.parseDouble(txtSalario.getText()));
				((AssistenteAdministrativo) ff).setMatricula(Integer.parseInt(txtMatricula.getText()));
				((AssistenteAdministrativo) ff).setCargo(OpcoesAssistente.ASSISTENTE_ADMINISTRATIVO.getItemMenu());
				if (comboBoxTurno.getSelectedItem().equals(Turno.TURNO_NOTURNO.getMensssagem())) {
					((AssistenteAdministrativo) ff).setTurno(1);
				} else if (comboBoxTurno.getSelectedItem().equals(Turno.TURNO_DIURNO.getMensssagem())) {
					((AssistenteAdministrativo) ff).setTurno(2);
				} else {
					((AssistenteAdministrativo) ff).setTurno(3);
				}
				frmMenu.main(ff);
				frmCadastroAssistenteAdministrativo.this.dispose();
				}catch(NumberFormatException e1){
					System.out.println("Erro no sistema!");
				}
			}
		});
		btnGravar.setBounds(166, 227, 89, 23);
		contentPane.add(btnGravar);
	}

}
