package heranca2;

public class Main {
	public static void main (String[] args) {
		Pessoa_Fisica pessoa_fisica = new Pessoa_Fisica();

		pessoa_fisica.setCpf("3383883.33");
		pessoa_fisica.setNome("Flávio");
		pessoa_fisica.setTelefone("33333333");
		
		pessoa_fisica.Salvar(pessoa_fisica);
		pessoa_fisica.Validar(pessoa_fisica);
		pessoa_fisica.Excluir(pessoa_fisica);
		
		Pessoa_Juridica pessoa_Juridica = new Pessoa_Juridica();
		
		pessoa_Juridica.setNome("Empresa XY");
		pessoa_Juridica.setCnpj("3232323...22");
		pessoa_Juridica.setTelefone("44444");
		pessoa_Juridica.Salvar(pessoa_Juridica);
		pessoa_Juridica.Validar(pessoa_Juridica);
	}
}
