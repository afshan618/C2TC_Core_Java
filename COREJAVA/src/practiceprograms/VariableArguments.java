
package practiceprograms;


public class VariableArguments {
static int  sum(int...arr) 
{ 
	int result=0;
	for(int a:arr)
	{
		result+=a;
		
	}
	return result;
}
	
	public static void main(String[] args) {
		System.out.println("Addition of two numbers="+sum(10,20));
		System.out.println("Addition of four numbers="+sum(1,20,67,80));
		System.out.println("Addition of two numbers="+sum(110,210));
	}

}
