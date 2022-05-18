
public class main {

	public static void main(String[] args) {
		Cargo cargo = new Cargo();
		cargo.setDescricao("Teste");
		cargo.setId(1);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(cargo);
		
		funcionario.setNome("Flávio");
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCargo().getDescricao());
	}

}
