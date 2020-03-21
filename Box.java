public class Box {
    public int length;
    public int breadth;
    public int height;
    Box(){}
    Box(int Length, int Breadth, int Height){
        length=Length;
        breadth=Breadth;
        height=Height;
        }
        public int volume(){
            int v=length*breadth*height;
            System.out.println("volume ="+v);
            return v;
        }
    public static void main(String args[]) {
        Box b=new Box(2,3,5);
        Box b1=new Box(20,30,40);
        b.volume();
        b1.volume();
      
    }
}