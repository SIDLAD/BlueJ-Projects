import java.io.*;
class somatowave2
{
    public static void main() throws IOException
    {
        long x=System.currentTimeMillis();int a=1;int f=1;
        for(int i=1;;i++)
        {
            long y=System.currentTimeMillis();
            if(y-20<x)
            {
                continue;
            }
            x=y;
            System.out.print("\f");
            sc(a);
            if(a==15||a==0)
            f*=-1;
            if(f==-1)
            a--;
            else
            a++;
        }
        
    }
    static void sc(int l)
    {
        for(int i=1;i<=12;i++)
        {
            for(int j=1;j<=26;j++)
            {
                if(j==12-i+2+l||j==12+i+2-l)
                {
                    System.out.print("•");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=12;i>0;i--)
        {
            for(int j=1;j<=26;j++)
            {
                if(j==12-i+2+l||j==12+i+2-l)
                {
                    System.out.print("•");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}