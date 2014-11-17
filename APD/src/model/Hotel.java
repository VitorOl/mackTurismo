package model;
/**
 * 
 * @author Vitor
 *Classe responsável por representar o hotel
 *e instanciar o quarto
 *
 */
public class Hotel {

	Long id;
	String nome;
	String endereco;
	Quarto[]quartos;
	
	public Hotel(String nome, String endereco){
		super();
		this.nome = nome;
		this.endereco = endereco;
		
		quartos = new Quarto[100];
		
		
	}
	
}
