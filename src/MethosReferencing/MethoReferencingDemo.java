package MethosReferencing;

public class MethoReferencingDemo {
	public static void main(String[] args) {
		Shape s1 =r->Math.PI*r*r;
		System.out.println(s1.area(5));
		
		Shape s2 = MethoReferencingDemo::test;
		System.out.println(s2.area(5));
	}
	public static double test(double r) {
		return Math.PI*r*r;
	}
}
