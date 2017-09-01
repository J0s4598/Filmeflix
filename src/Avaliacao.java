
public class Avaliacao {
	//Atributo
	private Usuario usuario;
	private int nota;
	
	//Metodo Construtor
	public Avaliacao(Usuario usuario, int nota) {
		super();
		this.usuario = usuario;
		this.nota = nota;
	}

	//Metodo Get e Set
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	
	
	
	
	

}
