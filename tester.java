import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();		

//		
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		System.out.println("\n1. Insert Newnode 2. PreOrder 3. Inorder 4 Postorder 5. getMax 6. getMin 10. Exit");
		System.out.println("Enter your choice ");
		
		
		switch(sc.nextInt())
		{
		
		case 1:
			System.out.println("Enter data ");
			int data=sc.nextInt();			
			bst.insert(data);
			break;
			
		case 2:
			bst.preorder(bst.getRoot());
			break;
			
		case 3:
			bst.inorder(bst.getRoot());
			break;
			
		case 4:
			bst.postorder(bst.getRoot());
			break;
			
		case 5:
			bst.getMax(bst.getRoot());
			break;
			
		case 
		case 10: return;		
			
		
		}//switch
		}//while
		
		
		
		
	}

}
