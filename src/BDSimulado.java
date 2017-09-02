import java.util.ArrayList;

public class BDSimulado {
	//Atributo
	private ArrayList<Filme> filmes;
	private ArrayList<Usuario> usuarios;
	
	//Metodo construtor
	public BDSimulado(){
		//Instanciar o atributo filmes
		this.filmes = new ArrayList<Filme>();
		
		//Instanciar objetos da classe Filme
		Filme f1 = new Filme("Star Wars I", "Marcos Vinicuis", 1977, "Ficção Cientifica");
		Filme f2 = new Filme("Star Wars: O Despertar da Força", "Marcos Vinicuis", 2015, "Ficção Cientifica");
		Filme f3 = new Filme("Forrest Gump", "Robert Zemeckis", 1994, "Drama");
		Filme f4 = new Filme("Clube da Luta", "David Fincher", 1999, "Drama");
		Filme f5 = new Filme("Os Outro", "Alejandro Amenábra", 2001, "Suspense");
		Filme f6 = new Filme("Titanic", "James Cameron", 1997, "Romance");
		
		//Colocar os filmes na lista
		this.filmes.add(f1);
		this.filmes.add(f2);
		this.filmes.add(f3);
		this.filmes.add(f4);
		this.filmes.add(f5);
		this.filmes.add(f6);
		
		//Instanciar o atributo usuarios
		this.usuarios = new ArrayList<Usuario>();
		
		//Instaciar objeto fa classe Usuario
		Usuario u1 = new Usuario("João", "Masculino", 55);
		Usuario u2 = new Usuario("José", "Masculino", 18);
		Usuario u3 = new Usuario("Adão", "Masculino", 35);
		Usuario u4 = new Usuario("Vanessa", "Feminino", 29);
		Usuario u5 = new Usuario("Emma", "Feminino", 25);
		Usuario u6 = new Usuario("Alexandra", "Feminino", 21);
		
		//Colocar os usuarios na lista
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		this.usuarios.add(u4);
		this.usuarios.add(u5);
		this.usuarios.add(u6);
		
			
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	//Metodo que retorna a lista de filmes de um ano informado
	public ArrayList<Filme> getFilmesPorAno(int ano){
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		//Percorrer a lista de filmes
		for (int i = 0; i < this.filmes.size(); i++) {
			//Verificar se o filme é do ano informado
			if (this.filmes.get(i).getAnoLancamento() == ano) {
				resultado.add(this.filmes.get(i));
			}
			
		}
		return resultado;
	}
	
	//Metodo que retorna a lista de filmes de um direor informado
	public ArrayList<Filme> getFilmesPorDiretor(String diretor){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		//percorrer a lista de filmes
		for (int i = 0; i < this.filmes.size(); i++) {
			//Verificar se o filme é do  diretor
			if (this.filmes.get(i).getDiretor().equals(diretor)){
				resultado.add(this.filmes.get(i));
			}
			
		}
		return resultado;
		
		
		
	}
	
	
	
	

}
