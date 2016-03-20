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
	 	 //n=Math.ceil(n);
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
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入每年定投资金: ");
	 	 p=scanner.nextDouble(); 
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("请输入年数: ");
	 	 n=scanner.nextInt();
	 	 f=p*(1+i)*(Math.pow(1+i,n)-1)/i;
	 	 System.out.println("年资产总值为："+(double)(Math.round(f*100)/100.0));     
	}
	
	//计算每月等额本息还款
	public static void BenxiHuankuan(){
		double f,i,p;
		int n;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("请输入贷款金额: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("请输入年利率: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("请输入贷款年数: ");
	 	 n=scanner.nextInt();
	 	 i=i/12;
	 	 n=n*12;
	 	 p=f*i*Math.pow(1+i, n)/(Math.pow(1+i, n)-1);
		 System.out.println("每月等额本息还款为："+(double)(Math.round(p*10000)/10000.0));
		
	}
 
 	public static void main(String[] args) {
 		int choice;
 		while(true){
 		System.out.println("\t\t|***********************|");
 		System.out.println("\t\t|  1. 求       本      金  \t|");
 		System.out.println("\t\t|  2. 求   本   息   和 \t|");
 		System.out.println("\t\t|  3. 求      年       数 \t|");
		System.out.println("\t\t|  4. 求      利       率 \t|");
		System.out.println("\t\t|  5. 求年资产总值\t|");
		System.out.println("\t\t|  6. 求等额本息还款\t|");	
 		System.out.println("\t\t|  7. 退        出          \t|");
 		System.out.println("\t\t|***********************|");
 		Scanner scanner=new Scanner(System.in);
 		System.out.println("\n请输入你的选择(1~7):  ");
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
 			BenxiHuankuan();
 			break;
 		case 7:
 			System.out.println("Thanks for using!");
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