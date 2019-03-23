package Funcionario;

public enum OpcoesFuncionario {

	FUNCIONARIO(1,"Funcionario"),
	ASSISTENTE(2,"Assistente");	

	private String itemMenu;
	private int id;
	
	OpcoesFuncionario(int opcao, String MsgPadrao){
		id = opcao;
		itemMenu =  MsgPadrao;
		
	}
	
	public int getOpcao() {
		return this.id;
	}
	
	public String getItemMenu() {
		return this.itemMenu;
	}
	
	public static OpcoesFuncionario obterOpcao(int i) {
		switch(i) {
		case 1:
			return OpcoesFuncionario.FUNCIONARIO;
		case 2:
			return OpcoesFuncionario.ASSISTENTE;
	
		default:
			return null;
			
		}
	
	}
}
