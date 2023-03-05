
public class BubbleSortExample {
	static void bubblesort(int[] arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	

}
	public static void main(String args[]) {
		int arr[]={3,60,35,2,45,320,5};
		System.out.println("Array before bubble sort:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubblesort(arr);
		System.out.println("Array after bubble sort");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
