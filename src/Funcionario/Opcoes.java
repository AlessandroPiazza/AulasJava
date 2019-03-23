package Funcionario;

public enum Opcoes {
CADASTRAR(1,"Cadastrar Funcionario/Assistente"),EXIBIR(2,"Exibir dados"),
EXIBIR_GANHO_ANUAL(3,"Exibir ganho anual"),
SAIR(4,"Sair"),ADICIONAR_AUMENTO(5,"Adicionar Aumento");

	
	private String itemMenu;
	private int id;
	
	Opcoes(int opcao, String MsgPadrao){
		id = opcao;
		itemMenu =  MsgPadrao;
		
	}
	
	public int getOpcao() {
		return this.id;
	}
	
	public String getItemMenu() {
		return this.itemMenu;
	}

	public static Opcoes obterOpcao(int i) {
		switch(i) {
		case 1:
			return Opcoes.CADASTRAR;
		case 2:
			return Opcoes.EXIBIR;
		case 3:
			return Opcoes.EXIBIR_GANHO_ANUAL;
		case 4:
			return Opcoes.SAIR;
		case 5:
			return Opcoes.ADICIONAR_AUMENTO;
		default:
			return null;
			
		}
	}
	
}
