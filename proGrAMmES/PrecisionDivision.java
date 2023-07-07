import java.util.*;
class PrecisionDivision
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend");
        String l=sc.nextLine();
        System.out.println("Enter divisor");
        String d1=sc.nextLine();
        /*if(d1.contains(".")||l.contains("."))
        {
            int q=d1.indexOf(".");
            int w=l.indexOf(".");
            int m=0;
            d1=d1.replace(".","");
            l=l.replace(".","");
            if(q==-1)
            {
                m=l.length()-w;
            }
            else if(w==-1)
            {
                m=-d1.length()+q;
            }
            else
            {
                m=d1.length()-q-(l.length()-w);
            }
            if(m>0)
            {
                for(int i=1;i<=m;i++)
                {
                    d1+=0;
                }
            }
            else if(m<0)
            {
                m*=-1;
                for(int i=1;i<=m;i++)
                {
                    l+=0;
                }
            }
        }
        String n=l+".0";*/
        String n="";
        if(d1.contains(".")&&Integer.parseInt(d1.substring(d1.indexOf(".")+1))!=0)
        {
            int a=d1.length()-d1.indexOf(".")-1;
            if(l.contains("."))
            {
                int b=l.length()-l.indexOf(".")-1;
                if(a==b)
                {
                    d1=d1.replace(".","");
                    l=l.replace(".","");
                    n=l+".0";
                }
                else if(a>b)
                {
                    d1=d1.replace(".","");
                    l=l.replace(".","");
                    for(int i=1;i<=a-b;i++)
                    {
                        l+=0;
                    }
                    n=l+".0";
                }
                else if(b>a)
                {
                    d1=d1.replace(".","");
                    l=l.replace(".","");
                    int k=l.length()-(b-a);
                    n=l.substring(0,k)+"."+l.substring(k);
                    
                }
            }
            else
            {
                d1=d1.replace(".","");
                for(int i=1;i<=a;i++)
                {
                    l+=0;
                }
                n=l+".0";
            }
        }
        else if(d1.contains(".")&&Integer.parseInt(d1.substring(d1.indexOf(".")+1))==0)
        {
            d1=d1.substring(0,d1.indexOf("."));n=l;
            if(!l.contains("."))
            {
                n=n+".0";
            }
        }
        else
        {
            n=l;
            if(!l.contains("."))
            {
                n=n+".0";
            }
        }
        long d=Long.parseLong(d1);
        System.out.println("\nDividend/Divisor=");
        if(d==0)
        {
            System.out.println("Infinity, and Beyond!!");return;
        }
        long g=0;boolean dp=false;boolean ad=false;
        
        for(int i=0;;i++)
        {
            if(i<n.length())
            {
                if(n.charAt(i)=='.')
                {
                    if(dp==false)
                    {
                        dp=true;
                        if(!ad)
                        {
                            System.out.print(0);
                        }
                        System.out.print(".");
                    }
                    continue;
                }
                g=g*10+n.charAt(i)-48;
                if(g<d)
                {
                    if(ad||dp)
                        System.out.print(0);
                    continue;
                }
                else
                {
                    ad=true;
                    int j; 
                    for(j=1;d*j<=g;j++)
                    {
                    }
                    g-=d* --j;
                    System.out.print(j);
                }
            }
            else
            {
                g=g*10;
                if(g==0)
                {
                    return;
                }
                if(g<d)
                {
                    if(ad||dp)
                        System.out.print(0);
                    continue;
                }
                else
                {
                    ad=true;
                    int j; 
                    for(j=1;d*j<=g;j++)
                    {
                    }
                    g-=d* --j;
                    System.out.print(j);
                    if(g==0)
                    {
                        return;
                    }
                }
            }
        }
    }
}