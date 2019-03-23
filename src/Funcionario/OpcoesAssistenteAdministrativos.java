package Funcionario;

public enum OpcoesAssistenteAdministrativos {

	ASSISTENTE_ADMINISTRATIVO_DIURNO(2,"Assistente Administrativo diurno"),
	ASSISTENTE_ADMINISTRATIVO_NOTURNO(1,"Assistente Administrativo noturno"),
	ASSISTENTE_ADMINISTRATIVO_VESPERTINO(3,"Assistente Administrativo vespertino");
	
	
	private String itemMenu;
	private int id;
	
	OpcoesAssistenteAdministrativos(int opcao, String MsgPadrao){
		id = opcao;
		itemMenu =  MsgPadrao;
		
	}
	
	public int getOpcao() {
		return this.id;
	}
	
	public String getItemMenu() {
		return this.itemMenu;
	}
	
	public static OpcoesAssistenteAdministrativos obterOpcao(int i) {
		switch(i) {
		case 1:
			return OpcoesAssistenteAdministrativos.ASSISTENTE_ADMINISTRATIVO_NOTURNO;
		case 2:
			return OpcoesAssistenteAdministrativos.ASSISTENTE_ADMINISTRATIVO_DIURNO;
		
		case 3:
			return OpcoesAssistenteAdministrativos.ASSISTENTE_ADMINISTRATIVO_VESPERTINO;
		
	
		default:
			return null;
			
		}
	}

}
