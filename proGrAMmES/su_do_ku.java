import java.io.*;
class su_do_ku
{
    static int[][] arm=new int[9][9];
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static void grid()
    {
        System.out.print("------------- ------------- -------------\n|");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(j%3==0&&j>0)
                    System.out.print(" |");
                System.out.print(" "+disp(arm[i][j])+" ");
                System.out.print("|");
            }
            System.out.print("\n------------- ------------- -------------\n");
            if(i%3==2&&i>0&&i!=8)
                System.out.print("------------- ------------- -------------\n");
            if(i!=8)System.out.print("|");
        }
    }

    static String disp(int a)
    {
        if(a==0)
        {
            return " ";
        }
        return a+"";
    }

    static boolean isLT9Integer(String x)
    {
        try
        {
            int y=Integer.parseInt(x);
            if(y<10&&y>0)
                return true;
            return false;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    static void inp() throws IOException
    {
        outer:
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print("\f");
                grid();
                System.out.println("Enter data in row number "+(i+1)+" column number "+(j+1));
                String x=in.readLine();
                if(x.equals("")){}
                else if(x.equals("skip"))
                {
                    break outer;
                }
                else if(isLT9Integer(x))
                {
                    arm[i][j]=Integer.parseInt(x);
                }
                else
                {
                    while(1==1)
                    {
                        System.out.println("Re-enter data in row number "+(i+1)+" column number "+(j+1));
                        x=in.readLine();
                        if(x.equals("")){break;}
                        else if(isLT9Integer(x))
                        {
                            arm[i][j]=Integer.parseInt(x);break;
                        }
                    }
                }
            }
        }
        if(!validitychk())
        {
            System.out.println("Unsolvable su_do_ku");
            System.exit(0);
        }
    }

    static boolean validitychk()
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(arm[i][j]!=0&&!(vdc2(i,j)))
                    return false;
            }
        }
        return true;
    }

    static boolean vdc2(int r,int c)
    {
        int vchk=arm[r][c];
        for(int i=0;i<9;i++)
        {
            if(i!=r&&i!=c)
            {
                if(vchk==arm[r][i]||vchk==arm[i][c])
                {
                    return false;
                }
            }
        }
        int r1=0,c1=0;
        if(r/3==0)
            r1=0;
        else if(r/3==1)
            r1=3;
        else if(r/3==2)
            r1=6;
        for(int i=0;i<3;i++,r1++)
        {
            if(r1==r)
                continue;
            if(c/3==0)
                c1=0;
            else if(c/3==1)
                c1=3;
            else if(c/3==2)
                c1=6;
            for(int j=0;j<3;j++,c1++)
            {
                if(c1==c)
                    continue;
                if(r!=r1&&c!=c1)
                {
                    if(vchk==arm[r1][c1])
                        return false;
                }
            }
        }
        return true;
    }

    
    

    static boolean endgame()
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(arm[i][j]==0)
                    return false;
            }
        }
        return true;
    }

    static void ender()
    {
        System.out.print("\f");
        grid();
        if(!endgame())
        {
            System.out.println("More than one solution");
        }
        System.exit(0);
    }

    public static void main() throws IOException
    {
        inp();
    }
}