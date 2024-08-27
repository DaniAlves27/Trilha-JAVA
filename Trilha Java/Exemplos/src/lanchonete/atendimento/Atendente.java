package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarPedidoNoBalcao();
		pegarLancheCozinha();
		System.out.println("Servindo mesa");
	}

	private void pegarLancheCozinha() {
		System.out.println("Pegando lanche na cozinha");
	}

	public void receberPagamento() {
		System.out.println("Recebendo pagamento");
	}

	void trocarGas() {
		System.out.println("Atendente trocando o gas");
	}

	private void pegarPedidoNoBalcao() {
		System.out.println("Pegando pedido no balcão");
	}

}