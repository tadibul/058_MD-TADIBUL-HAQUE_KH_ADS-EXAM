import java.util.Scanner;
class Q2{
	
	
	listNode head;
	
	public static class listNode{
		int data;
		listNode next;
		
		listNode(int data){
			
			this.data=data;
			this.next=null;
			
		}
	
	}
	public void insertFirst(int data){
		listNode newNode=new listNode(data);
		newNode.next=head;
		head=newNode;
		
	}
	
	public void display(){
		listNode current=head;
		while(current!=null){
			System.out.print(current.data+"->");
			current=current.next;
			
		}
		System.out.println("Null");
		
	}
	
	public listNode reverse(){
		if(head==null){
			return null;
		}
		
		listNode current =head;
		listNode previous=null;
		listNode next=null;
		
		
		while(current!=null){
			
			
			next=current.next;
			current.next=previous;
			
			previous=current;
			current=next;
			
			
		}
		head=previous;
		return previous;
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String []args){
		Q2 sll=new Q2();
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int elements=sc.nextInt();
		int y=sc.nextInt();
		sll.head =new listNode(y);
		for (int i=1;i<elements;i++)
		{
			int x=sc.nextInt();
		sll.insertFirst(x);
		}
		System.out.println("Before reversing list:");
		sll.display();
		sll.reverse();
		System.out.println("After reversing list:");
		sll.display();
		
	}



}