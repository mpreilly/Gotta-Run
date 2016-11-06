  public class Runner
  {
    private int speed;
    private int endurance;
    private int fatigue;
    private String firstName;
    private String lastName;
    private String team;
    
    public Runner(int spd, int end, String frnm, String lnm)
    {
      speed = spd;
      endurance = end;
      firstName = frnm;
      lastName = lnm;
      fatigue = 0;
    }
    
    public String numToWeekday(int dayNum)
    {
      
      switch (dayNum)
      {
      case 1: return "Monday";
      case 2: return "Tuesday";
      case 3: return "Wednesday";
      case 4: return "Thursday";
      case 5: return "Friday";
      case 6: return "Saturday";
      case 7: return "Sunday";
      default: return "Day Error";
      }
    }
    
    public int getSpeed()
    {
      return speed;
    }
    
    public void setSpeed(int spd)
    {
      speed = spd;
    }
    
    public int getEndurance()
    {
      return endurance;
    }
    
    public void setEndurance(int end)
    {
      endurance = end;
    }
    
    public int getFatigue()
    {
      return fatigue;
    }
    
    public void setFatigue(int fat)
    {
      fatigue = fat;
    }
    
    public String getTeam()
    {
      return team;
    }
    
    public void setTeam(String tm)
    {
      team = tm;
    }
    
    public String getName()
    {
      return firstName + " " + lastName;
    }
    
    public String getFirstName()
    {
      return firstName;
    }
    
    public String getLastName()
    {
      return lastName;
    }
    
    
  }