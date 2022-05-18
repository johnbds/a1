
public class Cliente {
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String nome_esposa;
	
	private Profissao profissao;
	private Escolaridade escolaridade;
	private Estado_Civil estado_Civil;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome_esposa() {
		return nome_esposa;
	}
	public void setNome_esposa(String nome_esposa) {
		this.nome_esposa = nome_esposa;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	public Estado_Civil getEstado_Civil() {
		return estado_Civil;
	}
	public void setEstado_Civil(Estado_Civil estado_Civil) {
		this.estado_Civil = estado_Civil;
	}
	
	
}
