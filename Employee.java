public class Employee{
    public int Id;
    public String Name;
    private int Basic_Salary;
     private float Employee_percentage;
     Employee(){}
    Employee(int id, String name, int basicsalary, float  employee_percentage){
    Id=id;
    Name=name;
    Basic_Salary=basicsalary;
    Employee_percentage=employee_percentage;
    }
    
    public String toString(){
        int Ep= (int)Employee_percentage;
        int E_Pf=(Basic_Salary/100)*Ep;
        String c=Integer.toString(E_Pf);
    
        System.out.println(Id+" "+"Employee details:"+"\n"+"Id:"+Id+"\n"+"name:"+Name+"\n"+"Salary:"+Basic_Salary+"\n"+"Pf:"+E_Pf+"\n");
        return c;
    }
     
    public static void main(String[] args){
        Employee e=new Employee(1, "manu", 20000, 12.0f);
        Employee e1=new Employee(2, "Dhinu", 25000, 12.5f);
        e.toString();
        e1.toString();
    }
    
}
