import java.io.*;
class threeler
{
    public static void main() throws IOException
    {
        long x=System.currentTimeMillis();int a=7;int f=-1;
        for(int i=1;;i++)
        {
            long y=System.currentTimeMillis();
            if(y-80<x)
            {
                continue;
            }
            x=y;
            System.out.print("\f");
            sc(a);
            if(a==0||a==15)
            f*=-1;
            if(f==-1)
            a--;
            else
            a++;
        }
        
    }
    static void sc(int l)
    {
        System.out.println("                             •                ");
        for(int i=1;i<=30;i++)
        {
            for(int j=1;j<=45;j++)
            {
                if(j-15<15-7||j-15>15+7)
                {
                    System.out.print(" ");
                }
                else if((j-15<15-i||j-15>15+i)&&i<15)
                {
                    System.out.print(" ");
                }
                else if(i>15&&(j-15<0+i-15||j-15>30-i+15))
                {
                    System.out.print(" ");
                }
                else if(j-15==15-7||j-15==15+7)
                {
                    System.out.print("•");
                }
                else if((j-15==15-i||j-15==15+i)&&i<15)
                {
                    System.out.print("•");
                }
                else if(i>=15&&(j-15==0+i-15||j-15==30-i+15))
                {
                    System.out.print("•");
                }
                else if(j-15==30-i+l||j-15==0+i-l)
                {
                    System.out.print("•");
                }
                else if(j-15==15-(i-15)-l||j-15==15+(i-15)+l)
                {
                    System.out.print("•");
                }
                else if(j-15==30-i+(l-15)||j-15==0+i-(l-15))
                {
                    System.out.print("•");
                }
                else if(j-15==15-(i-15)-(l-15)||j-15==15+(i-15)+(l-15))
                {
                    System.out.print("•");
                }
                else if(j-15==30-i+(l-7)||j-15==0+i-(l-7))
                {
                    System.out.print("•");
                }
                else if(j-15==15-(i-15)-(l-7)||j-15==15+(i-15)+(l-7))
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