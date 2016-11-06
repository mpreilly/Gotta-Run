import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the world of distance running!");
    System.out.print("Please enter your name. \nFirst: ");
    
    Scanner s = new Scanner(System.in);
    String firstName = s.nextLine();
    
    System.out.print("Last: ");
    String lastName = s.nextLine();
    
    DistanceRunner p1 = new DistanceRunner(firstName, lastName);
    
    System.out.println("\nYou are a freshman in high school, joining the high school Cross Country team for the first time.");
    System.out.print("What is the name of your school?: ");
    
    String school = s.nextLine();
    p1.setTeam(school);
    
    System.out.println("\n" + p1.getName() + "\n" +  p1.getTeam());
    
    System.out.println("\nHere are your stats. These will contribute to your success as a runner. (Press Enter to continue)");
    System.out.println("\nSpeed = " + p1.getSpeed());
    System.out.println("Endurance = " + p1.getEndurance());
    System.out.println("Fatigue = " + p1.getFatigue());
    s.nextLine();
    
    System.out.println("\nSpeed is pretty self explanatory. Higher speed will benefit more in shorter races "
                    + "\nand will help you kick faster at the end of races, which will make a big difference in"
                    + "\nchampionship races where everyone is only running to win (But we'll worry about that later).");
    s.nextLine();
    System.out.println("\n\nEndurance is a measure of your ability to run long distances at a fast pace without tiring."
                    + "\nYour success as a distance runner will be dependent on a favorable combination of both of"
                    + "\nthese attributes.");
    s.nextLine();
    System.out.println("\n\nFatigue is a measure of how tired your legs are at a given time. Workouts and races will add "
                    + "\ndifferent amounts of fatigue to your legs, and regular runs or days off will allow your legs"
                    + "\nto recover. You need to mix workouts and recovery runs in the right amounts, or your fatigue"
                    + "\nwill become too high and your performance will decline.");
    s.nextLine();
    System.out.println("\n\nGot all that? Now that we've gotten that sorted out, it's time to get into the season.");
    s.nextLine();
    System.out.println("\n\n########## Week 1 ##########");
    
    //It begins.
    System.out.println("\nCoach: Welcome to the team, " + p1.getName() + ". We have more kids than ever coming out for the team, so I'm"
                    + "\ngoing to have to give you the freedom to select your own workouts for each day. I'll be here"
                    + "\nto give you advice and tell you how each run or workout will affect your speed, endurance, "
                    + "\nand fatigue, but the rest is up to you. I know what you're thinking: \"this would never happen"
                    + "\nin real life, why would a freshman who's completely new to running need to coach himself?\""
                    + "\nDeal with it, this game wouldn't be any fun if you didn't make the decisions. (Press Enter to continue");
    s.nextLine();
   
      System.out.println("\nCoach: Here, I'll help you out for the first couple days before you go off on your own."
                      + "\nIt's Saturday. We don't have a race for the next couple weeks"
                      + "\nbecause the season just started, and I'm assuming you've been running for most of the summer"
                      + "\nso you have a decent base of training. I suggest starting it off with a tempo run. That'll"
                      + "\nget your legs ready to run a bit faster, without forcing you right into some interval workouts"
                      + "\nthat'll tire you out. Use the numbers to select your run.\n");
      
      s.nextLine();
      
      System.out.println(DistanceRunner.runChoices);
     
      int pickRun = s.nextInt();
      if (pickRun < 1 || pickRun > 7)
      {
        System.out.print("Must be one of the choices. Please enter a new number: ");
        pickRun = s.nextInt();
      }
      System.out.println();
      
      p1.runSwitch(pickRun);
      
      System.out.println("\nSpeed = " + p1.getSpeed());
      System.out.println("Endurance = " + p1.getEndurance());
      System.out.println("Fatigue = " + p1.getFatigue());
      
      if (pickRun == 4)
        System.out.println("\nCoach: That felt good, right? It's too bad I won't be coaching you for much longer. *awkward laughter*"
                         + "\nYou'll have the hang of this soon.");
      else
        System.out.println("\nCoach: You didn't even do what I said? Alright, looks like you'll be fine without"
                        + "\nme in a couple days.");
      
      System.out.println("\nCoach: You've completed your first day! See you tomorrow."
                      + "\n----------------------------------------------------------------");
 
      System.out.println("\nCoach: It's Sunday. You want to recover from that tempo because it's a long season."
                      + "\nGenerally runners will do workouts every two or three days, with recovery runs"
                      + "\nin between. You don't want your fatigue to build up. A medium run will work fine"
                      + "\nfor today, and before races you're going to want to do an easy run.\n");
       
      System.out.println(DistanceRunner.runChoices);
      
      pickRun = s.nextInt();
      if (pickRun < 1 || pickRun > 7)
      {
        System.out.print("Must be one of the choices. Please enter a new number: ");
        pickRun = s.nextInt();
      }
      System.out.println();
      
      p1.runSwitch(pickRun);
      
      System.out.println("\nSpeed = " + p1.getSpeed());
      System.out.println("Endurance = " + p1.getEndurance());
      System.out.println("Fatigue = " + p1.getFatigue());
      
      System.out.println("Coach: Alright, that works. Tomorrow's monday of the first week of the season."
                      + "\nThis is where I'm not going to be able to pay much attention to you because I"
                      + "\nhave so many runners. Best of luck, our first race is Saturday of week 3.");
      
      System.out.println("\n**Tutorial Completed.**"
                        + "\n\nWelcome to the loop. For the purpose of this game, we will say that each"
                        + "\nseason is ten weeks long. The last 4 weeks of each season will be taken up"
                        + "\nby championship meets- from the county meet to nationals. There will be time at"
                        + "\nthe beginning of each season for training and the middle of the season will have"
                        + "\ninvitationals. At the end of each season, you will take a week off before training"
                        + "\nfor the next season, so your fatigue will go to zero but you will lose some endurance"
                        + "\nand speed, which will be restored as you resume training.");
      
      for(int year = 1; year <= 4; year++)      //year is currently set to loop for the 4 years of high school
      {
        for(int season = 1; season <= 3; season++)
        {
          for(int week = 1; week <= 10; week++)
          {
            switch (season)
            {
            case 1: System.out.print("\n### Cross Country: ");
                break;
            case 2: System.out.print("\n### Winter Track: ");
                break;
            case 3: System.out.print("\n### Spring Track: ");
                break;
            }
          
            System.out.println("Week " + week + " ###" );
            System.out.println("This Saturday: " + p1.meet(season, week));
            
            for(int day = 1; day <= 7; day++)
            {
                
                if (p1.meetBool(season, week) == false || (day != 6))
                {
                  System.out.println(p1.numToWeekday(day));
                  System.out.print("\nSpeed = " + p1.getSpeed() + "  |  ");
                  System.out.print("Endurance = " + p1.getEndurance() + "  |  ");
                  System.out.print("Fatigue = " + p1.getFatigue());
                  System.out.println("\nPlease select the run for today: ");
                  System.out.println(DistanceRunner.runChoices);
                  pickRun = s.nextInt();
                  if (pickRun < 1 || pickRun > 7)
                  {
                    System.out.print("Must be one of the choices. Please enter a new number: ");
                    pickRun = s.nextInt();
                  }
                  System.out.println();
                  p1.runSwitch(pickRun);
                }
                
                else
                {
                  System.out.println("\nRACE DAY: " + p1.meet(season, week));
                  if(season == 1)
                  {
                    System.out.println(p1.race(5000));
                  }
                  else
                  {
                    System.out.println("What race do you want to run?:"
                                     + "\n1: 800"
                                     + "\n2: 1600"
                                     + "\n3: 3200");
                    int racePick = s.nextInt();
                    switch(racePick)
                    {
                    case 1: System.out.println(p1.race(800));
                    case 2: System.out.println(p1.race(1600));
                    case 3: System.out.println(p1.race(3200));
                    }
                  }
                }
                System.out.println("\nSpeed = " + p1.getSpeed());
                System.out.println("Endurance = " + p1.getEndurance());
                System.out.println("Fatigue = " + p1.getFatigue());
                
                System.out.println("See you tomorrow. \n-------------------------------");
                
                
            }
          }
          
          p1.setFatigue(0);     //end of season
          
        }
      }
    
    
  }
}
