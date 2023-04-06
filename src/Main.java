import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		boolean flag = true;
		while (flag) {
			String optionMoneda = "";
			String optionTemperatura = "";
			String temperaturaStr = "";
			String monedaStr = "";
			double temperaturaConvertir = 0;
			double monedaConvertir = 0;

			// Creamos variable clase Celcius
			GradosCelcius celConver = new GradosCelcius();
			// Creamos variable clase Celcius
			GradosFarenheit farConver = new GradosFarenheit();
			// Creamos variable clase Kelvin
			GradosKelvin kelConver = new GradosKelvin();
			// Creamos objeto monedas
			Monedas monedas = new Monedas();

			Object[] opMenu = { "Conversor de Moneda", "Conversor de Temperatura" };

			Object[] opTemperatura = { "Celcius a Farenheit", "Celcius a Kelvin", "Farenheit a Celcius",
					"Kelvin a Celcius", "Kelvin a Farenheit" };

			Object option = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, opMenu, opMenu[0]);

			if (option == "Conversor de Moneda") {
				optionMoneda = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
						JOptionPane.INFORMATION_MESSAGE, null, monedas.getOpMonedas(), monedas.getOpMonedas());
				monedaStr = JOptionPane.showInputDialog("Ingrese valor de temperatura que desee convertir");
				monedaConvertir = Double.parseDouble(monedaStr);
			} else if (option == "Conversor de Temperatura") {

				// Obtenemos valor de temperatura a convertir
				temperaturaStr = JOptionPane.showInputDialog("Ingrese valor de temperatura que desee convertir");

				// Convierte String a Double
				temperaturaConvertir = Double.parseDouble(temperaturaStr);

				// Obtenemos valor escala de conversion
				optionTemperatura = (String) JOptionPane.showInputDialog(null,
						"Seleccione una opcion de conversión de temperatura", "Menu", JOptionPane.INFORMATION_MESSAGE,
						null, opTemperatura, opTemperatura[0]);
			}

			switch (optionMoneda) {
			case "De COP a Dolares":
				JOptionPane.showMessageDialog(null, monedas.getCOP_DOL(monedaConvertir));
				break;
			case "De COP a Euros":
				JOptionPane.showMessageDialog(null, monedas.getCOP_EU(monedaConvertir));
				break;
			case "De COP a Libras Esterlinas":
				JOptionPane.showMessageDialog(null, monedas.getCOP_LIB(monedaConvertir));
				break;
			case "De COP a Yen Japonés":
				JOptionPane.showMessageDialog(null, monedas.getCOP_YEN(monedaConvertir));
				break;
			case "De COP a Won sul-coreano":
				JOptionPane.showMessageDialog(null, monedas.getCOP_COR(monedaConvertir));
				break;
			case "De Dolares a COP":
				JOptionPane.showMessageDialog(null, monedas.getDOL_COP(monedaConvertir));
				break;
			case "De Euros a COP":
				JOptionPane.showMessageDialog(null, monedas.getEU_COP(monedaConvertir));
				break;
			case "De Libras Esterlinas a COP":
				JOptionPane.showMessageDialog(null, monedas.getLIB_COP(monedaConvertir));
				break;
			case "De Yen Japonés COP":
				JOptionPane.showMessageDialog(null, monedas.getYEN_COP(monedaConvertir));
				break;
			case "De Won sul-coreano a COP":
				JOptionPane.showMessageDialog(null, monedas.getCOR_COP(monedaConvertir));
				break;
			default:
				break;
			}

			switch (optionTemperatura) {
			case "Celcius a Farenheit":
				// Enviamos valor de grados a convertir
				celConver.setGradosAConertir(temperaturaConvertir);
				// Enviamos opciona convertir 1 corresponde C a F
				celConver.setEscalaAConvertir(1);
				// Imprimimos respuesta
				JOptionPane.showMessageDialog(null, celConver.getCoversion());
				break;
			case "Celcius a Kelvin":
				celConver.setGradosAConertir(temperaturaConvertir);
				// Enviamos opciona convertir 2 corresponde C a K
				celConver.setEscalaAConvertir(2);
				JOptionPane.showMessageDialog(null, celConver.getCoversion());
				break;
			case "Farenheit a Celcius":
				farConver.setGradosAConertir(temperaturaConvertir);
				JOptionPane.showMessageDialog(null, farConver.getCoversion());
				break;
			case "Kelvin a Celcius":
				kelConver.setGradosAConertir(temperaturaConvertir);
				// Enviamos opciona convertir 1 corresponde K a C
				kelConver.setEscalaAConvertir(1);
				JOptionPane.showMessageDialog(null, kelConver.getCoversion());
				break;
			case "Kelvin a Farenheit":
				kelConver.setGradosAConertir(temperaturaConvertir);
				// Enviamos opciona convertir 2 corresponde K a F
				kelConver.setEscalaAConvertir(2);
				JOptionPane.showMessageDialog(null, kelConver.getCoversion());
			default:
				break;
			}
			
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion?");
			if (JOptionPane.OK_OPTION==respuesta) {
				System.out.println("Sigue");
			}else {
				flag = false;
			}
		}
	}

}
