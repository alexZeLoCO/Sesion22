
public class TestHora {

	public static void main(String[] args) {
		Hora h1 = new Hora();
		Hora h2 = new Hora(14);
		Hora h3 = new Hora(18,30);
		Hora h4 = new Hora(23,59,59);
		Hora h5 = new Hora(h3);
		
		h1.imprimeHora();
		h2.imprimeHora();
		h3.imprimeHora();
		h4.imprimeHora();
		h5.imprimeHora();

	}

}
