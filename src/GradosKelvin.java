
public class GradosKelvin extends EscalaTemperatura {
	
	private double coversion;
	
	public String getCoversion() {

		// Grados Kelvin a Grados Celcius
		if (this.getEscalaAConvertir() == 1) {
			coversion = this.getGradosAConertir()-273.15;
			return this.getGradosAConertir() + " grados Kelvin equivalen a " + coversion + " grados Celcius";

			// Grados Kelvin a Grados Farenheit
		} else if (this.getEscalaAConvertir() == 2) {
			coversion = ((9*(this.getGradosAConertir() - 273.15))/5)+32;
			return this.getGradosAConertir() + " grados Kelvin equivalen a " + coversion + " grados Farenheit";
		}
		return null;
	}

}
