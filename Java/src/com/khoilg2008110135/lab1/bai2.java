package Java.src.com.khoilg2008110135.lab1;
import java.util.Scanner;


public class bai2 {
	public static void main(String[] args){
		double chieudai, chieurong;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		chieudai = scanner.nextDouble();
		System.out.print("Nhap chieu rong: ");
		chieurong = scanner.nextDouble();
		double chuvi = (chieudai + chieurong) * 2;
		double dientich = chieudai * chieurong;
		System.out.printf("Chu vi = %.3f\n", chuvi);
		System.out.printf("Dien tich = %.3f\n", dientich); 
		double min = Math.min(chieudai, chieurong);
		System.out.printf("Canh nho nhat = %.3f\n", min);
		scanner.close();
	}
}