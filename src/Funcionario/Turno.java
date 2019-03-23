package Funcionario;

public enum Turno {
DIA("Ele trabalha de dia"),
NOITE("Ele trabalha de noite"),
TARDE("Ele trabalha de tarde"),
TURNO_DIURNO("Turno Diurno"),
TURNO_NOTURNO("Turno Noturno"),
TURNO_VESPERTINO("Turno Vespertino");
	private String menssagem;
	
	Turno(String MsgPadrao){
		this.menssagem = MsgPadrao;
	}
	
	public String getMensssagem() {
		return this.menssagem;
	}
}
