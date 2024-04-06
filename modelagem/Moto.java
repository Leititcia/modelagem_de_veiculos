package modelagem_de_veiculos;

public class Moto {
	
	//atributos
	String marca;
	String modelo;
	int ano;
	String cor;
	int cilindradas;
	
	//construtores
	Moto(){
		
	}
	
	Moto(String marca, String modelo, int ano, String cor, int cilindradas){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.cilindradas = cilindradas;
	}
	
	//método
	void descricao() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano 
							+ ", Cor: " + cor + ", Cilindradas: " + cilindradas);
	}
}
