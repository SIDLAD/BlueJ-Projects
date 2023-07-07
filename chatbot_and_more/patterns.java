import java.io.*;
class patterns
{
    public static void main() throws IOException
    {
        for(int i=5;i>0;i--)
        {
            for(int j=1;j<=5;j++)
            {
                if(j<=i)
                print._(j);
                else
                print._(" ");
            }
            for(int k=5;k>0;k--)
            {
                if(k<=i)
                print._(k);
                else
                print._(" ");
            }
            print.ln();
        }
    }
}


