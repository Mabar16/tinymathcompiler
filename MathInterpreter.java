package mathexpressions;
import javatest.ExternalsImpl;
public class MathInterpreter{
public static interface Externals {
	public int power(int base,int power);
}
private Externals externals;
public MathInterpreter(Externals _externals){
externals = _externals;
}
	
	public static void main(String[] args){
		MathInterpreter mi = new MathInterpreter(new ExternalsImpl());
		mi.compute();
		}
	public void compute(){
		System.out.println(" first = " + ((2)*(5)));
		System.out.println(" second = " + ((95)+(333)));
		System.out.println(" third = " + ((4)/(2)));
		System.out.println(" bobby = " + ((22)-(19)));
		System.out.println(" nice = " + ((2)/(2)));
		System.out.println(" helloWorld3 = " + ((100)*(2)));
		System.out.println(" dolla dolla dolla = " + ((33)+(36)));
		System.out.println(" xx = " + externals.power((1),(2)));
		System.out.println(" binding = " + (((((80)-(1)))*(10))));
		}
	
}
