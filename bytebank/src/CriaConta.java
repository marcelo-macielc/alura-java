
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		System.out.println(primeiraConta.saldo+=100);
		
		Conta segundaConta = new Conta ();
		
		segundaConta.saldo = 50;
		
		System.out.println("Na primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Na segunda conta tem: " + segundaConta.saldo);
		System.out.println(segundaConta.agencia);
		System.out.println(primeiraConta.titular);
		
	}
}
