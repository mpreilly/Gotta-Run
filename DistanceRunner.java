public class DistanceRunner extends Runner
{
  private int distSpeed;
  private int distEndur;
  private int distFatigue;
  private double pr800 = 10000;
  private double pr1600 = 10000;
  private double pr3200 = 10000;
  private double timeSec;
  private double pr5000 = 10000;
  
  static String runChoices = "Run Choices:    1: Easy Run: Endurance +1, Fatigue -15"
                          + "\n                2: Medium Run: Endurance +3, Fatigue -10"
                          + "\n                3: Long Run: Endurance +10, Fatigue +10"
                          + "\n                4: Tempo Run: Speed +3, Endurance +7, Fatigue +10"
                          + "\n                5: Medium Interval Workout: Speed +5, Endurance +7, Fatigue +15"
                          + "\n                6: Short Interval Workout: Speed +10, Endurance +3, Fatigue +20"
                          + "\n                7: Day Off: Speed -1, Endurance -5, Fatigue -20";
 

  public DistanceRunner(String frnm, String lnm)
  {
    super(30, 50, frnm, lnm);
  }
  
  public void runSwitch(int runPick)
  {
    switch (runPick)
    {
    case 1: easyRun();
          break;
    case 2: mediumRun();
          break;
    case 3: longRun();
          break;
    case 4: tempo();
          break;
    case 5: mediumIntervals();
          break;
    case 6: shortIntervals();
          break;
    case 7: dayOff();
          break;
    }
  }
  
  public void easyRun()
  {
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distEndur += 1;
    distFatigue -= 20;
    
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Run Completed- Easy Run: Endurance +1, Fatigue -15");
  }
  
  public void mediumRun()
  {
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distEndur += 3;
    distFatigue -= 10;
    
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Run Completed- Medium Run: Endurance +3, Fatigue -10");
  }
  
  public void longRun()
  {
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distEndur += 10;
    distFatigue += 10;
    
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Run Completed- Long Run: Endurance +10, Fatigue +10");
  }
  
  public void tempo()
  {
    distSpeed = getSpeed();
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distSpeed += 3;
    distEndur += 7;
    distFatigue += 10;
    
    setSpeed(distSpeed);
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Workout Completed- Tempo Run: Speed +3, Endurance +7, Fatigue +10");
  }
  
  public void mediumIntervals()
  {
    distSpeed = getSpeed();
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distSpeed += 5;
    distEndur += 7;
    distFatigue += 15;
    
    setSpeed(distSpeed);
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Workout Completed- Medium Interval Workout: Speed +5, Endurance +7, Fatigue +15");
  }
  
  public void shortIntervals()
  {
    distSpeed = getSpeed();
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distSpeed += 7;
    distEndur += 3;
    distFatigue += 20;
    
    setSpeed(distSpeed);
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Workout Completed- Short Interval Workout: Speed +10, Endurance +3, Fatigue +20");
  }
  
  public void dayOff()
  {
    
    distEndur = getEndurance();
    distFatigue = getFatigue();
    
    distEndur -= 5;
    distFatigue -= 30;
    
    setEndurance(distEndur);
    setFatigue(distFatigue);
    
    System.out.println("Day Off Completed: Speed -1, Endurance -5, Fatigue -20");
  }
  
  public String race(int race)
  {
    switch (race)
    {
    case 800:
      return time800();
    case 1600:
      return time1600();
    case 3200: 
      return time3200();
    case 5000:
      return time5k();
    default: 
      return ("time error?");
    }
  }

  public String time800()
  {
    
    timeSec = 105 + (10000 / (1.33 * getSpeed() + .67 * getEndurance())) - 10; // lowest time you can reach is 105 s (1:45)
    distFatigue += 30;                                      
    return toString(timeSec, 800);
  }

  public String time1600()
  {
    timeSec = 230 + (20000 / (getSpeed() + getEndurance())) - 20; // the lowest time you get to is
    distFatigue += 30;                                          // 230 s (3:50)
    return toString(timeSec, 1600); // and then the equation is just what I messed around with
                    // and made work.
                    // https://www.desmos.com/calculator
  }

  public String time3200()
  {
    timeSec = 510 + (40000 / (.67 * getSpeed() + 1.33 * getEndurance())) - 40; // lowest time is 510 s (8:30)
    distFatigue += 30;
    return toString(timeSec, 3200);
  }
  
  public String time5k()
  {
    timeSec = 900 + (60000 / (.5 * getSpeed() + 1.5 * getEndurance())) - 60; // lowest time is 900 s (15:00)
    distFatigue += 30;
    return toString(timeSec, 5000);
  }
  
  public String toString(double timeSec, int race)
  {
    int minutes = (int) Math.floor(timeSec / 60);
    double seconds = timeSec % 60;
    if (pr(timeSec, race))
      return ("You ran " + minutes + ":" + seconds + "; That's a new PR.");
    else
      return ("You ran " + minutes + ":" + seconds);
  }
  
  public boolean pr(double timeSec, int race)
  {
    switch (race)
    {
    case 800:
      {
        if (timeSec < pr800)
        {
          pr800 = timeSec;
          return true;
        }
        else
          return false;
      }
    case 1600:
      {
        if (timeSec < pr1600)
        {
          pr1600 = timeSec;
          return true;
        }
        else
          return false;
      }
    case 3200:
      {
        if (timeSec < pr3200)
        {
          pr3200 = timeSec;
          return true;
        }
        else
          return false;
      }
    case 5000:
      {
        if (timeSec < pr5000 )
        {
          pr5000 = timeSec;
          return true;
        }
        else
          return false;
      }
    default:
      return false;
    }
  }
  
  public String meet(int season, int week)
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
  
  public Boolean meetBool(int season, int week)
  {
    switch (season)
    {
    case 1: return crossMeetsBool(week);
    case 2: return winterMeetsBool(week);
    case 3: return springMeetsBool(week);
    default: return false;
    }
  }
  
  public Boolean crossMeetsBool(int week)
  {
    switch (week)
    {
    case 1: return false;
    case 2: return false;
    case 3: return true;
    case 4: return false;
    case 5: return true;
    case 6: return false;
    case 7: return true;
    case 8: return true;
    case 9: return true;
    case 10: return true;
    default: return true;
    }
  }
  
  public Boolean winterMeetsBool(int week)
  {
    switch (week)
    {
    case 1: return false;
    case 2: return false;
    case 3: return true;
    case 4: return true;
    case 5: return true;
    case 6: return true;
    case 7: return true;
    case 8: return true;
    case 9: return true;
    case 10: return true;
    default: return true;
    }
  }
  
  public Boolean springMeetsBool(int week)
  {
    switch (week)
    {
    case 1: return false;
    case 2: return false;
    case 3: return false;
    case 4: return true;
    case 5: return true;
    case 6: return true;
    case 7: return true;
    case 8: return true;
    case 9: return true;
    case 10: return true;
    default: return true;
    }
  }
  
}
    