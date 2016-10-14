import java.util.Scanner;
public class Lab05_EX03
{
	static String science;
	static String math;
	static String english;
	static String history;
	static String compsci;
	static String foreignlanguage;
	static String art;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter science grade: ");
		String science = kb.next();
		System.out.println("Please enter math grade: ");
		String math = kb.next();
		System.out.println("Please enter english grade: ");
		String english = kb.next();
		System.out.println("Please enter history grade: ");
		String history = kb.next();
		System.out.println("Please enter compsci grade: ");
		String compsci = kb.next();
		System.out.println("Please enter foreignlanguage grade: ");
		String foreignlanguage = kb.next();
		System.out.println("Please enter art grade: ");
		String art = kb.next();
	
		double gPoints = calcPoints(science) + calcPoints(math)+calcPoints(english)+calcPoints(history)+calcPoints(compsci)+calcPoints(foreignlanguage)+calcPoints(art);
		
		System.out.println("Your GPA is " + gPoints/7);

	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}