package heranca2;

public class Pessoa_Fisica extends Pessoa{

	public Pessoa_Fisica() {
		super(1, "Flávio", "", "");
	}
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void Salvar(Pessoa pessoa) {
		System.out.println("Eu salvei a pessoa física "+pessoa.getNome());
	}

	@Override
	public void Validar(Pessoa pessoa) {
		System.out.println("Eu validei a pessoa física "+pessoa.getNome());
	}
	
	
	
}
