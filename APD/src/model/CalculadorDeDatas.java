package model;

import java.util.Date;
/**
* @author Vitor, Lígia e Salomão
 *
 *A interface CalculadorDeDatas tem por objetivo, facilitar
 *a manipulação o calculo de dias no sistema. Para 
 *encapsular a utilização da api Date e Calendar
 *foi o utilizado o padrão Adapter
 */

public interface CalculadorDeDatas {
public String somadorDias(int dias);
public String somadorDias(int dias, Date date);



}
