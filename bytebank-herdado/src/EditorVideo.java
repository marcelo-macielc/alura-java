
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("CHAMANDO O METODO GET BONIFICACAO DO EDITOR DE VIDEO");
		return super.getBonificacao() + 150;
	}
	
}
