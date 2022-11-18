
public class shorti {


		public static void selection(int [] arr)
		{
			for(int i=0; i<arr.length; i++)
			{
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j])
						//if(arr[i] < arr[j])
					{
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}			
			}
		}

		public static void insertion(int [] arr)
		{
			for(int i=0; i<arr.length-1; i++)
			{
				for (int j = i+1; j>0; j--) 
				{
					if(arr[j] < arr[j-1])
					{
						int tmp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = tmp;
					}
					else
						break;
				}
			}
		}

}
