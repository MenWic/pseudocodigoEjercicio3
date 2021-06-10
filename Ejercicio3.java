import java.util.*;
public class Ejercicio3{
	public static void main(String[] args){
		int num;
		int fact=1;
		Scanner scanner=new Scanner(System.in);

		System.out.print("Ingrese el numero del cual desea saber el factorial: ");
		num=scanner.nextInt();
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("El factorial de "+num+" es: "+fact);
	}
}