package produto;

public class Grupo {
	private int idGrupo;
	private String descricao;
	
	public Grupo() {
		
	}
	
	public Grupo(int idGrupo, String descricao) {
		this.idGrupo = idGrupo;
		this.descricao = descricao;
	}
	
	public int getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
