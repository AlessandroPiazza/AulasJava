package Funcionario;

public class AssistenteTecnico extends Assistente{
	
	@Override
	public double calculoSalarioAnual() {
		
		return super.calculoSalarioAnual()+100;
	}
	
	
	
}
