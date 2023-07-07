import java.util.*;
class learner
{
    public static int ai(String ar[],String inp,int j)
    {
        for(int i=0;i<=j-1;i++)
        {
            inp=inp.replace(" you "," u ");
            inp=inp.replace(" are "," r ");
            inp=inp.replace(" your "," ur ");
            inp=inp.replace(" wt "," what ");
            inp=inp.replace(" wht "," what ");
            inp=inp.replace(" l8"," late");
            ar[i]=ar[i].replace(" you "," u ");
            ar[i]=ar[i].replace(" are "," r ");
            ar[i]=ar[i].replace(" your "," ur ");
            ar[i]=ar[i].replace(" wt "," what ");
            ar[i]=ar[i].replace(" wht "," what ");
            ar[i]=ar[i].replace(" l8"," late");
            Scanner sc=new Scanner(ar[i]);
            String[] wordsinp=inp.split("\\s+");
            if(ar[i].toLowerCase().equals(inp.toLowerCase()))
            {
                return i;
            }
            int inc=0,chinc=0;
            while(sc.hasNext())
            {
                String string=" "+sc.next().toLowerCase()+" ";
                if(!(string.equals(" a ")||string.equals(" an ")||string.equals(" the ")||string.equals(" in ")||string.equals(" on ")||string.equals(" at ")||string.equals(" by ")||string.equals(" onto ")||string.equals(" with ")||string.equals(" from ")||string.equals(" to ")||string.equals(" am ")||string.equals(" is ")||string.equals(" are ")||string.equals(" as ")||string.equals(" of ")||string.equals(" be ")||string.equals(" so ")||string.equals(" and ")))
                {
                    if(inp.toLowerCase().contains(string))
                    {
                        chinc++;
                    }
                    inc++;
                }
                else if(string.charAt(1)==('m')||string.charAt(1)==('i'))
                {
                    if(inp.toLowerCase().contains(" me ")||inp.toLowerCase().contains(" my ")||inp.toLowerCase().contains(" i "))
                    chinc++;
                    inc++;
                }
                else if(string.charAt(1)==('u'))
                {
                    if(inp.toLowerCase().contains(" ur ")||inp.toLowerCase().contains(" u "))
                    chinc++;
                    inc++;
                }
            }
            if(chinc==inc)
            {
                return i;
            }
        }
        return -1;
    }
}