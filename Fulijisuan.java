
import java.util.Scanner;

public class Fulijisuan {
 
	public static void Benjin(){
		int n;
		float f,i,p;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextFloat();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextFloat();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 p=(float) (f*1/Math.pow(1+i, n));
	 	 System.out.println("����Ϊ�� "+p);
	
	}
	public static void Benxihe(){
		 float p,i,sum1,sum2;
	 	 int n;
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextFloat();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextFloat();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 sum1=(float) (p*Math.pow(1+i, n));
	 	 sum2=p*(1+i*n);
	 	 System.out.println("�����ı�Ϣ��Ϊ�� "+sum1);
	 	 System.out.println("�����ı�Ϣ��Ϊ�� "+sum2);
	}
 
 	public static void main(String[] args) {
 		int choice;
 		while(true){
 		System.out.println("\t\t|*************|");
 		System.out.println("\t\t|  1.�󱾽�         |");
 		System.out.println("\t\t|  2.��Ϣ��    |");
 		System.out.println("\t\t|  3.�˳�              |");
 		System.out.println("\t\t|*************|");
 		Scanner scanner=new Scanner(System.in);
 		System.out.println("���������ѡ��(1~3):  ");
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
 				System.out.println("��������!");
 				break;
 			}
 		}
 			}		
 		}
 	}
 
