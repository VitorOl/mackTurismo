package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatasDeVoos {	

	private List<String> datas = new ArrayList<String>();
	private double valor=0;
	
	public DatasDeVoos() {
		datas.add("10/10/2014");
		datas.add("13/10/2014");
		datas.add("17/10/2014");
	}
	
	public double calculaData() {
		
		for (int i=0; i<this.datas.size(); i++) {
			if (datas.get(i) == "10/10/2014") {
				valor = 50;
			}
			
			else if (this.datas.get(i) == "13/10/2014") {
				valor = 20;
			}
			
			else if (this.datas.get(i) == "17/10/2014") {
				valor = 50;
			}
		}
		
		return valor;
	}
	
}
