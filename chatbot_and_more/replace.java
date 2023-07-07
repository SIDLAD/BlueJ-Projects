class replace
{
    static String ap(String inp)
    {
        for(int ln=1;ln<inp.length()-1;ln++)
        { 
            if(inp.charAt(ln)=='\'')
            {
                if(ln==1)
                {
                    inp=" "+inp.substring(2,inp.length());
                    ln--;
                }
                else if(!(inp.charAt(ln-1)=='s'||inp.charAt(ln-1)=='S')&&!((inp.charAt(ln+1)>=65&&inp.charAt(ln+1)<=90)||(inp.charAt(ln+1)>=97&&inp.charAt(ln+1)<=122)))
                {
                    inp=inp.substring(0,ln)+inp.substring(ln+1,inp.length());
                    ln--;
                }
                else if(inp.charAt(ln-1)==' ')
                {
                    inp=inp.substring(0,ln)+inp.substring(ln+1,inp.length());
                    ln--;
                }
            }
        }
        return inp;
    }
}