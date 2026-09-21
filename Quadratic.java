import java.util.Scanner;
class Quadratic{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a:");
	double a = sc.nextDouble();
	System.out.print("Enter b:");
	double b = sc.nextDouble();
	System.out.print("Enter c:");
	double c = sc.nextDouble();
	double D = b*b-4*a*c;
	System.out.println("Discriminant ="+D);
		if(D>0){
		        double r1 = (-b + Math.sqrt(D)) / (2*a);
		        double r2 = (-b - Math.sqrt(D)) / (2*a);
		                 System.out.println("Roots are real and distinct");
		         System.out.println("Roots 1 = " +r1);
		         System.out.println("Roots 2 = " +r2);
		         }
		         else if (D == 0){
		             double r = -b/(2*a);
		             System.out.println("Roots are real and equal");
		             System.out.println("Roots  = " +r);
		             }
		             else{
		              System.out.println("Roots are imaginary/complex");
		              }
		             }
		           }
