import java.io.*;
class prime
{
public static long no(long nos) throws IOException
{
long n=3;
if(nos==1)
return (n-1);
else
{
       for(int i=1;i<=nos-1;n+=2)
       {
           int m=0;
           long cal=n/2;
           for(long j=1;j<=cal;j++)
           {
               if(n%j==0)
               m+=1;
               if(m==2)
               j=n;
           }
           if(m==1)
           i++;
         }
       return (n-2);
}
}
}

