public class Movie {
    public String Title;
    public String Studio;
    public String Rating;
    Movie(){}
    Movie(String title, String studio, String rating){
        Title=title;
        Studio=studio;
        Rating=rating;
    }
    public void MovieDetails(){
        System.out.println("Movie deails:"+"\n"+"title = "+Title+"\n"+"studio = "+Studio+"\n"+"rating = "+Rating);
    }
    public static void main(String args[]) {
      Movie m=new Movie("CasinoRoyable","Eon Production","PG-13" );
m.MovieDetails();
      
    }
}