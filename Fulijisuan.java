
import java.util.Scanner;

public class Fulijisuan {
 
	public static void Benjin(){
		int n;
		float f,i,p;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入终值: ");
	 	 f=scanner.nextFloat();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextFloat();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 p=(float) (f*1/Math.pow(1+i, n));
	 	 System.out.println("本金为： "+p);
	
	}
	public static void Benxihe(){
		 float p,i,sum1,sum2;
	 	 int n;
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入本金: ");
	 	 p=scanner.nextFloat();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextFloat();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 sum1=(float) (p*Math.pow(1+i, n));
	 	 sum2=p*(1+i*n);
	 	 System.out.println("复利的本息和为： "+sum1);
	 	 System.out.println("单利的本息和为： "+sum2);
	}
 
 	public static void main(String[] args) {
 		int choice;
 		while(true){
 		System.out.println("\t\t|*************|");
 		System.out.println("\t\t|  1.求本金         |");
 		System.out.println("\t\t|  2.求本息和    |");
 		System.out.println("\t\t|  3.退出              |");
 		System.out.println("\t\t|*************|");
 		Scanner scanner=new Scanner(System.in);
 		System.out.println("请输入你的选择(1~3):  ");
 		choice=scanner.nextInt();
 		switch(choice){
 		case 1:
 			Benjin();
 			break;
 		case 2:
 			Benxihe();
 			break;
 		case 3:
 			System.exit(0);
 			break;
 			default:
 			{
 				System.out.println("输入有误!");
 				break;
 			}
 		}
 			}		
 		}
 	}
 
