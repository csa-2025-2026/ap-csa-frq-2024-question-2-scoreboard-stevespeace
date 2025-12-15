/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

*/

// Write the class below

public class Scoreboard 
{
    private String name1;
    private String name2; 
    private String point1; 
    private String point2; 

    private boolean isteam1active; 

    public Scoreboard(String iname1, String iname2)
    {
        name1 = iname1;
        name2 = iname2;
        point1 = 0;
        point2 = 0;

        isteam1active = true;
    }

    public void recordPlay(int play)
    {
        point1 = play
    }

    public String getScore()
    {
        String output = point1 + "-" + point2 + "-" +
        return output;
    }
}