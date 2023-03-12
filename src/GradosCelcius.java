
public class GradosCelcius extends EscalaTemperatura {

	private double coversion;

	public String getCoversion() {

		// Grados Celcius a Grados Farenheit
		if (this.getEscalaAConvertir() == 1) {
			coversion = (((9 * (this.getGradosAConertir())) / 5) + 32);
			return this.getGradosAConertir() + " grados Celcius equivalen a " + coversion + "grados Farenheit";

			// Grados Celcius a Grados Kelvin
		} else if (this.getEscalaAConvertir() == 2) {
			coversion = (this.getGradosAConertir() + 273.15);
			return this.getGradosAConertir() + " grados Celcius equivalen a " + coversion + "grados Kelvin";
		}
		return null;
	}
}
