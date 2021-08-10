package Demo;

public class Exception_case {

	public static void main(String[] args) {
		try {
		System.out.println("Hello word");
		int i=1/0;
		System.out.println("Completed .!");
		}
		catch(Exception e) {
			System.out.println("this is exception");
			System.out.println("Message is:"+e.getMessage());
			System.out.println("Cause is "+e.getCause());
		}

	}

}
