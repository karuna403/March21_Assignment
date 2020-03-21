public class MovieSetPG {
    public String Title;
    public String Studio;
    public String Rating;
    MovieSetPG(){}
    MovieSetPG(String title, String studio){
        Title=title;
        Studio=studio;
       
        }
     public  void setName(String n){
        Rating=n;
    }
    public  String getName(){
        return Rating;
    }
    
    
    public static void main(String args[]) {
      MovieSetPG m=new MovieSetPG("CasinoRoyable","Eon Production" );

m.setName("LM");
System.out.println("Movie deails:"+"\n"+"title = "+m.Title+"\n"+"studio = "+m.Studio+"\n"+"rating ="+m.getName());
}
}