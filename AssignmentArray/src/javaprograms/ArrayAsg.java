package javaprograms;

public class ArrayAsg {
public static void main(String[] args) {
		

		float[] num = {2.5f, 45.6f, 20.22f, 39.89f, 33.90f};
		float sum = 0;
		for(float element:num)
		{	
			sum = sum + element;
		}
		System.out.println("sum of array elements is: " +sum);
	}
}
