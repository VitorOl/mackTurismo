package model;

import java.util.Date;
/**
* @author Vitor, L�gia e Salom�o
 *
 *A interface CalculadorDeDatas tem por objetivo, facilitar
 *a manipula��o o calculo de dias no sistema. Para 
 *encapsular a utiliza��o da api Date e Calendar
 *foi o utilizado o padr�o Adapter
 */

public interface CalculadorDeDatas {
public String somadorDias(int dias);
public String somadorDias(int dias, Date date);



}
