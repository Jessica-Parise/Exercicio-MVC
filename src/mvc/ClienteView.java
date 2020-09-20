package mvc;

public class ClienteView {
	public void imprimeDadosCliente(int idCliente, String nome, String cpf, String rg, String dtNascimento,
			String email) {
		System.out.println("--- Cliente ---");
		System.out.println("Código do cliente: " + idCliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Data de Nascimento: " + dtNascimento);
		System.out.println("Seu e-mail: " + email + "\n");
	}
}
