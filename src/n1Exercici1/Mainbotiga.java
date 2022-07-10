package n1Exercici1;

public class Mainbotiga {

	public static void main(String[] args) {
		
		
		Producte producte1 = new Producte("Oli",6.15);
		
		Producte producte2 = new Producte("Arros",2.20);
		
		Producte producte3 = new Producte("Alvocat",4.77);
		
		
		Venda.productes.add(producte1);
		Venda.productes.add(producte2);
		Venda.productes.add(producte3);
		
		
		
		try {
			Venda.calcularTotal();
		
		}catch (VendaBuidaException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		

	}

}
