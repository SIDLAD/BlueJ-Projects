
class somatowave4
{
    public static void main()
    {
        long x=System.currentTimeMillis();int a=8;int f=-1;
        for(int i=1;;i++)
        {
            long y=System.currentTimeMillis();
            if(y-50<x)
            {
                continue;
            }
            x=y;
            System.out.print("\f");
            sc(a);
            if(a==9||a==0)
            f*=-1;
            if(f==-1)
            a--;
            else
            a++;
        }
        
    }
    static void sc(int l)
    {
        for(int i=1;i<=36-l;i++)
        {
            if(i<l)
            {
                System.out.println();continue;
            }
            for(int j=1;j<=36;j++)
            {
                int flag=0;
                if(i<=9+l)
                {
                    if(j>9&&j<=18)
                    {
                        if(j==18-i+l)
                        {
                            flag=1;
                        }
                    }
                    else if(j>18&&j<27)
                    {
                        if(j==18+i-l)
                        {
                            flag=1;
                        }
                    }
                }
                if(i>9+l&&i<=18+l)
                {
                    if(j>9&&j<=18)
                    {
                        if(j==9-l+i-9)
                        {
                            flag=1;
                        }
                    }
                    else if(j>18&&j<27)
                    {
                        if(j==27+l-(i-9))
                        {
                            flag=1;
                        }
                    }
                }
                
                if(i>18-l&&i<=27-l)
                {
                    if(j>9&&j<=18)
                    {
                        if(j==18-(i-18)-l)
                        {
                            flag=1;
                        }
                    }
                    else if(j>18&&j<27)
                    {
                        if(j==18+i-18+l)
                        {
                            flag=1;
                        }
                    }
                }
                if(i>27-l&&i<=36-l)
                {
                    if(j>9&&j<=18)
                    {
                        if(j==9+(i-27)+l)
                        {
                            flag=1;
                        }
                    }
                    else if(j>18&&j<27)
                    {
                        if(j==27-(i-27)-l)
                        {
                            flag=1;
                        }
                    }
                }
                
                if(i>9&&i<=18)
                {
                    if(j==9+l-(i-9)||j==9+l+i-9)
                    {
                        flag=1;
                    }
                    else if(j==27-l-(i-9)||j==27-l+i-9)
                    {
                        flag=1;
                    }
                }
                if(i>18&&i<=27)
                {
                    if(j==0+l+(i-18)||j==18+l-(i-18))
                    {
                        flag=1;
                    }
                    else if(j==18-l+(i-18)||j==36-l-(i-18))
                    {
                        flag=1;
                    }
                }
                if(flag==1)
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