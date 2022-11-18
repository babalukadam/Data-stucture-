
public class quick {

	public static void sort (int [] array)
	{
		_sort(array, 0, array.length-1 );
	}
	private static void _sort (int [] array, int l, int h)
	{
		if(l<h)
		{
			int pi = partition(array, l, h );
//			if(pi>l)
				_sort(array, l, pi-1);
//			if(pi<h)
				_sort(array, pi+1, h);
		}
	}

	private static int partition(int [] array, int l, int h)
	{
		int i=l-1, j=l, p=h;

		while (j<p)
		{
			if(array[j]<array[p])
			{
				++i;
				int temp = array[j];
				array[j] = array [i];
				array [i] = temp;
			}
			j++;
		}
		++i;
		int temp = array[i];
		array [i] = array [p];
		array [p] = temp;
		return i;
	}
}
