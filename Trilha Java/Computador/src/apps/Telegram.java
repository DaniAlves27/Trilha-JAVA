package apps;

public class Telegram  extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Envia mensagem Pelo Telegram");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebi mensagem Pelo Telegram");
		
	}


}
