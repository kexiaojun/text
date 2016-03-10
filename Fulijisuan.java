import java.util.Scanner;


public class Fulijisuan {


	public static void main(String[] args) {
		float p,i,sum;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入本金: ");
		p=scanner.nextFloat();
		System.out.println("请输入年利率: ");
		i=scanner.nextFloat();
		System.out.println("请输入年数: ");
		n=scanner.nextInt();
		sum=(float) (p*Math.pow(1+i, n));
		System.out.println("本利和为： "+sum);
		

	}

}
