package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import model.Instrutor;

@ManagedBean
public class InstrutorBean {

	private List<Instrutor> instrutores = new ArrayList<Instrutor>();
	
	public InstrutorBean(){
		Instrutor pessoa1 = new Instrutor();
		pessoa1.setNome("Maytê");
		pessoa1.setDataDeNascimento("14/07/1996");
		
		Instrutor pessoa2 = new Instrutor();
		pessoa2.setNome("Laura");
		pessoa2.setDataDeNascimento("14/09/1996");
		
		this.instrutores.add(pessoa1);
		this.instrutores.add(pessoa2);
	}
	
	public List<Instrutor> getInstrutores(){
		return instrutores;
	}
	
	public void setInstrutores(List<Instrutor> instrutores){
		this.instrutores = instrutores;
	}
	
}
