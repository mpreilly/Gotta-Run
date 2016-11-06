
public class Races
{
  double timeStats;
  double timeSec;
  double thisTimeSec;

  public double time800(int spd, int end, int fat)
  {
    timeStats = 1.33*spd + .67*end;       //speed counts more than endurance for 800
    timeSec = 105 + (10000/timeStats) - 10;      //lowest time you can reach is 105 s (1:45)
    return timeSec;
  }

  public double time1600(int spd, int end, int fat)
  {
    timeStats = spd + end;
    timeSec = 230 + (20000/timeStats) - 20; //the lowest time you get to is 230 s (3:50)
    return timeSec;                     //and then the equation is just what I messed around with and made work.
                                            //https://www.desmos.com/calculator
  }

  public double time3200(int spd, int end, int fat)
  {
    timeStats = .67*spd + 1.33*end;
    timeSec = 510 + (40000/timeStats) - 40;              //lowest time is 510 s (8:30)
    return timeSec;
  }
}
