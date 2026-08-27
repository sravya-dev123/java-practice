public class constructor {
    public int i;
    public static void main(String[] args) {
        constructor cp=new constructor(309);
        System.out.println(cp.i);
    }
    public constructor(){
i=50;
    }
    public constructor(int a){
        i=a;
        System.out.println("this is a constructor");
    }
        
    }

