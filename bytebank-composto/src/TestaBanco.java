
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente marcelo = new Cliente ();
		marcelo.nome = "Marcelo Maciel";
		marcelo.cpf = "222.222.222-22";
		marcelo.profissao = "Programador";
		
		Conta contaDoMarcelo = new Conta ();
		contaDoMarcelo.deposita(100);
		
		contaDoMarcelo.titular = marcelo;
		
		System.out.println(contaDoMarcelo.titular.nome);
		System.out.println(contaDoMarcelo.titular);
		System.out.println(marcelo);
		System.out.println(contaDoMarcelo.titular.cpf);
		
		
		
		
	}
}
