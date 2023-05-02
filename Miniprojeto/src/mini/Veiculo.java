package mini;

public abstract class Veiculo{
	
	protected String marca;
	protected int ano_fab;
	protected int id;
	protected float datasaida;
	protected float datachegada;
	protected float horariosaida;
	protected float horariochegada;
	protected int assentos;
	protected int passageiros;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	
	
	public int getAno() {
		return ano_fab;
	}
	public void setAno(int ano_fab) {
		this.ano_fab=ano_fab;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	
	
	public float getDatasaida() {
		return datasaida;
	}
	public void setDatasaida(float datasaida) {
		this.datasaida=datasaida;
	}
	
	
	
	public float getDatachegada() {
		return datachegada;
	}
	public void setDatachegada(float datachegada) {
		this.datachegada=datachegada;
	}
	
	
	
	public float getHorariosaida() {
		return horariosaida;
	}
	public void setHorariosaida(float horariosaida) {
		this.horariosaida=horariosaida;
	}
	
	
	
	public float getHorariochegada() {
		return horariochegada;
	}
	public void setHorariochegada(float horariochegada) {
		this.horariochegada=horariochegada;
	}
	
	

	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos=assentos;
	}
	
	
	
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros=passageiros;
	}
	


class association{
	public static void main(String[]args) {
		Itinerario iti = new Itinerario();
		Onibus oni = new Onibus();
		Trem trem = new Trem();
		Aviao avi = new Aviao();
	}
}
}
