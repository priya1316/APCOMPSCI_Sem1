import java.util.Scanner;
public class Magpie3
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement, "dog",0) >= 0
				|| findKeyword(statement, "cat",0) >= 0
				|| findKeyword(statement, "turtle",0) >= 0
				|| findKeyword(statement, "frog",0)>= 0)
		{
			response = "Tell me more about your pets.";
		}
		
		else if (findKeyword(statement, "Mr. Robinette",0)>= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}

		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			int psn = findKeyword(statement, "you", 0);
			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				psn = findKeyword(statement, "I", 0);
				if(psn >=0 && findKeyword(statement, "you", psn) >=0)
					response = transformIYouStatement(statement);
				else
					response = getRandomResponse();

			}
		}
		
		return response;
	}

	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() -1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length()-1);
		}

		int psn = findKeyword(statement, "I want to");
		String restOfStatement = statement.substring(psn + 9);
		return "What would it mean to" + restOfStatement + "?";
	}


	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() -1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length()-1);
		}

		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I" + restOfStatement + "you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() -1);
		
		if(lastChar.equals("."))
		{
			phrase = phrase.substring(0, phrase.length()-1);
		}
		
		int psnOfI = findKeyword(statement, "I");
		int psnOfYou = findKeyword(phrase , "you", psnOfI + 1);
		String restOfStatement = phrase.substring(psnOfI + 1, psnOfYou);
		
		return "Why do you " + restOfStatement + " me?";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{

			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),
										psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

}
