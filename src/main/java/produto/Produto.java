package produto;

public class Produto {
	private int idProduto;
	private String descricao_produto;
	private Marca marca;
	private Grupo grupo;
	
	public Produto() {
		
	}
	
	public Produto(int idProduto, String descricao) {
		this.idProduto = idProduto;
		this.descricao_produto = descricao;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getDescricao_produto() {
		return descricao_produto;
	}
	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
