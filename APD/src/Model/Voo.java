package model;

import java.util.Date;
/**
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar os voos no sistema
 *
 */
public class Voo {
	
	private Date data;	
	private double valorTotal;
	private Aviao aviao;

	
	private int[] totalAssentos;
	private int contAssentos;
	
	private double valor;
	
	String local;
	
	public enum ClassesVoo {
		ECONOMICA("economica"),
		EXECUTIVA("executiva"),
		PRIMEIRA_CLASSE("primeira");

		String tipo;
		
		ClassesVoo(String tipo){
			this.tipo = tipo;
		}

			public String getTipo() {
				return tipo;
			}
}
	
	
	public Voo (Date data, String classeVoo, ListaDeVoos vooDesejado, int assento, String local) {
		this.data = data;
		this.totalAssentos = new int[aviao.assentos.length];
		this.local = local;
		
		if(classeVoo=="economica"){
			ClassesVoo classe = ClassesVoo.ECONOMICA;
			String classeAssento = classe.getTipo();
			valor = 1.000;
		}else if(classeVoo=="executiva"){
			ClassesVoo classe = ClassesVoo.EXECUTIVA;
			String classeAssento = classe.getTipo();
			valor = 2.000;
		}else{
			ClassesVoo classe = ClassesVoo.PRIMEIRA_CLASSE;
			String classeAssento = classe.getTipo();
			valor = 3.000;
		}
		
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public int[] getTotalAssentos() {
		return totalAssentos;
	}


	public void setTotalAssentos(int[] totalAssentos) {
		this.totalAssentos = totalAssentos;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
	

	
	
}
