package parcial_1_punto2;
import java.util.Scanner;
class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int temp;
		float fah;
		
		System.out.println("ingrese la temperatura en grados centigrados: ");
		temp = sc.nextInt();
		sc.close();
		
		
		fah=32+(9*temp/5);
		
		System.out.println("la temperatura dada en fahrenheit es: "+ fah);
		
		
		
	}

}
