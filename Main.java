import java.util.ArrayList;
public class Main
{
  ArrayList <String> names = new ArrayList <String>();
  
  names.add("Maddy");
  names.add("Mallory");
  names.add("Sinead");
  names.add("Connor");
  names.add("Amy");
  
  TeamOne one = new TeamOne(names);
  
  one.createTeamOne();
  
  System.out.println("Team One: " + one);
  
  System.out.println("Team Two: " + one.getNewAL);
  
}
