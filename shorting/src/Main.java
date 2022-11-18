public class Main
{
	public static void main(String[] args)
	{
		System.out.print(" Input array : ");
		int [] array = new int [] {45, 2, 56, 12, 4, 99, -1};

		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+", " );
		}

		System.out.print("\nSorted array : ");
////		marge.sort(array);
//		bubble.bubble(array);
////		quick.sort(array);
//		shorti.insertion(array);
		shorti.selection(array);
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+", " );
		}
	}
}
