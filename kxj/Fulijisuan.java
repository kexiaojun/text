package kxj;
import java.util.Scanner;

public class Fulijisuan {
	 public static double p,i,f ;
	 public static double n;
	 
	 //计算本金
	public static void Benjin(){
		//int n;
		//float f,i,p;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入终值: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 p=(float) (f*1/Math.pow(1+i, n));
	 	 System.out.println("本金为： "+(double)(Math.round(p*100)/100.0));
	
	}
	
	//计算本息和
	public static void Benxihe(){
		 double sum1,sum2;
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入本金: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 sum1=(float) (p*Math.pow(1+i, n));
	 	 sum2=p*(1+i*n);
	 	 System.out.println("复利的本息和为： "+(double)(Math.round(sum1*100)/100.0));
	 	 System.out.println("单利的本息和为： "+(double)(Math.round(sum2*100)/100.0));
	}
	
	//计算年数
	public static void Nianshu(){
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入本金: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("请输入终值: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextDouble();
	 	 n=Logarithm.log(f/p,1+i);
	 	 n=Math.ceil(n);
	 	 System.out.println("需要存的年数为: "+Math.ceil(n));	 
	}
	
	//计算年利率
	public static void Lilv(){
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入本金: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("请输入终值: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 i=Math.pow(f/p, 1.0/n)-1;
	 	 System.out.println("年报酬率为： "+(double)(Math.round(i*1000)/1000.0));
	}
	
	//计算本利之和连同年金投资后的总资产
	public static void Nianjin(){
		 int k=1;
		 f=0;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入本金: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 while(k<=n){
	 		 p=p+f;
	 		 f=p*(1+i);
	 		 k++;
	 	 }
	 	System.out.println("年资产总值为："+(int)f);
	}
	
 
 	public static void main(String[] args) {
 		int choice;
 		while(true){
 		System.out.println("\t\t|*******************|");
 		System.out.println("\t\t|  1.求本金                         |");
 		System.out.println("\t\t|  2.求本息和                    |");
 		System.out.println("\t\t|  3.求年数                         |");
		System.out.println("\t\t|  4.求利率                         |");
		System.out.println("\t\t|  5.求年资产总值          |");
 		System.out.println("\t\t|  6.退出              |");
 		System.out.println("\t\t|*************|");
 		Scanner scanner=new Scanner(System.in);
 		System.out.println("请输入你的选择(1~6):  ");
 		choice=scanner.nextInt();
 		switch(choice){
 		case 1:
 			Benjin();
 			break;
 		case 2:
 			Benxihe();
 			break;
 		case 3:
 			Nianshu();
 			break;
 		case 4:
 			Lilv();
 			break;
 		case 5:
 			Nianjin();
 			break;
 		case 6:
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