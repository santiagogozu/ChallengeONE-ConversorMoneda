import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String optionTemperatura = null;
		String temperaturaStr = null;
		double temperaturaConvertir = 0;

		// Creamos variable clase Celcius
		GradosCelcius celConver = new GradosCelcius();
		// Creamos variable clase Celcius
		GradosFarenheit farConver = new GradosFarenheit();

		// Creamos variable clase Kelvin
		GradosKelvin kelConver = new GradosKelvin();

		Object[] opMenu = { "Conversor de Moneda", "Conversor de Temperatura" };

		Object[] opMonedas = { "De COP a Dolares", "De COP a Euros", "De COP a Libras Esterlinas",
				"De COP a Yen Japonés", "De COP a Won sul-coreano", "De Dolares a COP", "De Euros a COP",
				"De Libras Esterlinas a COP", "De Yen Japonés COP", "De Won sul-coreano a COP" };

		Object[] opTemperatura = { "Celcius a Farenheit", "Celcius a Kelvin", "Farenheit a Celcius", "Kelvin a Celcius",
				"Kelvin a Farenheit" };

		Object option = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, opMenu, opMenu[0]);

		if (option == "Conversor de Moneda") {
			JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, opMonedas, opMonedas[0]);
		} else if (option == "Conversor de Temperatura") {

			// Obtenemos valor de temperatura a convertir
			temperaturaStr = JOptionPane.showInputDialog("Ingrese valor de temperatura que desee convertir");

			// Convierte String a Double
			temperaturaConvertir = Double.parseDouble(temperaturaStr);

			// Obtenemos valor escala de conversion
			optionTemperatura = (String) JOptionPane.showInputDialog(null,
					"Seleccione una opcion de conversión de temperatura", "Menu", JOptionPane.INFORMATION_MESSAGE, null,
					opTemperatura, opTemperatura[0]);
		}

		if (optionTemperatura == "Celcius a Farenheit") {

			// Enviamos valor de grados a convertir
			celConver.setGradosAConertir(temperaturaConvertir);

			// Enviamos opciona convertir 1 corresponde C a F
			celConver.setEscalaAConvertir(1);

			// Imprimimos respuesta
			JOptionPane.showMessageDialog(null, celConver.getCoversion());

		} else if (optionTemperatura == "Celcius a Kelvin") {

			// Enviamos valor de grados a convertir
			celConver.setGradosAConertir(temperaturaConvertir);

			// Enviamos opciona convertir 2 corresponde C a K
			celConver.setEscalaAConvertir(2);

			// Imprimimos respuesta
			JOptionPane.showMessageDialog(null, celConver.getCoversion());

		} else if (optionTemperatura == "Farenheit a Celcius") {
			// Enviamos valor de grados a convertir
			farConver.setGradosAConertir(temperaturaConvertir);

			// Imprimimos respuesta
			JOptionPane.showMessageDialog(null, farConver.getCoversion());

		} else if (optionTemperatura == "Kelvin a Celcius") {

			// Enviamos valor de grados a convertir
			kelConver.setGradosAConertir(temperaturaConvertir);

			// Enviamos opciona convertir 2 corresponde K a C
			kelConver.setEscalaAConvertir(1);

			// Imprimimos respuesta
			JOptionPane.showMessageDialog(null, kelConver.getCoversion());
		} else if (optionTemperatura == "Kelvin a Farenheit") {

			// Enviamos valor de grados a convertir
			kelConver.setGradosAConertir(temperaturaConvertir);

			// Enviamos opciona convertir 2 corresponde K a F
			kelConver.setEscalaAConvertir(2);

			// Imprimimos respuesta
			JOptionPane.showMessageDialog(null, kelConver.getCoversion());
		}
	}
}
