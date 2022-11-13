
public class SortArray {

	public static void main(String[] args)   
	{  
	//creating array  
	int[] arr = new int[] {5,2,9,0,1};  
	System.out.println("Array elements after sorting:");  
  
	for (int i = 0; i < arr.length; i++)   
	{  
	for (int j = i + 1; j < arr.length; j++)   
	{  
	int temp = 0;  
	if (arr[i] > arr[j])   
	{  
	temp = arr[i];  
	arr[i] = arr[j];  
	arr[j] = temp;  
	}  
	}
	
	System.out.println(arr[i]);  
	}  
	}  
}
