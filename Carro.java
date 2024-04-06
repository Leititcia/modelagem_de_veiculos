package modelagem_de_veiculos;

public class Carro {

	//atributos
	String marca;
	String modelo;
	int ano;
	int numero_portas;
	String cor;
	
	//construtores
	Carro() {
		
	}
	
	Carro(String marca, String modelo, int ano, int numero_portas, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.numero_portas = numero_portas;
		this.cor = cor;
	}
	
	//método
	void descricao() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano 
							+ ", Portas: " + numero_portas + ", Cor: " + cor);
	}
}
