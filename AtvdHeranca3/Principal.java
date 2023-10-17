package AtvdHeranca3;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto (1,"Cainan",22.00);
		
		System.out.println("Produto:");
		System.out.println("Id:"+produto.getId());
		System.out.println("Modelo:"+produto.getNome());
		System.out.println("Ano:"+produto.getPreco());
		
		Sorvete sorvete = new Sorvete (1,"Cainan",22.00,22);
		System.out.println("Sorvete:");
		System.out.println("Id:"+sorvete.getId());
		System.out.println("Modelo:"+sorvete.getNome());
		System.out.println("Ano:"+sorvete.getPreco());
		System.out.println("TempAdequada:"+sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa(1,"Cainan",22.00,"AZUL","POLIESTER","22");
		System.out.println("Camisa:");
		System.out.println("Id:"+camisa.getId());
		System.out.println("Modelo:"+camisa.getNome());
		System.out.println("Ano:"+camisa.getPreco());
		System.out.println("Cor:"+camisa.getCor());
		System.out.println("Tecido:"+camisa.getTecido());
		System.out.println("Tamanho:"+camisa.getTamanho());
	}

}
