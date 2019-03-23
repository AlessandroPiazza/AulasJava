package Funcionario;

import java.util.Scanner;

public class Menu {
	
	public static String montarMenu() {
		StringBuilder str = new StringBuilder();
		str.append("Digite: \n");
		for(Opcoes op : Opcoes.values()) {
			str.append(op.getOpcao());
			str.append(" - ");
			str.append(op.getItemMenu());
			str.append("\n");
		}
		return str.toString();
	}
	
	public static String montarMenuFuncionario() {
		
		StringBuilder funcionarioStr = new StringBuilder();
		funcionarioStr.append("Digite: \n");
		for(OpcoesFuncionario opf : OpcoesFuncionario.values()) {
		funcionarioStr.append(opf.getOpcao());
		funcionarioStr.append(" - ");
		funcionarioStr.append(opf.getItemMenu());
		funcionarioStr.append("\n");
		}
		return funcionarioStr.toString();
	}
	
	public static String montarMenuAssistente() {
		StringBuilder assistenteStr = new StringBuilder();
		
		assistenteStr.append("Digite: \n");
		
		for(OpcoesAssistente opa : OpcoesAssistente.values()) {
		assistenteStr.append(opa.getOpcao());
		assistenteStr.append(" - ");
		assistenteStr.append(opa.getItemMenu());
		assistenteStr.append("\n");
		}
		return assistenteStr.toString();
	}

	public static String montarMenuTurno() {
		StringBuilder turnoStr = new StringBuilder();
		
		for(OpcoesAssistenteAdministrativos opad : OpcoesAssistenteAdministrativos.values()) {
			turnoStr.append(opad.getOpcao());
			turnoStr.append(" - ");
			turnoStr.append(opad.getItemMenu());
			turnoStr.append("\n");
			}
		
		return turnoStr.toString();
	}
	private static Scanner scan;

	public static void main(String[] args){
	
		try {
			scan = new Scanner(System.in);
			int opcao = 0;
			
			Funcionario f = null;
			
			while(opcao != 4) {
				
				System.out.println(montarMenu());
				opcao = scan.nextInt();
				
				Opcoes menu  = Opcoes.obterOpcao(opcao);
				
				if(menu  == Opcoes.CADASTRAR) {
					if(f == null) {
						int tipo;
						System.out.println(montarMenuFuncionario());
						tipo = scan.nextInt();
						OpcoesFuncionario menu1 = OpcoesFuncionario.obterOpcao(tipo);
												
						if(menu1 == OpcoesFuncionario.FUNCIONARIO) {
							frmCadastrarFuncionario.main(f);
							
						}
						if(menu1 == OpcoesFuncionario.ASSISTENTE) {
							
							int tipoAssistente;
							int matricula;
							
							System.out.println(montarMenuAssistente());
							tipoAssistente = scan.nextInt();
							
							System.out.print("Digite o numero de matricula do ");
							System.out.println(OpcoesFuncionario.FUNCIONARIO.getItemMenu());
							matricula = scan.nextInt();
							if (tipoAssistente == 1) {
								
								f = new AssistenteTecnico();
								
								
								((AssistenteTecnico)f).setMatricula(matricula);
								((AssistenteTecnico)f).setCargo(OpcoesAssistente.ASSISTENTE_TECNICO.getItemMenu());
							}
							if (tipoAssistente == 2) {
								
								int opcTurno;
								
								System.out.println(montarMenuTurno());
								opcTurno = scan.nextInt();
								
								f = new AssistenteAdministrativo();
							
								((AssistenteAdministrativo)f).setMatricula(matricula);
								((AssistenteAdministrativo)f).setTurno(opcTurno);
								((AssistenteAdministrativo)f).setCargo(OpcoesAssistente.ASSISTENTE_TECNICO.getItemMenu());
								System.out.println("O turno do assistente é: "+((AssistenteAdministrativo)f).getTurno());
								
							}
						}
					}
				}else if(f!=null && opcao == 1){
					System.out.println("\nFuncionário já cadastrado");
				}
				if(menu == Opcoes.EXIBIR) {
					System.out.println("\n" + f.mostrarDados());
				}
				if(menu == Opcoes.EXIBIR_GANHO_ANUAL) {
					System.out.println("\nO ganho anual do funcionario é " + f.calculoSalarioAnual());
				}
				if(menu == Opcoes.ADICIONAR_AUMENTO) {
					double aumento;
					System.out.println("Digite o valor do aumento.");
					aumento = scan.nextDouble();
					f.addAumento(aumento);
				}
			}
			if (opcao == 9) {
			System.out.println(f.getNome());
			}
			
			
		}catch(NullPointerException e){
			System.out.println("Erro no sistema!");
		}
		

	}
}
