package Funcionario;

public class AssistenteAdministrativo extends Assistente{
	
	private Turno turno;
	private double adicionalNoturno;
	
	public String getTurno() {
		return turno.getMensssagem();
	}
	public void setTurno(int turno) {
		if(turno == 2) {
			this.turno = Turno.DIA;
		}else if(turno == 1) {
			this.turno = Turno.NOITE;
			adicionalNoturno = 150;
			super.setSalario(getSalario()+adicionalNoturno);
		}else if(turno == 3) {
			this.turno = Turno.TARDE;
		}
	}
	
}
