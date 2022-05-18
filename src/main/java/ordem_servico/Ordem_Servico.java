package ordem_servico;

import java.sql.Date;

public class Ordem_Servico {
	private int idOS;
	private Date data_os;
	private Date data_previsao_entrega;
	private int garantia;
	private String placa_veiculo;
	
	public int getIdOS() {
		return idOS;
	}
	public void setIdOS(int idOS) {
		this.idOS = idOS;
	}
	public Date getData_os() {
		return data_os;
	}
	public void setData_os(Date data_os) {
		this.data_os = data_os;
	}
	public Date getData_previsao_entrega() {
		return data_previsao_entrega;
	}
	public void setData_previsao_entrega(Date data_previsao_entrega) {
		this.data_previsao_entrega = data_previsao_entrega;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public String getPlaca_veiculo() {
		return placa_veiculo;
	}
	public void setPlaca_veiculo(String placa_veiculo) {
		this.placa_veiculo = placa_veiculo;
	}
}
