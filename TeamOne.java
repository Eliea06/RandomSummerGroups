import java.util.ArrayList; 
public class TeamOne
{
  
  private ArrayList <String> names;
  
  public TeamOne (ArrayList <String> pNames)
  {
    names = pNames;
  }
  
  public String[] createTeamOne()
  {
    String[] team = new String[2];
    
    for(int i = 0; i<2; i++)
    {
      int index = (int)(math.random()*3);
      
      team[i] = names.get(index);
    }
    
    return team;
    
  }
  
  public ArrayList<String> getNewAL(String[] teamOne)
  {
    ArrayList<String> nueva = names;
    
    for(int i = 0; i < teamOne.length; i++)
    {
      for(int j = 0; j < nueva.size(); j++)
      {
        if (nueva.get(j).equals(teamOne[i]))
        {
          nueva.remove(j);
        }
      }
    }
    
    return nueva;
    
  }
}
