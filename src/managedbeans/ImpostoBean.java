package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "impostometro")
@SessionScoped
public class ImpostoBean {

	private double total;
	private double valor;
	
	public void adicionarImposto(){
		this.setTotal(this.getTotal() + this.valor);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getValor(){
		return valor;
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	
	
}
