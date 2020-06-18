package prueba2;

/**
* 
* Eduardo Herrera V.
* 17-06-2020
* Clase Principal
*/

public class principal {

	public static void main(String[] args) {

		int i = 0;
		double totalElectro = 0;
		double totalLavadora = 0;
		double totalTelevision = 0;

		/**
		* Arreglo para almacenar información de objetos
		*/
		Electrodomestico[] arrElectro = new Electrodomestico[10];

	
		arrElectro[0] = new Electrodomestico(350000, 20, "lila", 'H');
		arrElectro[1] = new Electrodomestico();
		arrElectro[2] = new Electrodomestico(500000, 10);
		arrElectro[3] = new Lavadora(210000, 32, "dorada", 'H', 8);
		arrElectro[4] = new Electrodomestico(210, 35, "rojo", 'F');
		arrElectro[5] = new Television(320, 80);
		arrElectro[6] = new Television(380000, 20, "azul", 'C', 25, false);
		arrElectro[7] = new Lavadora(250000, 28, "azul", 'C', 25);
		arrElectro[8] = new Television(200000, 50, "rojo", 'E', 32, true);
		arrElectro[9] = new Electrodomestico(390000, 32, "negro", 'B');

		/**
		* Acumulación de montos por Electrodomestico, Lavadora y Television
		*/
		for (i = 0; i < arrElectro.length; i++) {
			if (arrElectro[i] instanceof Electrodomestico) {
				totalElectro = totalElectro + arrElectro[i].precioFinal();
			}
			if (arrElectro[i] instanceof Lavadora) {
				totalLavadora = totalLavadora + arrElectro[i].precioFinal();
			}
			if (arrElectro[i] instanceof Television) {
				totalTelevision = totalTelevision + arrElectro[i].precioFinal();
			}
		}

		/**
		* Despliegue de totales
		*/
		System.out.println("Valor Electrodomesticos ...: " + totalElectro);
		System.out.println("Valor Lavadoras ...........: " + totalLavadora);
		System.out.println("Valor Televisores .........: " + totalTelevision);

	}
}
