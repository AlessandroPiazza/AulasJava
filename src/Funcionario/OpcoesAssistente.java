package Funcionario;

public enum OpcoesAssistente {

	ASSISTENTE_ADMINISTRATIVO(2,"Assistente Administrativo"),
	ASSISTENTE_TECNICO(1,"Assistente Tecnico");
	
	private String itemMenu;
	private int id;
	
	OpcoesAssistente(int opcao, String MsgPadrao){
		id = opcao;
		itemMenu =  MsgPadrao;
		
	}
	
	public int getOpcao() {
		return this.id;
	}
	
	public String getItemMenu() {
		return this.itemMenu;
	}
	public static OpcoesAssistente obterOpcao(int i) {
		switch(i) {
		case 1:
			return OpcoesAssistente.ASSISTENTE_TECNICO;
		case 2:
			return OpcoesAssistente.ASSISTENTE_ADMINISTRATIVO;
		
	
		default:
			return null;
			
		}
	}
}
