package modelagem_de_veiculos;

public class principal {

	public static void main(String[] args) {

		//instanciar o objeto
		Carro carro1 = new Carro("Fiat", "Coupé", 1995, 2, "Amarelo");
		
		//instanciar o objeto
		Moto moto1 = new Moto("Honda", "CBR500R", 2021, "Vermelho", 500);
		
		
		carro1.descricao();
		moto1.descricao();

	}

}
