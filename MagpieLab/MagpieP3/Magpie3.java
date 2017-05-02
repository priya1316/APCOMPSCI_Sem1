package Complete;

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
			return "Say something, please.";
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
		else if (findKeyword(statement, "no", 0) >= 0)
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
		
		else if(statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		
		else
		{
			response = getRandomResponse();
			
		}
		return response; 
	}	
		
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
			
		while (psn > 0)
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
		
			if(psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
		}
	}
}