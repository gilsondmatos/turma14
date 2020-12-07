import java.util.Scanner;

public class pontoPlanos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2, d;
		
		System.out.println("Digite o valo de X1:");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valo de Y1:");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valo de X2:");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valo de Y2:");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow(x1+y1,2)+Math.pow(x2+y2,2));
		
		System.out.println("O valor de D é:" + Math.round(d));
				
		
		
		
		

	}

}
