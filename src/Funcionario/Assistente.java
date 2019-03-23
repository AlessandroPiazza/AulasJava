package Funcionario;

public class Assistente extends Funcionario {
	
	private int matricula;
	private String cargo;
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String tipoAssistente) {
		this.cargo = tipoAssistente;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public String getMatriculaString() {
		StringBuilder str = new StringBuilder();
		
		str.append(matricula);
		return str.toString();
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String mostrarDados() {
		StringBuilder msg = new StringBuilder();
		msg.append(super.mostrarDados());
		msg.append("\n");
		msg.append("Numero da matricula: ");
		msg.append(this.matricula);
		msg.append("\n");
		msg.append("Cargo: ");
		msg.append(this.cargo);
		

	    		return msg.toString();
		
	}
}
