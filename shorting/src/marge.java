

public class marge {

	public static void sort(int [] array)
	{
		int l=0;
		int h=array.length-1;
//		int m=(l+h)/2;
		_sort(array, l, h);
		
	}
	
	private static void _sort(int [] array, int l, int h)
	{
		if (l<h)
		{
			int m = (l+h)/2;
			_sort(array, l, m);
			_sort(array, m+1, h);
			_merging(array, l, m, h);
		}
		
	}

	private static void _merging(int [] array, int l, int m, int h)
	{
		int [] brr = new int [h-l+1];
//		int m = (l+h)/2;

		int i=l, j=m+1, k=0;
		while(i<=m && j<=h)
		{
			if(array[i]<array[j])
			{
				brr[k] = array [i];
				i++;
				k++;
			}
			else
			{
				brr[k] = array [j];
				j++;
				k++;
			}
		}
		while(i<=m)
		{
			brr[k]=array[i];
			i++;
			k++;
		}
		while(j<=h)
		{
			brr[k]=array[j];
			j++;
			k++;
		}
		for(i=0, j=l; i<brr.length; i++, j++)
		{
			array[j] = brr[i];
		}
	}
}
