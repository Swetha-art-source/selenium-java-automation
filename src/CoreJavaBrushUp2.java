import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {2, 6, 8, 445, 333, 8, 4, 67, 2, 67, 8};
		
		for(int i = 0; i<arr2.length; i++) {
			if(arr2[i]%2 == 0) {
				System.out.println(arr2[i]);
				break;
			}else {
				System.out.println(arr2[i]+"is not multiple of 2");
			}
		}
		
		System.out.println("**********");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("selenium");
		System.out.println(a.get(2));
		
		System.out.println("**********");
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("**********");
		
		for(String val: a) {
			System.out.println(val);
		}
		
		System.out.println("**********");
		
		System.out.println(a.contains("selenium"));
		
		String[] name = {"rahul", "shetty", "selenium", "academy"};
		List nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("selenium"));

	}

}
