package mini;
import java.util.ArrayList;
import java.util.List;

public class Itinerario {
	private String origem;
	private String destino;
	private List<Passagem> passagens; 
	
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem=origem;
	}
	
	
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino=destino;
	}
	
	public Itinerario() {
		this.passagens=new ArrayList<>();
	}
	
	int busca() {
		return 1;
	}
	int listar() {
		return 1;
	}
}