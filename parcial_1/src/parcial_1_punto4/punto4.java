package parcial_1_punto4;
import java.util.Scanner;
class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float salario;
		
		double parte1;
		double parte2;
		double parte3;
		int op;
		double mes;
		double interes;
		double total;
		
		System.out.println("ingrese su salario: ");
		salario = sc.nextFloat();
		
		
		
		parte1 = salario*30/100;
		
		System.out.println("su capacidad de pago es de : "+ parte1);
		
		parte2=parte1*2/100;
		
		parte3=parte1-parte2;
		
		System.out.println("del 30% del salario de descontara un 2% en suguro de todo riesgo y quedara en: \n"+parte3);
		
		
		
		
		System.out.println("ingrese el pazo que desea ya sea que:\n1) 12 meses \n2) 24 meses\n3) 36 meses\n4) 48 meses\n5) 60 meses\n6) 72 meses\n ");
        op=sc.nextInt();	
        
		switch (op) {
		
		case 1:
			mes=12*2.5;
			
			interes=parte3*mes/100;
			total=parte3+interes;
			
			System.out.println("el interes si su plazo es 12 meses es de: "+ interes);
			System.out.println("el total a pagar es: "+ total);
			
			
			break;
		case 2:
         mes=24*2.5;
			
			interes=parte3*mes/100;
			total=parte3+interes;
			
			System.out.println("el interes si su plazo es 24 meses es de: "+ interes);
			System.out.println("el total a pagar es: "+ total);
			break;
		case 3:
            mes=36*2.5;
			
			interes=parte3*mes/100;
			total=parte3+interes;
			
			System.out.println("el interes si su plazo es 36 meses es de: "+ interes);
			System.out.println("el total a pagar es: "+ total);
			break;
		case 4:
            mes=48*2.5;
			
			interes=parte3*mes/100;
			total=parte3+interes;
			
			System.out.println("el interes si su plazo es 48 meses es de: "+ interes);
			System.out.println("el total a pagar es: "+ total);
			break;
		case 5:
             mes=60*2.5;
			
			interes=parte3*mes/100;
			total=parte3+interes;
			
			System.out.println("el interes si su plazo es 60 meses es de: "+ interes);
			System.out.println("el total a pagar es: "+ total);
			break;
		case 6:
           mes=72*2.5;
			
			interes=parte3*mes/100;
			total=parte3+interes;
			
			System.out.println("el interes si su plazo es 72 meses es de: "+ interes);
			System.out.println("el total a pagar es: "+ total);
			break;
			
		default:
			break;
			
		
		
		}
		
		sc.close();
		
	}

}
