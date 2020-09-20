package mvc;

public class Programa {
	public static void main(String[] args) {

		Cliente cliente = getFromDB();
		ClienteView cv = new ClienteView();
		ClienteController cc = new ClienteController(cliente, cv);

		Telefone telefone = getFromDBTelefone();
		TelefoneView tv = new TelefoneView();
		TelefoneController tc = new TelefoneController(telefone, tv);

		Endereco endereco = getFromDBEndereco();
		EnderecoView ev = new EnderecoView();
		EnderecoController ec = new EnderecoController(endereco, ev);

		Produto produto = getFromDBProduto();
		ProdutoView pv = new ProdutoView();
		ProdutoController pc = new ProdutoController(produto, pv);

		Pedido pedido = getFromDBPedido();
		PedidoView pdv = new PedidoView();
		PedidoController pdc = new PedidoController(pedido, pdv);

		ProdutoPedido prodPed = getFromDBProdPed();
		ProdutoPedidoView ppv = new ProdutoPedidoView();
		ProdutoPedidoController ppc = new ProdutoPedidoController(prodPed, ppv);

		cc.atualizarView();
		tc.atualizarView();
		ec.atualizarView();
		pc.atualizarView();
		pdc.atualizarView();
		ppc.atualizarView();

	}

	public static Cliente getFromDB() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(2020123);
		cliente.setNome("Jéssica Parise");
		cliente.setCpf("xxx.xxxx.xxxx-xx");
		cliente.setRg("xx.xxx.xxx-x");
		cliente.setDtNascimento("xx/xx/2000");
		cliente.setEmail("meuemail@gmail.com");

		return cliente;
	}

	public static Telefone getFromDBTelefone() {
		Telefone telefone = new Telefone();
		telefone.setDdd("11");
		telefone.setNumero("xxxxxx-xxxx");
		telefone.setFk_idCliente(1856132);
		return telefone;
	}

	public static Endereco getFromDBEndereco() {
		Endereco endereco = new Endereco();

		endereco.setNumero(42);
		endereco.setRua("das Nações Unidas");
		endereco.setBairro("Brooklin");
		endereco.setComplemento("Casa B");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setFk_idCliente(20092020);
		return endereco;
	}

	public static Produto getFromDBProduto() {
		Produto produto = new Produto();

		produto.setIdProduto(136);
		produto.setNomeProduto("Teclado");
		produto.setDescricaoProduto("Teclado para computador de mesa");
		produto.setPrecoProduto(123.21);

		return produto;
	}

	public static Pedido getFromDBPedido() {
		Pedido pedido = new Pedido();

		pedido.setNfe("9784561652");
		pedido.setDtEmissao("01/01/2020");
		pedido.setValorTotal(624.12);
		pedido.setStatus("Entregue");
		pedido.setFk_idCliente(61254987);

		return pedido;
	}

	public static ProdutoPedido getFromDBProdPed() {
		ProdutoPedido produtoPedido = new ProdutoPedido();

		produtoPedido.setFk_idProduto(632);
		produtoPedido.setFk_idPedido(326);
		produtoPedido.setQtdeProduto(12);

		return produtoPedido;
	}
}