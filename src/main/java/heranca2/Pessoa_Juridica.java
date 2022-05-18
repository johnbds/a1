package heranca2;

public class Pessoa_Juridica extends Pessoa{
	
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void Salvar(Pessoa pessoa) {
		System.out.println("Eu salvo pessoa jurídica "+pessoa.getNome());
	}

	@Override
	public void Validar(Pessoa pessoa) {
		System.out.println("Eu validei pessoa jurídica "+pessoa.getNome());
	}
	
	

}
