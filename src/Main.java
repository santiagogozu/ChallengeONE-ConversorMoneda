import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Object[] opMenu = { "Conversor de Moneda",
				"Conversor de Temperatura"};
		
		Object[] opMonedas = { "De COP a Dolares",
				"De COP a Euros",
				"De COP a Libras Esterlinas",
				"De COP a Yen Japonés",
				"De COP a Won sul-coreano",
				"De Dolares a COP",
				"De Euros a COP",
				"De Libras Esterlinas a COP",
				"De Yen Japonés COP",
				"De Won sul-coreano a COP a"};
		
		Object[] opTemperatura = { "Grados Celcius a Grados Farenheit",
				"Grados Celcius a Kelvin",
				"Grados Farenheit a Grados Celcius",
				"Kelvin a Grados Celcius",
				"Kelvin a Grados Farenheit"};
		
		
		Object option = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversión", "Menu",  JOptionPane.PLAIN_MESSAGE, null, opMenu,
				opMenu[0]);
		
		System.out.println(option);
		
		if (option == "Conversor de Moneda" ) {
			JOptionPane.showInputDialog(null,"Seleccione una opcion de conversión", "Menu",  JOptionPane.INFORMATION_MESSAGE, null, opMonedas,
					opMonedas[0]);
		} else if (option == "Conversor de Temperatura" ) {
			JOptionPane.showInputDialog(null,"Seleccione una opcion de conversión", "Menu",  JOptionPane.INFORMATION_MESSAGE, null, opTemperatura,
					opTemperatura[0]);
		}

	}
}
