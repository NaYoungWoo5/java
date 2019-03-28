class ArrayUitl {
	public static int[] concat(int[] a, int[] b) {
		int tmp[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++)
			tmp[i] = a[i];

		for (int i = 0; i < b.length; i++) {
			int index = a.length + i;
			tmp[index] = b[i];
		}
		return tmp;
	}

	public static void print(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("]");
	}
}

public class Static {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUitl.concat(array1, array2);
		ArrayUitl.print(array3);
		// TODO Auto-generated method stub

	}

}
