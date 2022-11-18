
public class bubble {
	public static void bubble(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length-1; j++) 
			{
				if(arr[j+1] < arr[j])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
