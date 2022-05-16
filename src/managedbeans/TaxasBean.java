package managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "taxas")
public class TaxasBean {

	private double selic = 3.5;

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}
}
