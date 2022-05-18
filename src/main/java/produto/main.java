package produto;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		
		Grupo grupo1 = new Grupo();
		grupo1.setIdGrupo(1);
		grupo1.setDescricao("Enlatados");
		
		Marca marca1 = new Marca();
		marca1.setIdMarca(1);
		marca1.setDescricao("Elefante");
		
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.setIdFornecedor(1);
		fornecedor1.setNomeFornecedor("Arisco");
		
		Filial filial1 = new Filial();
		filial1.setIdFilial(1);
		filial1.setNome_fantasia("Filial 1");
		filial1.setEndereco("Rua X");
		filial1.setTelefone("64-xxxx.yyyy");
		filial1.setCnpj("12.345.789/0001-10");
		
		Filial filial2 = new Filial();
		filial2.setIdFilial(1);
		filial2.setNome_fantasia("Filial 2");
		filial2.setEndereco("Rua Y");
		filial2.setTelefone("64-yyyy.xxxx");
		filial2.setCnpj("12.345.789/0001-10");
		
		Produto produto1 = new Produto();
		produto1.setIdProduto(1);
		produto1.setDescricao_produto("Estrato de tomate 200g");
		produto1.setGrupo(grupo1);
		produto1.setMarca(marca1);
		
		ProdutoFilial produtoFilial1 = new ProdutoFilial();
		produtoFilial1.setProduto(produto1);
		produtoFilial1.setFilial(filial1);
		produtoFilial1.setQtde(4);
		
		ProdutoFilial produtoFilial2 = new ProdutoFilial();
		produtoFilial2.setProduto(produto1);
		produtoFilial2.setFilial(filial2);
		produtoFilial2.setQtde(3);
		
		Produto produto2 = new Produto();
		produto2.setIdProduto(2);
		produto2.setDescricao_produto("Arroz cristal 5kg");
		produto2.setGrupo(grupo1);
		produto2.setMarca(marca1);

	}

}
