package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("Escolher lanche");
	}

	public void fazerPedido() {
		System.out.println("Fazendo pedido");
		
	}
	
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("Pagando a conta");
	}


	private void consultarSaldoAplicativo() {
		System.out.println("consultando saldo no aplicativo");
	}
	

}