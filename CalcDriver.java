
public class CalcDriver {

	public static void main(String [] args) {
		double [] num = new double [5];
		
		num[0] = 10.0;
		num[1] = 11.0;
		num[2] = 12.0;
		num[3] = 13.0;
		num[4] = 14.0;
						
		
		System.out.println(Calculator.getSum(num[1], num[2]));
		System.out.println(Calculator.getAverage(num[1],num[2], num[3]));
		System.out.println(Calculator.getProduct(num[2], num[4]));
		System.out.println(Calculator.getFactorial(num[2],num[1],num[0]));
		
	}
}
