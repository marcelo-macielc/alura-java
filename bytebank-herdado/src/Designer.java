
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("CHAMANDO O METODO GET BONIFICACAO DESGINER");
		return super.getBonificacao() + 200;
	}
	
}
