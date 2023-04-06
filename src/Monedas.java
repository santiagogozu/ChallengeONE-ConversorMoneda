import java.util.ArrayList;
import java.util.Collection;

public class Monedas {

	private Object[] opMonedas = { "De COP a Dolares", "De COP a Euros", "De COP a Libras Esterlinas",
			"De COP a Yen Japonés", "De COP a Won sul-coreano", "De Dolares a COP", "De Euros a COP",
			"De Libras Esterlinas a COP", "De Yen Japonés COP", "De Won sul-coreano a COP" };

	public Monedas() {
	}

	public Object[] getOpMonedas() {
		return opMonedas;
	}

	public String getCOP_DOL(double valor) {
		double resultado = (valor * 0.00021);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " COP, equivalen a " + resultado + " Dolares";
	}

	public String getCOP_EU(double valor) {
		double resultado = (valor * 0.00020);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " COP, equivalen a " + resultado + " Euros";
	}

	public String getCOP_LIB(double valor) {
		double resultado = (valor * 0.00017);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " COP, equivalen a " + resultado + " Libras Esterlinas";
	}

	public String getCOP_YEN(double valor) {
		double resultado = (valor * 0.028);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " COP, equivalen a " + resultado + " Yenes Japonéses";
	}

	public String getCOP_COR(double valor) {
		double resultado = (valor * 0.27);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " COP, equivalen a " + resultado + " Yenes Won sul-coreanos";
	}

	public String getDOL_COP(double valor) {
		double resultado = (valor * 4764.71);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " Doalres, equivalen a " + resultado + " COP";
	}

	public String getEU_COP(double valor) {
		double resultado = (valor * 5134.22);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " Euros, equivalen a " + resultado + " COP";
	}

	public String getLIB_COP(double valor) {
		double resultado = (valor * 5802.23);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " Libras, equivalen a " + resultado + " COP";
	}

	public String getYEN_COP(double valor) {
		double resultado = (valor * 36.15);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " Yenes Japonéses, equivalen a " + resultado + " COP";
	}

	public String getCOR_COP(double valor) {
		double resultado = (valor * 3.70);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " Yenes Won sul-coreanos, equivalen a " + resultado + " COP";
	}

}
