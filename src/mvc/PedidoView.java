package mvc;

public class PedidoView {
	public void imprimePedidoCliente(int idPedido, int fkCliente, String nfe, String dtEmissao, double valorTotal,
			String status) {
		System.out.println("--- Pedido ---");
		System.out.println("C�digo do Pedido: " + idPedido);
		System.out.println("C�digo do Cliente: " + fkCliente);
		System.out.println("N�mero da nota fiscal: " + nfe);
		System.out.println("Data da compra: " + dtEmissao);
		System.out.println("Valor total do pedido: R$ " + valorTotal);
		System.out.println("Status do pedido: " + status + "\n");
	}
}