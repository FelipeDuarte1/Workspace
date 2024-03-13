import java.util.Locale;

public class Main_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		double b1, b2, h, area;
		b1 = 6;
		b2 = 8;
		h = 5;
		area = (b1 + b2) / 2 * h;
		System.out.println(area);
		
		
		int x,y;
		double resultado;
		x = 5;
		y = 2;
		
		resultado = (double)x / y;
		System.out.println(resultado);	
		
		double a;
		int b;
		a = 5.0;
		b = (int)a;
		
		System.out.println(b);
		
	}

}
