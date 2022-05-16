package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PalavrasBean {
	private List<String> palavras = new ArrayList<String>();
	
	
	public PalavrasBean(){
		this.palavras.add("K19 Treinamento");
		this.palavras.add("Makeavel");
		this.palavras.add("PH");
		this.palavras.add("Maytê");
	}
	
	public List<String> getpalavras(){
		return this.palavras;
	}
	
	public void setPalavras(List<String> palavras){
		this.palavras = palavras;
	}

}
