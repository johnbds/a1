package ordem_servico;

public class Ordem_Servico_Servicos {
	private int id;
	private Ordem_Servico ordem_Servico;
	private Servico servico;
	private double valor;
	
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
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
