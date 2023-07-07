import java.io.*;
class pascal_triangle
{
    static void main() throws IOException
    {
        System.out.println("Enter the number of lines:");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int ln=Integer.parseInt(in.readLine());
        long ar[]=new long[(ln+1)/2 + 1];
        ar[1]=1;
        System.out.print("\f");
        for(int i=1;i<=ln;i++)
        {
            for(int j=1;j<=ln+1-i;j++)
            {
                System.out.print("          ");
            }
            for(int j=1;j<=(i+1)/2;j++)
            {
                System.out.print(ar[j]);
                long n=ar[j];int a=0;
                while(n>0)
                {
                    a++;
                    n=n/10;
                }
                for(int b=1;b<=20-a;b++)
                {
                    System.out.print(" ");
                }
            }
            if(i%2==1)
            {
                for(int j=(i-1)/2;j>0;j--)
                {
                    System.out.print(ar[j]);
                    long n=ar[j];int a=0;
                    while(n>0)
                    {
                        a++;
                        n=n/10;
                    }
                    for(int b=1;b<=20-a;b++)
                    {
                        System.out.print(" ");
                    }
                }
            }
            else
            {
                for(int j=i/2;j>0;j--)
                {
                    System.out.print(ar[j]);
                    long n=ar[j];int a=0;
                    while(n>0)
                    {
                        a++;
                        n=n/10;
                    }
                    for(int b=1;b<=20-a;b++)
                    {
                        System.out.print(" ");
                    }
                }
            }
            long ar2[]=ar.clone();
            if(i!=ln)
            {
                if(i%2==1)
                {
                    for(int j=1;j<=(i+1)/2;j++)
                    {
                        ar[j]=ar2[j-1]+ar2[j];
                    }
                }
                else
                {
                    int j;
                    for(j=1;j<=(i/2);j++)
                    {
                        ar[j]=ar2[j-1]+ar2[j];
                    }
                    ar[j]=ar2[j-1]*2;
                }
            }
            System.out.println();
        }
    }
}