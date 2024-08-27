package apps;

public class FacebookMensseger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Envia mensagem Pelo FacebookMensseger");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebe mensagem Pelo FacebookMensseger");
		
	}


}
