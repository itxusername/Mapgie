public class Magpie2
{
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()        
    {
        final int NUMBER_OF_RESPONSES = 6; // Updated total number of responses
        int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);      
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";
        }
        else if (whichResponse == 4)
        {
            response = "That's quite fascinating, tell me more.";
        }
        else if (whichResponse == 5)
        {
            response = "I see. How does that make you feel?";
        }
        return response;
    }

     /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";        
        response = getRandomResponse();       
        return response;
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";        
        if (statement.toLowerCase().contains("math") || statement.toLowerCase().contains("science"))
        {
            response = "Is that your favorite class?";
        }
        else if (statement.toLowerCase().contains("packer high school"))
        {
            response = "Packer High School is the best school!";
        }
        else if (statement.toLowerCase().contains("video games"))
        {
            response = "Video games are fun!";
        }
        else
        {
            response = getRandomResponse();
        }

        return response;
    }
}