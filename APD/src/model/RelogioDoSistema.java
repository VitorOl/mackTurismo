package model;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
/**
* @author Vitor, L�gia e Salom�o
 *
 *A classe relogioDo Sistema tem por objetivo, facilitar
 *a manipula��o de datas no sistema e utiliza-la de forma mais simples, portanto, para 
 *encapsular a utiliza��o da api Date e Calendar
 *foi o utilizado o padr�o Adapter
 */
public class RelogioDoSistema implements Relogio, CalculadorDeDatas {

	public String diaAtual() {
	Calendar cal = Calendar.getInstance();
	
	Date dia = cal.getTime();
	DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT);
	String today = dt.format(dia);
		return today;
	}

	

	public String somadorDias(int dias) {
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DAY_OF_YEAR,dias);
		Date d = cal.getTime();
		DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT);
		String dia = dt.format(d);
		return dia;
	}

	public String somadorDias(int dias, Date date) {
		Calendar cal = Calendar.getInstance();
		
		cal.add(date.getDate(), dias);
		Date d = cal.getTime();
		DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT);
		String dia = dt.format(d);
		return dia;
		
	}

}
