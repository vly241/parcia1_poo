package parcial_1_punto3;
import java.util.Scanner;
class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dias;
		int horasExtras;
		int costohora;
		int sueldo;
		int opcion;
		int valorExtra;
		int sueldoTotal;
		int dominical;
		int festivos;
		String nombre;
		
		System.out.println("digite el nombre del empleado: ");
		nombre = sc.nextLine();
		
		System.out.println("ingrese la cantidad de dias trabajados por el empleado");
		dias = sc.nextInt();
		
		System.out.println("ingrese el valor de la hora: ");
		costohora = sc.nextInt();
		
		sueldo = dias * 8 * costohora;
		
		System.out.println("ingrese las horas extras laboradas: ");
		horasExtras = sc.nextInt();
		
		System.out.println("seleccione la opcion segun el tipo de horas extras realizadas: ");
		System.out.println("1) Diurna \n2) Nocturna \n3) Dominical \n4) Festivos \n");

		opcion = sc.nextInt();
		
		switch(opcion) {
		
		case '1':
			
			if(sueldo <= 781242) {
				
				System.out.println("usted debe de ingresar un valor mayor o igual al minimo.");
			}
			else {
				valorExtra = costohora*25/100;
				sueldoTotal = sueldo + valorExtra;
			}
			
			break;
			
		case '2':
			
			if(sueldo <= 781242) {
				
				System.out.println("usted debe de ingresar un valor mayor o igual al minimo.");
			}
			else {
				valorExtra = costohora*25/100;
				sueldoTotal = sueldo + valorExtra;
			}
			
			
			break;
			
		case '3':
			
			System.out.println("seleccion la opcion dependiendo del horario de su hora extra dominical: ");
			System.out.println("1) diurna\n2)nocturna\n");
			dominical = sc.nextInt();
			
			switch(dominical) {
			case '1':
				
				valorExtra = costohora * 75/100 * 25 /100;
				sueldoTotal = sueldo + valorExtra;
				
				break;
				
			case '2':
				
				valorExtra = costohora * 75/100 * 75 /100;
				sueldoTotal = sueldo + valorExtra;
				
				break;
				
			default:
				break;
			
			}
			
			
			break;
			
		case '4':
			System.out.println("seleccion la opcion dependiendo del horario de su hora extra en festivos: ");
			System.out.println("1) diurna\n2)nocturna\n");
			festivos = sc.nextInt();
			
			switch(festivos) {
			
           case '1':
				
				valorExtra = costohora * 75/100 * 25 /100;
				sueldoTotal = sueldo + valorExtra;
				
				break;
				
			case '2':
				
				valorExtra = costohora * 75/100 * 75 /100;
				sueldoTotal = sueldo + valorExtra;
				
				break;
				
			default:
				break;
			
			
			}
			break;
			
		default:
			break;
			
		}
		
		
		
		
		
		System.out.println("el empleado: "+ nombre +"que trabajó "+dias+" dias, tiene un sueldo de "+sueldo+", que con sus horas extras es un sueldo total de :" +sueldoTotal);
		
		sc.close();
	}

}
