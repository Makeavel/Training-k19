package managedbeans;


@javax.faces.bean.ManagedBean
public class MoedaBean {
	
	public String proxima(){
		if(Math.random() < 0.5){
			return "cara";
		}
		else{
			return "coroa";
		}
	}
}
