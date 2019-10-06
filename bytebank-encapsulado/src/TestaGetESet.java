
public class TestaGetESet {

	public static void main(String[] args) {
			
			Conta conta = new Conta(123, 567);
			conta.setNumero(1337);
			System.out.println(conta.getNumero());
			
			Cliente paulo = new Cliente();
			//conta.titular = paulo;
			paulo.setNome("paulo silveira");
			
			conta.setTitular(paulo);
			
			System.out.println(conta.getTitular().getNome());
			conta.getTitular().setProfissao("Programador");
			System.out.println(conta.getTitular().getProfissao());
			
			Cliente titularDaConta = conta.getTitular();
			titularDaConta.setProfissao("professor");
			
			System.out.println(titularDaConta.getProfissao());
			
			
	}

}
