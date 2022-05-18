package heranca2;

public abstract class Pessoa {
	private int idPessoa;
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int idPessoa, String nome, String endereco, String telefone) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public abstract void Salvar(Pessoa pessoa);
	public abstract void Validar(Pessoa pessoa);
	
	public void Excluir(Pessoa pessoa) {
		System.out.println("Exclui a pessoa "+pessoa.getNome());
	}
}
