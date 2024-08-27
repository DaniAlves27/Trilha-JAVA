package computadorPedrinho;

import apps.FacebookMensseger;
import apps.MSNMensseger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class App {

	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido ="msn";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMensseger();
		}else if(appEscolhido.equals("fbm")){
			smi = new FacebookMensseger();
		}else if(appEscolhido.equals("tel")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		//System.out.println("MSN");
		//MSNMensseger msn = new MSNMensseger();
		//msn.enviarMensagem();
		//msn.receberMensagem();
		
		//System.out.println("Facebook");
		//FacebookMensseger fbc = new FacebookMensseger();
		//fbc.enviarMensagem();
		//fbc.receberMensagem();
		
		
		//System.out.println("Telegram");
		//Telegram tel = new Telegram();
		//tel.enviarMensagem();
		//tel.receberMensagem();

	}

}
