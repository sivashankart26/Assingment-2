package week1.day2;

public class Calculator {
	public void add(int a,int b) {
		int sum = a+b;
		System.out.println("SUM = "+sum);
	}
	public void dif(int e, int f) {
		int sub = e - f;
		System.out.println("SUB = "+sub);
	}
	public void Multiplytwo(double i,double j) {
		double multiply = i*j;
		System.out.println("Multiply = "+ multiply);
	}
	public void Divison(float x, float y) {
		float division = x/y;
		System.out.println("Division = "+division);
	}
	public static void main(String[] args) {
		Calculator result = new Calculator();
		result.add(10, 20);
		result.dif(76, 67);
		result.Multiplytwo(21.43, 8.67);
		result.Divison(56.67F, 21.32F);
	}

}
