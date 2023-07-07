import java.io.*;
import java.lang.*;
class a_i
{
    public static void calc() throws IOException
    {
        try
        {
        int p=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            print.ln("\f\t\t\t\t\t\tCalculator\n*********************************************************************************************************************************************************************************************************************************\nHello, how may I help you?\nFor performing functions on 1 number,press 1\nFor performing functions on 2 numbers,press 2\nFor performing functions on 3 numbers,press 3");
            int a=Integer.parseInt(in.readLine());
            do
            {
            if(a==1)
            {
                 print.ln("\nFor calculating:\nthe square of a number,press 1\nthe cube of a number,press 2\nthe square root of a number,press 3\nthe cube root of a number,press 4\nthe n th prime number,press 5\nthe sine of x radians,press 6\nthe cosine of x radians,press 7\nthe tangent of x radians,press 8\nthe angle whose sine is y,press 9\nthe angle whose cosine is y,press 10\nthe angle whose tangent is y,press 11\nthe natural logarithm of x,press 12\nTo go back to the menu, press 0");
                 a=Integer.parseInt(in.readLine());
                 if(a==0)
                   {
                       print._("\f");
                       break;
                   }
                 else if(a==1)
                 {
                    print.ln("\nEnter the number:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(ans*ans)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                 }
                 else if(a==2)
                 {
                    print.ln("\nEnter the number:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(ans*ans*ans));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                 }
                 else if(a==3)
                 {
                    print.ln("\nEnter the number:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln("\nThe answer is "+(Math.sqrt(ans)));
                    print.ln2("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                 }
                 else if(a==4)
                 {
                    print.ln("\nEnter the number:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.cbrt(ans)));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                 else if(a==5)
                {
                    print.ln("\nEnter the value of n:");
                    long ans=Long.parseLong(in.readLine());
                    print.ln2("\nThe answer is "+(prime.no(ans)));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==6)
                {
                    print.ln("\nEnter the value of x:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.sin(ans)));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==7)
                {
                    print.ln("\nEnter the value of x:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.cos(ans)));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==8)
                {
                    print.ln("\nEnter the value of x:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.tan(ans)));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==9)
                {
                    print.ln("\nEnter the value of y:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.asin(ans))+" radians");
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==10)
                {
                    print.ln("\nEnter the value of y:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.acos(ans))+" radians");
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==11)
                {
                    print.ln("\nEnter the value of y:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.atan(ans))+" radians");
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==12)
                {
                    print.ln("\nEnter the value of x:");
                    double ans=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.log(ans)));
                    print.ln("To go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                a=1;
            }
            else if(a==2)
            {
                print.ln2("\nFor calculating:\na + b,press 1\na - b,press 2\na x b,press 3\na / b,press 4\na raised to the power of b,press 5\nthe b th root of a,press 6\nfor going back to the menu, press 0");
                a=Integer.parseInt(in.readLine());
                if(a==0)
                   {
                       print._("\f");
                       break;
                   }
                else if(a==1)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(m+n)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==2)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(m-n)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==3)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(m*n)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==4)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(m/n)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==5)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.pow(m,n))+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==6)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.pow(m,(1/n)))+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                a=2;
            }
            else if(a==3)
            {
                print.ln2("\nFor calculating:\na + b + c,press 1\na x b x c,press 2\na raised to the power of b/c ,press 3\nfor going back to the menu, press 0");
                a=Integer.parseInt(in.readLine());
                if(a==0)
                   {
                       print._("\f");
                       break;
                   }
                else if(a==1)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of c:");
                    double o=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(m+n+o)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==2)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of c:");
                    double o=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(m*n*o)+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
                else if(a==3)
                {
                    print.ln("\nEnter the value of a:");
                    double m=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of b:");
                    double n=Double.parseDouble(in.readLine());
                    print.ln("Enter the value of c:");
                    double o=Double.parseDouble(in.readLine());
                    print.ln2("\nThe answer is "+(Math.pow(m,(n/o)))+"\nTo go back to the menu,press 0\nTo exit,press 1");
                    a=Integer.parseInt(in.readLine());
                    if(a==0)
                    {
                     print._("\f");
                     break;
                    }
                    else if(a==1)
                    {
                        print.ln("\nThank you");
                        p=1;
                    }
                }
            }
            }while(0==1);
        }while(p==0);
        print.ln("*********************************************************************************************************************************************************************************************************************************");
        }
        catch(Exception e)
        {
            calc();
        }
    }
}