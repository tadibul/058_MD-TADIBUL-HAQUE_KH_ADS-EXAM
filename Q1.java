import java.util.Scanner;
class Q1{
	
	
	public static void insertionSort(int[] arr,int k){
		
		for(int i=0; i<k;i++){
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0  &&  arr[j]> temp){
				
				arr[j+1]=arr[j];
				j=j-1;
				printArray(arr);
			}
			
			arr[j+1]=temp;
			
			
		}
		
	}
	
	public static void printArray(int a1[]){
		
		for (int i=0;i<a1.length;i++){
			
			System.out.print(a1[i]);
		}
		System.out.println();
		
	}
	
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		
		int a1[]=new int[k];
		
		for(int i=0; i<k;i++)
			 a1[i]=sc.nextInt();
		//Q1 myObj= new Q1();
		//printArray(a1);
		insertionSort(a1,k);
		printArray(a1);
		
	}
	
	
}

