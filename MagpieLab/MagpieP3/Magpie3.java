public class Magpie3
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		
		if(statement.length() == 0)
		{
			response = "Say something, please.";
		}

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement,"father", 0) >= 0
				|| findKeyword(statement,"sister", 0) >= 0
				|| findKeyword(statement, "brother",0) >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "cat", 0) >= 0
				|| findKeyword(statement,"dog", 0) >= 0
				|| findKeyword(statement,"bird", 0) >= 0
				|| findKeyword(statement, "fish",0) >= 0)
		{
			response = "Tell me more about your pet!";
		}
		else if(findKeyword(statement, "Smith", 0) >=0)
		{
			response = "She sounds like a pretty great teacher!";
		}
		
		else if(findKeyword(statement, "I want to",0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		
		else
		{
			int psn = findKeyword(statement, "You" , 0);
			if(psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				psn = findKeyword(statement, "i", 0);
				if(psn >= 0 && findKeyword(statement, "you", psn) >= 0)
				{
					response = transformIWantToStatement(statement);
				}
				else
				{
					response = getRandomResponse(); 
				}
			}
			
		}
		return response; 
	}	
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}
	
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim().toLowerCase();
		String lastChar = statement.substring(statement.length() - 1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() -1);
		}
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I" + restOfStatement + "you?";
	}
	
	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.charAt(statement.length() - 1) + "";
		if(lastChar.equals("."))
		{
			statement = statement.replace(lastChar, "");
		}
		int psn = findKeyword(statement, "I want to");
		String restOfStatement = statement.substring(psn+9);
		return "What would it mean to" + restOfStatement;
	}
	
	private String transformIYouStatement(String statement)
	{
		statement = statement.trim().toLowerCase();
		String lastChar = statement.substring(statement.length() - 1);
		if(lastChar.equals("."))
		{
			statement.substring(0, statement.length() - 1);
		}
		int psnI = findKeyword(statement, "I");
		int psnYou = findKeyword(statement, "you", psnI + 1);
		String restOfStatement = statement.substring(psnI + 1, psnYou);
		return "Why do you" + restOfStatement + "me?";
	}
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		
		int psn = phrase.indexOf(goal, startPos);
			
		while (psn >= 0)
		{
			String before = "";
			String after = "";
			
		
			/*As long as psn >= 0...
				Check if psn > 0 - there is no need to check for before at the
				beginning of the word
					set before = the slot in phrase before psn */

			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			
			/*check if you can fit goal into the rest of phrase - no need to
			proceed otherwise
			set after = the slot in phrase after psn + length of goal */
		
			if(psn + goal.length() + 1 < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
			if ((before.compareTo("a") < 0 || before.compareTo("z") > 0) && (after.compareTo("a") < 0 || after.compareTo("z") > 0))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}
		return -1; 
	}
	
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if(whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if(whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if(whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if(whichResponse == 3)
		{
			response = "You don't say.";
		}
		
		return response;
	}
	
		
}