public class Clock{
    public int Hours;
    public int Minutes;
    public int Seconds;
    public String format="AM";
    Clock(){}
    Clock(int hours, int minutes, int seconds){
        Hours=hours;
        Minutes=minutes;
        Seconds=seconds;
    }
     public String TimeSet(){
        if (Hours >= 12) {
           Hours = Hours - 12;
           format= "PM";
      }
        System.out.println(Hours+":"+Minutes+":"+Seconds+" "+format);
        return format;
      }

      public static void main(String[] args){
          Clock c=new Clock(4, 56, 30);
          Clock c1=new Clock(20,30,46);
          c.TimeSet();
          c1.TimeSet();
      }
    
}