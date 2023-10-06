
public class calcultor {

	
	double add(double d,double e)
	{
		return d + e;
	}
	double sub(double d,double e)
	{
		return d - e;
	}
	double mult(double a,double b)
	{
		return a * b;
	}
	
	public static void main(String[] args) {
		
		calcultor obj = new calcultor();
		System.out.println(obj.add(10.2,21.2));
		System.out.println((obj.sub(20.4, 10.2)));
		System.out.println((obj.mult(2.4, 1.22)));

}
}
