
public class veiculos {
	
	private int id;
	private String nome;
	private String marca;
	private String motor;
	private int ano;
	private int valor;
	private int kmatual;
	
	
	
	public veiculos(String nome, String marca, String motor, int ano, int valor, int kmatual) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.motor = motor;
		this.ano = ano;
		this.valor = valor;
		this.kmatual = kmatual;
	}
	@Override
	public String toString() {
		return "\nid: " + id  + ""
				+ "\nnome: "  + nome + ""
				+ "\nmarca: " + marca + ""
				+ "\nmotor: " + motor + ""
				+ "\nano: "   + ano +""
				+ "\nvalor: " + valor + ""
				+ "\nkmatual: " + kmatual;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getKmatual() {
		return kmatual;
	}
	public void setKmatual(int kmatual) {
		this.kmatual = kmatual;
	} 
	
	
	
	

}
