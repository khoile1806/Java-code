package Java.src.com.khoilg2008110135.lab1;
import java.util.Scanner;

public class bai4 {
	public static void main(String[] args)	{
		double a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a, b, c cua ax^2 + bx + c = 0");
		System.out.print("He so a: ");
		a = scanner.nextDouble();
		System.out.print("He so b: ");
		b = scanner.nextDouble();
		System.out.print("He so c: ");
		c = scanner.nextDouble();
		double delta;
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.printf("Can bac hai cua delta = %.3f", Math.sqrt(delta));
		scanner.close();
	}
}