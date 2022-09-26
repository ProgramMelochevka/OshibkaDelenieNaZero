package by.home.maxzzzit;
// Деление вещественных чисел на ноль!
public class OshibkaDelenieNaZero {
	public static void main(String[]args) throws Exception {
		System.out.println("Процент до завершения действия");
		for (int i = 0; i <= 100; i=i+10) {
			System.out.println(i+" %");
			Thread.sleep(100);
		}
		double a = -12345, b = 0, chasn;
		chasn = a/b;
		System.out.println("Деление на ноль = "+chasn);
	}
}