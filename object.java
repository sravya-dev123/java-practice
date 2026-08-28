public class object {
  int id;
  int id1;
    public object(){
 int id=10;
  int id1=20;
    }
public object(int id,int id1){
  this.id=id;
  this.id1=id1;
}
public static void main(String[] args) {
    object t=new object();
    object t1=new object(10,32);
    object t2=new object(20,21);
    System.out.println(t.add());
      System.out.println(t1.add());
        System.out.println(t2.add());
System.out.println(t1==t2);
}
public int add(){
  return id+id1;
}
}