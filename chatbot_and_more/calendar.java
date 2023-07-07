import java.util.*;
import java.text.*;
class calendar
{
        DateFormat d = new SimpleDateFormat("dd/MM/yy");
        DateFormat t = new SimpleDateFormat("HH:mm:ss");
        Date obj=new Date();
        Calendar dow=Calendar.getInstance();
        int today=dow.get(Calendar.DAY_OF_WEEK);
        String day;
        void day_of_week()
        {
            switch(today)
            {
                case 1:
                day="Sunday";
                break;
            
                case 2:
                day="Monday";
                break;
                
                case 3:
                day="Tuesday";
                break;
            
                case 4:
                day="Wednesday";
                break;
                
                case 5:
                day="Thursday";
                break;
                
                case 6:
                day="Friday";
                break;
                
                case 7:
                day="Saturday";
                break;
            }
        }
        void mdatedayandtime()
        {
            day_of_week();
            System.out.print("Today's date is ");
            System.out.println(d.format(obj));
            System.out.print("It is a ");
            System.out.println(day);
            System.out.print("The time now is ");
            System.out.println(t.format(obj));
        }
        void mdayandtime()
        {
            day_of_week();
            System.out.print("Today is a ");
            System.out.println(day);
            System.out.print("The time now is ");
            System.out.println(t.format(obj));
        }
        void mdateandtime()
        {
            System.out.print("Today's date is ");
            System.out.println(d.format(obj));
            System.out.print("The time now is ");
            System.out.println(t.format(obj));
        }
        void mdateandday()
        {
            day_of_week();
            System.out.print("Today's date is ");
            System.out.println((d.format(obj)));
            System.out.print("It is a ");
            System.out.println(day);
        }
        void mdate()
        {
            System.out.print("Today's date is ");
            System.out.println((d.format(obj)));
        }
        void mday()
        {
            System.out.print("Today is a ");
            day_of_week();
            System.out.println(day);
        }
        void mtime()
        {
            System.out.print("The time now is ");
            System.out.println(t.format(obj));
        }
        void cal(String inp)
        {
            if(inp.toLowerCase().contains(" date ")&&inp.toLowerCase().contains(" time ")&&inp.toLowerCase().contains(" day "))
            mdatedayandtime();
            else if(inp.toLowerCase().contains(" date ")&&inp.toLowerCase().contains(" time "))
            mdateandtime();
            else if(inp.toLowerCase().contains(" date ")&&inp.toLowerCase().contains(" day "))
            mdateandday();
            else if(inp.toLowerCase().contains(" time ")&&inp.toLowerCase().contains(" day "))
            mdayandtime();
            else if(inp.toLowerCase().contains(" date "))
            mdate();
            else if(inp.toLowerCase().contains(" day "))
            mday();
            else if(inp.toLowerCase().contains(" time "))
            mtime();
        }
}