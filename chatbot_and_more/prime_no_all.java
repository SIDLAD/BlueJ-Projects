import java.io.*;
class prime_no_all
{
    public static void main() throws IOException
    {
        int nos;
        long n=3;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        print.ln("Enter the no. of prime nos:");
        nos=Integer.parseInt(in.readLine());
        print.ln("2-1");
        for(int i=1;i<=nos-1;n+=2)
        {
            int m=0;
            long cal=(long)Math.sqrt(n);
            for(long j=3;j<=cal;j+=2)
            {
                if(n%j==0)
                    m=m+1;
                if(m==2)
                    j=n;
            }
            if(m==0)
            {
                i++;
                print.ln(n+"-"+i);
            }
        }
    }
}
