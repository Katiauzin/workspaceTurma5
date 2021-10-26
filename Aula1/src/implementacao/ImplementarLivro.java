package implementacao;

import beans.Livro;

public class ImplementarLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Iniciando");	
		
		Livro exemplar1 = new Livro();	
		
		exemplar1.titulo = "Programação Java";
		exemplar1.editora = "Atlas Editora";
		exemplar1.autor = "Galoni;Jo";
		
		System.out.println("Exemplar1: " + exemplar1.titulo );
		System.out.println("- Editora: " + exemplar1.editora );
		System.out.println("- Autor: " + exemplar1.autor);
		
		
		Livro exemplar2 = new Livro();
		exemplar2.titulo ="Database BigData";
		exemplar2.editora = "Books";
		
		System.out.println("Exemplar2: " + exemplar2.titulo );
		System.out.println("- Editora: " + exemplar2.editora);
		System.out.println("- Autor: " + exemplar2.autor);
		
		exemplar1.titulo = "Java Web";
		System.out.println("Exemplar1: " + exemplar1.titulo );
		
	}
}