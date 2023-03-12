
public abstract class EscalaTemperatura {
	
	private double gradosAConertir;
	private double escalaAConvertir;
	
	public double getGradosAConertir() {
		return gradosAConertir;
	}
	public void setGradosAConertir(double gradosAConertir) {
		this.gradosAConertir = gradosAConertir;
	}
	public double getEscalaAConvertir() {
		return escalaAConvertir;
	}
	public void setEscalaAConvertir(double escalaAConvertir) {
		this.escalaAConvertir = escalaAConvertir;
	}
	
	public abstract String getCoversion();

}
