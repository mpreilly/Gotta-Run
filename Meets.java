
public class Meets
{
  public String seasonSwitch(int season, int week)
  {
    switch (season)
    {
    case 1: return crossMeets(week);
    case 2: return winterMeets(week);
    case 3: return springMeets(week);
    default: return "**season meet error";
    }
  }
  
  public String crossMeets(int week)
  {
    switch (week)
    {
    case 1: return "No meet this week";
    case 2: return "No meet this week";
    case 3: return "Warwick Invitational";
    case 4: return "No meet this week";
    case 5: return "Manhattan Invitational";
    case 6: return "No meet this week. Postseason starts next week.";
    case 7: return "County Championships";
    case 8: return "State Qualifier";
    case 9: return "State Champtioship";
    case 10: return "National Championship";
    default: return "**meet week error (xc)";
    }
  }
  
  public String winterMeets(int week)
  {
    switch (week)
    {
    case 1: return "No meet this week";
    case 2: return "No meet this week";
    case 3: return "North Shore Invitational";
    case 4: return "Freedom Games";
    case 5: return "Stanner Games";
    case 6: return "League Championships";
    case 7: return "County Championships";
    case 8: return "State Qualifier";
    case 9: return "State Champtioship";
    case 10: return "National Championship";
    default: return "**meet week error (winter)";
    }
  }
  
  public String springMeets(int week)
  {
    switch (week)
    {
    case 1: return "No meet this week";
    case 2: return "No meet this week";
    case 3: return "No meet this week";
    case 4: return "Westhampton Invitational";
    case 5: return "St. Anthony's Invitational";
    case 6: return "Loucks Games";
    case 7: return "County Championships";
    case 8: return "State Qualifier";
    case 9: return "State Champtioship";
    case 10: return "National Championship";
    default: return "**meet week error (spring)";
    }
  }
}
