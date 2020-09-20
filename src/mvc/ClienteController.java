package mvc;

public class ClienteController {
	private Cliente model;
	private ClienteView view;

	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}

	public void setIdCliente(int idCliente) {
		model.setIdCliente(idCliente);
	}

	public int getIdCliente() {
		return model.getIdCliente();
	}

	public void setNome(String nome) {
		model.setNome(nome);
	}

	public String getNome() {
		return model.getNome();
	}

	public void setCpf(String cpf) {
		model.setCpf(cpf);
	}

	public String getCpf() {
		return model.getCpf();
	}

	public void setRg(String rg) {
		model.setRg(rg);
	}

	public String getRg() {
		return model.getRg();
	}

	public void setDataNascimento(String dataNascimento) {
		model.setDtNascimento(dataNascimento);
	}

	public String getDataNascimento() {
		return model.getDtNascimento();
	}

	public void setEmail(String email) {
		model.setEmail(email);
	}

	public String getEmail() {
		return model.getEmail();
	}

	public void atualizarView() {
		view.imprimeDadosCliente(model.getIdCliente(), model.getNome(), model.getCpf(), model.getRg(),
				model.getDtNascimento(), model.getEmail());
	}
}
