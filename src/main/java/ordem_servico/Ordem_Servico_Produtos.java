package ordem_servico;

public class Ordem_Servico_Produtos {
	private int id;
	private Ordem_Servico ordem_Servico;
	private Produto produto;
	private int qtde;
	private double valor_total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ordem_Servico getOrdem_Servico() {
		return ordem_Servico;
	}
	public void setOrdem_Servico(Ordem_Servico ordem_Servico) {
		this.ordem_Servico = ordem_Servico;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
}
