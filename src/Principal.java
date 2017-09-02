import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//Instaciar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Recuperar a lista de filmes e usuarios
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuario = bds.getUsuarios();
		
		//Exibindo filmes que foram feitos depois do ano 2000
		for (int i = 0; i < filmes.size(); i++) {
			if (filmes.get(i).getAnoLancamento() > 2000) {
				System.out.println(filmes.get(i).getTitulo() + " / " + filmes.get(i).getGenero());				
			}
			
		}
		
		//Exibindo filmes que foram feitos no ano de 1997
		ArrayList<Filme> filmesPorAno = bds.getFilmesPorAno(1999);
		
		//Imprimir
		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo());
		}
		
		//Exibindo filmes que foram feitos por diretore informado
		ArrayList<Filme> filmesPorDiretor = bds.getFilmesPorDiretor("Marcos Vinicuis");
		
		//Imprimir
		for (int i = 0; i < filmesPorDiretor.size(); i++) {
			System.out.println(filmesPorDiretor.get(i).getTitulo() + " / " + filmes.get(i).getDiretor());
		}
		
		
		
		
		
	}


}