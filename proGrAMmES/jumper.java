import java.util.*;
import java.lang.*;
class Helper extends TimerTask
{
    static Scanner sc=new Scanner(System.in);
    public void run()
    {
        sc.nextLine();
        if(jumper.main=='x')
        {
            jumper.main='o';
        }
        else
        {
            jumper.main='x';
        }
    }
}
public class jumper
{
    static String str="     ";
    static char main='x';
    static Timer timer=new Timer();
    static TimerTask task=new Helper();
    static Random r=new Random();
    public static void gmode()
    {
        if(str.charAt(0)!=' ')
        {
            if(str.charAt(0)!=main)
            {
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
        int l=r.nextInt(3);
        if(l==0)
        {
            str=str.substring(1)+'x';
        }
        else if(l==1)
        {
            str=str.substring(1)+'o';
        }
        else
        {
            str=str.substring(1)+' ';
        }
        disp();
        timer.schedule(task,0,500);
        jumper.gmode();
    }
    public static void disp()
    {
        System.out.println("\f"+main+str);
    }
}