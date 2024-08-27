package apps;

public class MSNMensseger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Envia mensagem Pelo MSN");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebe mensagem Pelo MSN");
		
	}
		
		
}
