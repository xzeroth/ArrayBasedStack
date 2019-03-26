import java.util.Scanner;

public class ImprovedStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		ImprovedStackInterface<String> myImprovedStack = new ImprovedArrayBasedStack<String>(6);
		int option;
		do {
			System.out.println("Press 1 to push one item onto the stack");
			System.out.println("Press 2 to push two items onto the stack");
			System.out.println("Press 3 to pop the top of stack");
			System.out.println("Press 4 to pop the top of the stack twice");
			System.out.println("Press 5 to look at the top of the stack");
			System.out.println("Press 6 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(option) {
			case 1:
				System.out.println("What would you like to push onto the stack?");
				String item = keyboard.nextLine();
				try {
					myImprovedStack.push(item);
				}catch(StackFullException e){
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("What first item would you like to push onto the stack?");
				String item1 = keyboard.nextLine();
				System.out.println("What second item would you like to push onto the stack?");
				String item2 = keyboard.nextLine();
				try {
					myImprovedStack.push(item1,item2);
					break;
				}catch(StackFullException e) {
					System.out.println(e.getMessage());
					break;
				}
			case 3:
				try {
					myImprovedStack.pop();
					break;
				}catch(StackEmptyException e) {
					System.out.println(e.getMessage());
					break;
				}
			case 4:
				try {
					myImprovedStack.doublePop();
					break;
				}catch(StackEmptyException e) {
					System.out.println(e.getMessage());
					break;
				}
			case 5:
				try {
					System.out.println(myImprovedStack.top());
					break;
				}catch(StackEmptyException e) {
					System.out.println(e.getMessage());
					break;
				}
			case 6:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Error!");
				break;
			}
			
		}while(option != 6);
		
	}

}
