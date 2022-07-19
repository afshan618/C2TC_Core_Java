package javaprograms;

public class Arrayasg3 {
	public static void main(String[] args) {
		
		int[] mrks = {50, 65, 35, 67, 40};
		int sum = 0;
		for(int element:mrks)
		{
			sum = sum + element;
		}
		System.out.println("The average of mrks is: " +sum/mrks.length);
	}

}
//marks of students