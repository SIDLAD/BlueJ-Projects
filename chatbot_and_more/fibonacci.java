import java.io.*;
class fibonacci
{
public static void main() throws IOException
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    print._("Enter the stop value:");
    double c=Double.parseDouble(in.readLine());
    print._("Enter the first start value:");
    double a=Double.parseDouble(in.readLine());
    print._("Enter the second start value:");
    double b=Double.parseDouble(in.readLine());
    if(b<=a)
    {
        a=b+a;
        b=a-b;
        a=a-b;
    }
    if(c==1)
    print._(a+"; ");
    else
    print._(a+"; "+b+"; ");
    for(int i=1;i<c-1;i++)
    {
        b=a+b;
        a=b-a;
        print._(b+"; ");
    }
}
}

