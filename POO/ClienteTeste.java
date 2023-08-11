package POO;

public class ClienteTeste {

	public static void main(String[] args) {

Cliente cliente1 = new Cliente("Patricia Alves",34,"patriciaalves@hotmail.com","99893-4567","Rua João XXIV,n°:234");
Cliente cliente2 = new Cliente("Francisco Cerqueira",48,"franciscocerqueira@gmail.com","99478-2317","Rua Antenor Barbosa,n°:87");


		System.out.println("Informações do cliente 1: ");
		cliente1.imprimirInfo();
		System.out.println();

		System.out.println("Informações do cliente 2: ");
		cliente2.imprimirInfo();
		System.out.println();


	}

}
