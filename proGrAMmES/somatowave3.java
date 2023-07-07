import java.io.*;
class somatowave3
{
    public static void main() throws IOException
    {
        long x=System.currentTimeMillis();int a=12;int f=-1;
        for(int i=1;;i++)
        {
            long y=System.currentTimeMillis();
            if(y-30<x)
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
        for(int i=1;i<=15;i++)
        {
            for(int j=1;j<=32;j++)
            {
                if((j==15-i+2+l&&j<=16)||(j==15+i+2-l&&j>=17))
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
        for(int i=15;i>0;i--)
        {
            for(int j=1;j<=32;j++)
            {
                if((j==15-i+2+l&&j<=16)||(j==15+i+2-l&&j>=17))
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