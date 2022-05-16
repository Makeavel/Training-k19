package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean (name = "calculadora")

public class CalculaImpostoBean {

	@ManagedProperty(value="#{taxas}")
	private TaxasBean taxas;
	
	private double montante;
	private double juros;
	
	public void calculaJuros(){
		this.setJuros(this.montante * this.taxas.getSelic()/100);
	}

	public TaxasBean getTaxas() {
		return taxas;
	}

	public void setTaxas(TaxasBean taxas) {
		this.taxas = taxas;
	}
	
	
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public double getMontante(){
		return montante;
	}
	
	public void setMontante(double montante){
		this.montante = montante;
	}
	
	
}
