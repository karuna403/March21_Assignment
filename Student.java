public class Student {
    public int Id;
    public String Name;
    public int Marks;
    public static boolean isSame;
    Student(){}
    Student(int id, String name, int marks){
        Id=id;
        Name=name;
        Marks=marks;
        }
    public void details(){
        System.out.println("id:"+Id+"\nName:"+Name+"\nmarks:"+Marks+"\n");
    }
    
    public static void main(String args[]) {
        Student s1=new Student(1, "manu", 300);
        Student s2=new Student(1, "manu", 200);
        if(s1.Id==s2.Id&& (s1.Name).equals(s2.Name)&& s1.Marks==s2.Marks){
            isSame=true;
            System.out.println("Both objects are same :\t"+isSame+"\n");
           }
           else{
               isSame=false;
               System.out.println("Both objects are not same :\t"+isSame+"\n");
           }
         s1.details();
          s2.details();
}
}