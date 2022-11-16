import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner H = new Scanner(System.in);
		LinkedList list = new LinkedList<Integer>();
		MyStack <Character> stack = new MyStack<Character>();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		System.out.println(stack.toString());
		System.out.println(stack.contains('b'));
		System.out.println(stack.contains('k'));
		
		Browser B = new Browser();
		
		System.out.println("------ MENU ------");
		System.out.println("1 Like to visit a website \n"
				+"2 Check if browsing history is empty\n"
				+ "3 Print recently visited website\n"
				+ "4 Select choice to traverse back the browsing history by 'n' times\n"
				+ "5 Print browsing history\n"
				+ "6 exit\n"
				+"Enter your choice: ");
		int a = H.nextInt();
		while(a != 6 ) {
		System.out.println("------ MENU ------");
		System.out.println("1 Like to visit a website \n"
				+"2 Check if browsing history is empty\n"
				+ "3 Print recently visited website\n"
				+ "4 Select choice to traverse back the browsing history by 'n' times\n"
				+ "5 Print browsing history\n"
				+ "6 exit\n"
				+"Enter your choice: ");
	       a = H.nextInt();
		if(a == 1) {
			System.out.println("Enter the url of the website ;");
			String S = H.next();
			B.addSiteToHistory(S);
		}
		 if(a == 2){
			if( B.isBrowsingHistoryEmpty()) {
				System.out.println("Empty");
			}
			else {
				System.out.println("not Empty");
			}
		}
		 if(a == 3) {
			System.out.println(B.mostRecentlyVisitedSite());
		}
		 if(a == 4) {
			 int n = H.nextInt();
			 B.goBackInTime(n);
		 }
		 if(a == 5) {
			 B.printBrowsingHistory();
		 }
		 if(a>6 || a<=0) {
			 System.out.println("Enter your choice: ");
			 a = H.nextInt();
		 }
		
		}
		

	}

}
