import java.io.*;
class first_letter_raise
{
    public static void main() throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence:");
        String input=in.readLine().toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            if(i==0||input.charAt(i-1)==' ')
            {
                input=input.substring(0,i)+input.substring(i,i+1).toUpperCase()+input.substring(i+1);
            }
        }
        System.out.println(input);
    }
}
