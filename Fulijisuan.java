import java.util.Scanner;


public class Fulijisuan {


	public static void main(String[] args) {
		float p,i,sum;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����뱾��: ");
		p=scanner.nextFloat();
		System.out.println("������������: ");
		i=scanner.nextFloat();
		System.out.println("����������: ");
		n=scanner.nextInt();
		sum=(float) (p*Math.pow(1+i, n));
		System.out.println("������Ϊ�� "+sum);
		

	}

}
