public class constants
 {
    public static void main(String[] args) 
    {
        final int mynum=10;
        
        //final used to a constants
        
        System.out.println(mynum);
        
        /*You should declare variables as final when their values should never change. For example, the number of minutes in an hour, or your birth year:*/
        
        final int MINUTES_PER_HOUR = 60;
    
        final int BIRTHYEAR = 1980;

        System.out.println(MINUTES_PER_HOUR);
    
        System.out.println(BIRTHYEAR);
    }
}
