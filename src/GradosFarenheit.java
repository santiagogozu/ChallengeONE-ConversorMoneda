
public class GradosFarenheit extends EscalaTemperatura {
	
	private double coversion;

	public String getCoversion() {

		// Grados Farenheit a Grados Celcius
		coversion= ((5*(this.getGradosAConertir()-32))/9);
		return this.getGradosAConertir() + " grados Farenheit equivalen a " + coversion + "grados Celcius";
	}

}
