import java.io.*;
import java.util.*;
class tic_tac_toe
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    String tbspc()
    {
        return "                              ";
    }
    String tbspc(int a)
    {
        return "                             ";
    }
    String tbspc(char a)
    {
        return "                         ";
    }
    String uline()
    {
        return "____________";
    }
    char array[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
    int turnsup=0;
    int x_or_o=-1;
    int nxtmvgmchk(char a,char[] r)
    {
        if(wincheck(a,r))
        {
            return 9;
        }
        char[] t=new char[9];
        for(int i=0;i<=8;i++)
        {
            if(r[i]==' ')
            {
                t=r.clone();
                t[i]=a;
                if(wincheck(a,t))
                {
                    return i;
                }
            }
        }
        return -1;
    }
    int smove()
    {
        if(array[4]==' ')
        {
            return 4;
        }
        else
        {
            Random random=new Random();
            int s=random.nextInt(4);
            switch(s)
            {
                case 1:
                    s=2;
                    break;
                case 2:
                    s=6;
                    break;
                case 3:
                    s=8;
                    break;
            }
            return s;
        }
    }
    void compalg(char a)
    {
        int u=-1;
        char b;
        if(a=='x')
        {
            b='o';
        }
        else
        {
            b='x';
        }
        if(turnsup==0)
        {
            array[fmove()]='x';
        }
        else if(turnsup==1)
        {
            array[smove()]='o';
        }
        else if(turnsup==8)
        {
            for(int i=0;i<=8;i++)
            {
                if(array[i]==' ')
                {
                    array[i]=a;
                }
            }
        }
        else
        {
            int nxtmvgm=nxtmvgmchk(a,array);
            int blocker=nxtmvgmchk(b,array);
            int dcc=doublecrosschk(a,array,b);
            int dcsw=dbcrssrwn(a,b);
            int[] dcdc=dbcrsdbchk(a,array,b);
            int[] ttw=trytowin2(a,b);
            if(nxtmvgm!=-1&&nxtmvgm!=9)
            {
                array[nxtmvgm]=a;
            }
            else if(blocker!=-1&&blocker!=9)
            {
                array[blocker]=a;
            }
            else if(dcc!=-1)
            {
                array[dcc]=a;
            }
            else if(dcsw!=-1)
            {
                array[dcsw]=a;
            }
            else if(dcdc[0]!=-1)
            {
                int k=0;
                int[] trytowin1=trytowin(a).clone();
                for(int i=0;trytowin1[i]!=-1&&i<9;i++)
                {
                    for(int j=0;dcdc[j]!=-1&&j<9;j++)
                    {
                        if(trytowin1[i]==dcdc[j])
                        {
                            k=1;
                            break;
                        }
                    }
                    if(k==0)
                    {
                        array[trytowin1[i]]=a;
                        break;
                    }
                    k=0;
                }
            }
            else if(ttw[0]!=-1)
            {
                array[ttw[0]]=a;
            }
            else
            {
                array[placeanywhere()[0]]=a;
            }
        }
        turnsup=ptu(array);
    }
    
    int[] placeanywhere()
    {
        int[] hel={-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int j=0;
        for(int i=0;i<=8;i++)
        {
            if(array[i]==' ')
            {
                hel[j]=i;
                j++;
            }
        }
        return hel;
    }
    
    boolean doublecross(char a,char[] twin,char b)
    {
        int blocker=nxtmvgmchk(b,twin);
        int nxtmvgm0=nxtmvgmchk(a,twin);
        if(blocker!=-1&&blocker!=9&&nxtmvgm0==-1)
        {
            twin[blocker]=a;
            int nxtmvgm=nxtmvgmchk(b,twin);
            if(nxtmvgm!=-1&&nxtmvgm!=9)
            {
                return true;
            }
        }
        return false;
    }
    int doublecrosschk(char a,char[] twin,char b)
    {
        for(int i=0;i<=8;i++)
        {
            if(twin[i]==' ')
            {
                char[] twin2=twin.clone();
                twin2[i]=a;
                if(doublecross(b,twin2,a))
                {
                    return i;
                }
            }
        }
        return -1;
    }
    int[] dbcrsdbchk(char a,char[] twin,char b)
    {
        int[] dcdc={-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int j=0;
        for(int i=0;i<=8;i++)
        {
            if(twin[i]==' ')
            {
                char[] twin2=twin.clone();
                twin2[i]=a;
                if(doublecrosschk(b,twin2,a)!=-1)
                {
                    dcdc[j]=i;j++;
                }
            }
        }
        return dcdc;
    }
    int dbcrssrwn(char a,char b)
    {
        for(int i=0;i<=8;i++)
        {
            if(array[i]==' ')
            {
                char[] arra=array.clone();
                arra[i]=a;
                int k=0,w=0;
                int nxtmvgm=nxtmvgmchk(a,arra);
                if(nxtmvgm==-1)
                {
                    for(int j=0;j<=8;j++)
                    {
                        if(arra[j]==' ')
                        {
                            w++;
                            char[] arra2=arra.clone();
                            arra2[j]=b;
                            if(doublecrosschk(a,arra2,b)!=-1)
                            {
                                k++;
                            }
                        }
                    }
                }
                else if(nxtmvgm!=9)
                {
                    arra[nxtmvgm]=b;
                    if(doublecrosschk(a,arra,b)==-1)
                    {
                        k++;
                    }
                }
                if(k==w)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    int[] trytowin(char a)
    {
        char[] arrcopy=array.clone();
        int[] sayans={-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int j=0;
        for(int i=0;i<=8;i++)
        {
            if(arrcopy[i]==' ')
            {
                char[] acc=arrcopy.clone();
                acc[i]=a;
                int nxtmvgm=nxtmvgmchk(a,acc);
                if(nxtmvgm!=-1)
                {
                    sayans[j]=i;
                    j++;
                }
            }
        }
        return sayans;
    }
    int[] trytowin(char a,char[] p)
    {
        char[] arrcopy=p.clone();
        int[] sayans={-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int j=0;
        for(int i=0;i<=8;i++)
        {
            if(arrcopy[i]==' ')
            {
                char[] acc=arrcopy.clone();
                acc[i]=a;
                int nxtmvgm=nxtmvgmchk(a,acc);
                if(nxtmvgm!=-1)
                {
                    sayans[j]=i;
                    j++;
                }
            }
        }
        return sayans;
    }
    int[] trytowin2(char a,char b)
    {
        char[] arrcopy=array.clone();
        int[] sayans={-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int j=0;
        for(int i=0;i<=8;i++)
        {
            if(arrcopy[i]==' ')
            {
                char[] acc=arrcopy.clone();
                acc[i]=a;
                int nxtmvgm=nxtmvgmchk(a,acc);
                if(nxtmvgm==-1||acc[4]==' ')
                {
                    int[] hm=trytowin(b,acc);
                    for(int k=0;hm[k]!=-1&&k<=8;k++)
                    {
                        acc[hm[k]]=b;
                        if(doublecrosschk(b,acc,a)!=-1)
                        {
                            sayans[j]=i;
                            j++;
                            break;
                        }
                    }
                        
                }
            }
        }
        if(sayans[0]!=-1)
        {
            return sayans;
        }
        return trytowin(a);
    }
    
    int ptu(char[] twin)
    {
        int j=9;
        for(int i=0;i<=8;i++)
        {
            if(twin[i]==' ')
            {
                j--;
            }
        }
        return j;
    }
    
    
    void uwin1()
    {
        if(wincheck('x'))
        {
            System.out.print("\f");
            grid(array);
            System.out.print(tbspc(0)+"  YOU WIN !");
            end();
        }
    }
    void uwin2()
    {
        if(wincheck('o'))
        {
            System.out.print("\f");
            grid(array);
            System.out.print(tbspc(0)+"  YOU WIN !");
            end();
        }
    }
    void ulose1()
    {
        if(wincheck('o'))
        {
            System.out.print("\f");
            grid(array);
            System.out.print(tbspc(0)+" YOU LOSE !");
            end();
        }
    }
    void ulose2()
    {
        if(wincheck('x'))
        {
            System.out.print("\f");
            grid(array);
            System.out.print(tbspc(0)+" YOU LOSE !");
            end();
        }
    }
    boolean wincheck(char a)
    {
        if((array[0]==a&&array[1]==a&&array[2]==a)||(array[3]==a&&array[4]==a&&array[5]==a)||(array[6]==a&&array[7]==a&&array[8]==a))
        {
            return true;
        }
        else if((array[0]==a&&array[3]==a&&array[6]==a)||(array[1]==a&&array[4]==a&&array[7]==a)||(array[2]==a&&array[5]==a&&array[8]==a))
        {
            return true;
        }
        else if((array[0]==a&&array[4]==a&&array[8]==a)||(array[2]==a&&array[4]==a&&array[6]==a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean wincheck(char a,char[] r)
    {
        if((r[0]==a&&r[1]==a&&r[2]==a)||(r[3]==a&&r[4]==a&&r[5]==a)||(r[6]==a&&r[7]==a&&r[8]==a))
        {
            return true;
        }
        else if((r[0]==a&&r[3]==a&&r[6]==a)||(r[1]==a&&r[4]==a&&r[7]==a)||(r[2]==a&&r[5]==a&&r[8]==a))
        {
            return true;
        }
        else if((r[0]==a&&r[4]==a&&r[8]==a)||(r[2]==a&&r[4]==a&&r[6]==a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int fmove()
    {
        Random random=new Random();
        return ((random.nextInt(5)+1)*2)-1-1;
    }
    void grid(char ar[])
    {
        System.out.println("\n\n"+tbspc()+ar[0]+" | "+ar[1]+" | "+ar[2]);
        System.out.println(tbspc(0)+uline());
        System.out.println(tbspc()+ar[3]+" | "+ar[4]+" | "+ar[5]);
        System.out.println(tbspc(0)+uline());
        System.out.println(tbspc()+ar[6]+" | "+ar[7]+" | "+ar[8]+"\n\n");
    }
    void rules() throws IOException
    {
        char ar[]={'1','2','3','4','5','6','7','8','9'};
        System.out.println(tbspc(' ')+"WELCOME TO TIC TAC TOE\n\n");
        System.out.println("Enter the number corresponding to a telephone keypad to \nenter a cross or circle in that block:");
        grid(ar);
        System.out.print("Press c to continue and q to quit:");
        String string=in.readLine();
        if(string.charAt(0)=='c')
        {
            choice();
        }
        else if(string.charAt(0)=='q')
        {
            end();
        }
    }
    void choice() throws IOException
    {
        System.out.println("\fDo you want to move first?");
        String string=in.readLine();
        if(string.contains("no"))
        {
            x_or_o=2;
            game2();
        }
        else
        {
            x_or_o=1;
            System.out.print("\f");
            game1();
        }
    }
    void game1() throws IOException
    {
        System.out.print("\f");
        grid(array);
        ulose1();
        System.out.print("Enter your move:");
        int move=Integer.parseInt(in.readLine());
        if(move>0&&move<=9&&array[move-1]==' ')
        {
            array[move-1]='x';
            turnsup=ptu(array);
            uwin1();
            if(turnsup<9)
            {
                System.out.print("\f");
                compalg('o');
                game1();
            }
            else
            {
                System.out.print("\f");
                grid(array);
                System.out.print(tbspc(0)+"IT'S  A  TIE");
                end();
            }
        }
        else
        {
            game1();
        }
    }
    int hua=0;
    void game2() throws IOException
    {
        System.out.print("\f");
        if(hua==0)
        {
            compalg('x');
        }
        hua=0;
        ulose2();
        if(turnsup==9)
        {
            System.out.print("\f");
            grid(array);
            System.out.print(tbspc(0)+"IT'S  A  TIE");
            end();
        }
        grid(array);
        System.out.print("Enter your move:");
        int move=Integer.parseInt(in.readLine());
        if(move>0&&move<=9&&array[move-1]==' ')
        {
            array[move-1]='o';
            turnsup=ptu(array);
            if(turnsup<9)
            {
                uwin2();
                game2();
            }
        }
        else
        {
            hua=1;
            game2();
        }
    }
    void end()
    {
         char array1[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
         array=array1.clone();
         x_or_o=-1;
         System.exit(0);
    }
    static void main() throws IOException
    {
        tic_tac_toe obj=new tic_tac_toe();
        obj.rules();
    }
}