package kxj;
import java.util.Scanner;

public class Fulijisuan {
	 public static double p,i,f ;
	 public static double n;
	 
	 //���㱾��
	public static void Benjin(){
		//int n;
		//float f,i,p;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 p=(float) (f*1/Math.pow(1+i, n));
	 	 System.out.println("����Ϊ�� "+(double)(Math.round(p*100)/100.0));
	
	}
	
	//���㱾Ϣ��
	public static void Benxihe(){
		 double sum1,sum2;
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 sum1=(float) (p*Math.pow(1+i, n));
	 	 sum2=p*(1+i*n);
	 	 System.out.println("�����ı�Ϣ��Ϊ�� "+(double)(Math.round(sum1*100)/100.0));
	 	 System.out.println("�����ı�Ϣ��Ϊ�� "+(double)(Math.round(sum2*100)/100.0));
	}
	
	//��������
	public static void Nianshu(){
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 n=Logarithm.log(f/p,1+i);
	 	 n=Math.ceil(n);
	 	 System.out.println("��Ҫ�������Ϊ: "+Math.ceil(n));	 
	}
	
	//����������
	public static void Lilv(){
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 i=Math.pow(f/p, 1.0/n)-1;
	 	 System.out.println("�걨����Ϊ�� "+(double)(Math.round(i*1000)/1000.0));
	}
	
	//���㱾��֮����ͬ���Ͷ�ʺ�����ʲ�
	public static void Nianjin(){
		 int k=1;
		 f=0;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 while(k<=n){
	 		 p=p+f;
	 		 f=p*(1+i);
	 		 k++;
	 	 }
	 	System.out.println("���ʲ���ֵΪ��"+(int)f);
	}
	
 
 	public static void main(String[] args) {
 		int choice;
 		while(true){
 		System.out.println("\t\t|*******************|");
 		System.out.println("\t\t|  1.�󱾽�                         |");
 		System.out.println("\t\t|  2.��Ϣ��                    |");
 		System.out.println("\t\t|  3.������                         |");
		System.out.println("\t\t|  4.������                         |");
		System.out.println("\t\t|  5.�����ʲ���ֵ          |");
 		System.out.println("\t\t|  6.�˳�              |");
 		System.out.println("\t\t|*************|");
 		Scanner scanner=new Scanner(System.in);
 		System.out.println("���������ѡ��(1~6):  ");
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
 				System.out.println("��������!");
 				break;
 			}
 		}
 			}		
 		}
 	}