
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum+" is the value stored in the myNum variable");
		System.out.println(website+" is the value stored in the website variable");
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 7;
		arr[2] = 5;
		arr[3] = 90;
		arr[4] = 9;
		
		int[] arr2 = {1, 6, 4, 7, 8};
		System.out.println(arr2[0]);
		
		//for loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] name = {"rahul", "Shetty", "academy", "selenium"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}

}
