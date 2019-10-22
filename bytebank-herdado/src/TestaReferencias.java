
public class TestaReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(2000);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(designer);
		controle.registra(editor);
		controle.registra(gerente);
		
		System.out.println(controle.getSoma());
	}
		

}
