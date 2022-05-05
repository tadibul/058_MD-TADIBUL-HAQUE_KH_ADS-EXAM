

class Q3{
	
	int max;
	int s1[];
	//int s2[];
	int top1;
	//int top2;
	Q3(int data){
		top1=-1;
		//top2=6;
		max=data;
		s1=new int[max];
		
		
	}
	
	public void push1(int x){
		top1++;
		s1[top1]=x;
		
	}
	
	
	
	public int pop1(){
		top1--;
		return s1[top1];
	}
	/*
	public void push2(int x){
		top2++;
		s2[top2]=x;
		
	}
	public int pop2(int x){
		int a=s2[top2];
		top2--;
		return s2[top2];
	}
	*/
	public void display(){
		int m=top1;
		while (m!=-1){
		System.out.print(s1[m]+" ");
		m--;
		}
	}
	
	
	
	
	public static void main(String [] args){
		
		//int arr[]=new int[10];
		Q3 stack1=new Q3(7);
		
		Q3 stack2=new Q3(10);
		
		stack1.push1(5);
		stack2.push1(10);
		stack2.push1(15);
		stack1.push1(11);
		stack1.display();
		System.out.print("popped element from stack 1 is :");
		stack1.pop1();
		stack1.display();
		
		
		
	}
	
	
}