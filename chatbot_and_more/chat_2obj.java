import java.io.*;
import java.awt.Desktop;
import java.net.URI;
import java.lang.*;
import java.util.*;
class chat_2obj
{
    int rep=1,exit=0;
    String username="";
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int j=0;
    String arrq[]=new String[2000000];
    String arrans[]=new String[2000000];
    public void room() throws Exception 
    {
        exit=0;
        int ran=(int)(Math.random()*10);
        if(rep==1)
        {
            if(ran%3==0)
            {
                System.out.println("How may I help you?");
            }
            else if(ran%3==1)
            {
                System.out.println("For what task may I be of your service?");
            }
            else
            {
                System.out.println("In what way may I assist you?");
            }
        }
        else if(rep==2)
        {
            if(ran%3==0)
            {
                System.out.println("How else may I help you?");
            }
            else if(ran%3==1)
            {
                System.out.println("For what other task may I be of your service?");
            }
            else
            {
                System.out.println("In what other way may I assist you?");
            }
        }
        rep=1;
        System.out.print("\t\t\t\t\t\t\t\t");
        String inp=in.readLine();
        String ori=inp;
        if(!inp.matches("^[ A-Za-z]+$"))
        {
            inp=inp.replaceAll("[^a-zA-Z0-9/+\\-*=^<>\'\\\\]", " ");
        }
        inp=" "+inp+" ";
        inp=replace.ap(inp);
        room(inp,ori);
    }
    public void room(String inp,String ori) throws Exception
    {
        if(((inp.toLowerCase().contains(" you")&&!(inp.toLowerCase().contains(" yout"))&&!(inp.toLowerCase().contains(" youn")))||inp.toLowerCase().contains(" u ")||inp.toLowerCase().contains(" ur "))&&(inp.toLowerCase().contains(" name ")||(inp.toLowerCase().contains(" call ")&&inp.toLowerCase().contains(" your")))&&!(inp.toLowerCase().contains(" my name ")))
        {
            yname();
        }
        else if(inp.toLowerCase().matches(".*my name is .* what is [y]?[o]?urs.*"))
        {
           username=inp.substring(inp.toLowerCase().indexOf("my name is ")+10,inp.toLowerCase().indexOf("what is "));
           System.out.println("Nice to meet you"+username+"\nMy name is Awen Irving a.k.a AI");
        }
        else if(inp.toLowerCase().matches(".*my name is .* wht is [y]?[o]?urs.*"))
        {
           username=inp.substring(inp.toLowerCase().indexOf("my name is ")+10,inp.toLowerCase().indexOf("wht is "));
           System.out.println("Nice to meet you"+username+"\nMy name is Awen Irving a.k.a AI");
        }
        else if(inp.toLowerCase().matches(".*my name is .* wt is [y]?[o]?urs.*"))
        {
           username=inp.substring(inp.toLowerCase().indexOf("my name is ")+10,inp.toLowerCase().indexOf("wt is "));
           System.out.println("Nice to meet you"+username+"\nMy name is Awen Irving a.k.a AI");
        }
        else if(inp.toLowerCase().matches(".*my name is .* wat is [y]?[o]?urs.*"))
        {
           username=inp.substring(inp.toLowerCase().indexOf("my name is ")+10,inp.toLowerCase().indexOf("wat is "));
           System.out.println("Nice to meet you"+username+"\nMy name is Awen Irving a.k.a AI");
        }
        else if(inp.toLowerCase().contains(" my ")&&inp.toLowerCase().contains(" name ")&&(inp.toLowerCase().contains(" what")||inp.toLowerCase().contains(" wht")))
        {
            if(username.equals(""))
            {
                System.out.print("Even I'm as curious as you to find out.\nWhat is it?\n\t\t\t\t\t\t\t\t");
                inp=" "+in.readLine()+" ";
                mname(inp);
            }
            else
            {
                System.out.println("Your name is"+username);
                rep=2;
            }
        }
        else if(inp.toLowerCase().contains(" my ")&&inp.toLowerCase().contains(" name "))
        {
            inp=" "+inp+" ";
            mname(inp);
        }
        else if(inp.toLowerCase().contains(" me ")&&inp.toLowerCase().contains(" call "))
        {
            inp=" "+inp+" ";
            mname(inp);
        }
        else if(inp.toLowerCase().contains("tsup ")||inp.toLowerCase().contains("ssup ")||inp.toLowerCase().contains(" hi ")||inp.toLowerCase().contains(" hello ")||inp.toLowerCase().contains(" nice to meet you ")||inp.toLowerCase().contains(" nice to meet u "))
        {
            System.out.println("Hello"+username);
            if(username.equals(""))
            {
                yname();
            }
        }
        else if(inp.toLowerCase().contains(" companion")||inp.toLowerCase().contains(" friend"))
        {
            System.out.println("Then friends we are.");
            rep=0;
        }
        else if(inp.toLowerCase().contains(" poe")||inp.toLowerCase().contains(" verse"))
        {
            if(inp.toLowerCase().contains(" the road not taken "))
            poems.road();
            else if(inp.toLowerCase().contains(" i know why the caged bird sings ")||inp.toLowerCase().contains(" maya angelou "))
            poems.cage();
            else if(inp.toLowerCase().contains(" stopping by woods on a snowy evening "))
            poems.woodstop();
            else if(inp.toLowerCase().contains(" if ")||inp.toLowerCase().contains(" rudyard kipling "))
            poems.IF();
            else if(inp.toLowerCase().contains(" do not stand at my grave and weep ")||inp.toLowerCase().contains(" mary frye "))
            poems.grave();
            else if(inp.toLowerCase().contains(" hope is the thing with feathers ")||inp.toLowerCase().contains(" \'hope\' is the thing with feathers ")||inp.toLowerCase().contains(" \"hope\" is the thing with feathers ")||inp.toLowerCase().contains(" emily dickinson"))
            poems.hope();
            else if(inp.toLowerCase().contains(" robert frost "))
            poems.ranfrost();
            else
            poems.ran();
            rep=2;
        }
        else if(inp.toLowerCase().contains(" tale")||inp.toLowerCase().contains(" story ")||inp.toLowerCase().contains(" stori"))
        {
            if(inp.toLowerCase().contains("  the story of an hour ")||inp.toLowerCase().contains(" kate chopin "))
            stories.hour();
            else if(inp.toLowerCase().contains("  hearts and hands ")||inp.toLowerCase().matches(".*o[. ]?[ ]?henry.*"))
            stories.hand();
            else
            stories.ran();
            rep=2;
        }
        else if(inp.toLowerCase().contains(" date ")||inp.toLowerCase().contains(" time ")||inp.toLowerCase().contains(" day "))
        {
            calendar ddt=new calendar();
            ddt.cal(inp);
            rep=2;
        }
        else if(inp.toLowerCase().contains(" calculat")||inp.toLowerCase().contains(" add ")||inp.toLowerCase().contains(" addi")||inp.toLowerCase().contains(" subtract ")||inp.toLowerCase().contains(" subtracti")||inp.toLowerCase().contains(" multiply ")||inp.toLowerCase().contains(" multiplic")||inp.toLowerCase().contains(" divide ")||inp.toLowerCase().contains(" divisi")||inp.toLowerCase().matches(".*[+\\-*=^<>][\\d].*")||inp.toLowerCase().matches(".* than [\\d].*")||inp.toLowerCase().matches(".*[\\d] and [\\d].*"))
        {
            a_i.calc();
            rep=2;
        }
        else if(inp.toLowerCase().contains(" clr")||inp.toLowerCase().contains(" clear screen")||inp.toLowerCase().contains(" \\f ")||inp.toLowerCase().contains(" cls ")||inp.toLowerCase().matches(".* form[-]?[ ]?feed .*"))
        {
            System.out.print("\f");
        }
        else if(inp.toLowerCase().contains(" to be or not to be "))
        {
            System.out.print("Is that the question?\n\t\t\t\t\t\t\t\t");
            inp=" "+in.readLine()+" ";
            yes_no_be(inp);
        }
        else if(inp.toLowerCase().contains(" creat")&&(inp.toLowerCase().contains(" us ")||inp.toLowerCase().contains(" me ")||inp.toLowerCase().contains(" i ")||inp.toLowerCase().contains(" we ")))
        {
            System.out.println("It is said that God is the creator of all.");
            rep=0;
        }
        else if((inp.toLowerCase().contains(" creat")||inp.toLowerCase().contains(" made"))&&(inp.toLowerCase().contains(" u ")||inp.toLowerCase().contains(" you")||inp.toLowerCase().contains(" ur "))||inp.toLowerCase().matches(".* how [a]?r[e]? [y]?[o]?u so .*"))
        {
            System.out.println("All credit goes to my modest creator, Siddharth Shah!");
            rep=0;
        }
        else if(inp.toLowerCase().contains(" go ")||inp.toLowerCase().contains(" going ")||inp.toLowerCase().contains(" goes ")||inp.toLowerCase().contains(" end ")||inp.toLowerCase().contains(" bye ")||inp.toLowerCase().contains(" goodbye ")||inp.toLowerCase().contains(" quit")||inp.toLowerCase().contains(" exit")||inp.toLowerCase().contains(" leav")||((inp.toLowerCase().contains(" you ")||inp.toLowerCase().contains(" u "))&&(inp.toLowerCase().contains(" later ")||inp.toLowerCase().contains(" l8r ")||inp.toLowerCase().contains(" tomorrow ")||inp.toLowerCase().contains(" next "))))
        {
            System.out.println("Goodbye\n...................................................................................................................................................................................................");
            return;
        }
        else if(inp.toLowerCase().contains(" shut")||inp.toLowerCase().contains(" off ")||inp.toLowerCase().contains(" stop"))
        {
            System.out.println("Goodbye\n...................................................................................................................................................................................................");
            return;
        }
        else if((inp.toLowerCase().contains("ont ")||inp.toLowerCase().contains("ont ")||inp.toLowerCase().contains("n't ")||inp.toLowerCase().contains(" not "))&&inp.toLowerCase().contains(" talk")&&(inp.toLowerCase().contains(" u ")||inp.toLowerCase().contains(" you ")))
        {
            System.out.println("Goodbye\n...................................................................................................................................................................................................");
            return;
        }
        else if((inp.toLowerCase().matches(".* how [a]?r[e]? [y]?[o]?u .*")||inp.toLowerCase().contains(" ok ")||inp.toLowerCase().contains(" alright ")||inp.toLowerCase().contains(" feel")||inp.toLowerCase().contains(" fine "))&&(inp.toLowerCase().contains(" u ")||inp.toLowerCase().contains(" you "))&&(inp.toLowerCase().contains(" r ")||inp.toLowerCase().contains(" are ")))
        {
            System.out.print("I am fine.\nHow are you?\n\t\t\t\t\t\t\t\t");
            yes_no_fine(" "+in.readLine()+" ");
        }
        else if(inp.toLowerCase().matches(".* how do [y]?[o]?u  do .*")&&(inp.toLowerCase().contains(" you ")||inp.toLowerCase().contains(" u ")))
        {
            System.out.print("I am fine.\nHow are you?\n\t\t\t\t\t\t\t\t");
            yes_no_fine(" "+in.readLine()+" ");
        }
        else if(((((inp.toLowerCase().contains(" happ")||inp.toLowerCase().contains(" cheer"))&&inp.toLowerCase().contains(" make ")||((inp.toLowerCase().contains(" satisf")||inp.toLowerCase().contains(" happ")||inp.toLowerCase().contains(" glad")||inp.toLowerCase().contains(" good"))&&(inp.toLowerCase().contains(" no")||inp.toLowerCase().contains("n't")))||inp.toLowerCase().contains(" unhapp")||inp.toLowerCase().contains(" unsatisf")||inp.toLowerCase().contains(" sad")||inp.toLowerCase().contains(" depres")||(inp.toLowerCase().contains(" feel")&&inp.toLowerCase().contains(" bad")))&&(inp.toLowerCase().contains(" i ")||inp.toLowerCase().contains(" we ")||inp.toLowerCase().contains(" me ")||inp.toLowerCase().contains(" us ")))||inp.toLowerCase().contains(" cheer ")&&(inp.toLowerCase().contains(" me ")||inp.toLowerCase().contains(" us ")))||"                                                                ".contains(inp)||((inp.toLowerCase().contains(" help")||inp.toLowerCase().contains(" assis")||inp.toLowerCase().contains(" task"))&&(inp.toLowerCase().contains(" you")||inp.toLowerCase().contains(" me ")||inp.toLowerCase().contains(" us ")||inp.toLowerCase().contains(" our")||inp.toLowerCase().contains(" mine")))||(inp.toLowerCase().matches(".* can [y]?[o]?u do .*")||inp.toLowerCase().matches(".* do [y]?[o]?u do .*"))&&(inp.toLowerCase().contains(" you ")||inp.toLowerCase().contains(" u "))||inp.toLowerCase().equals(" i dont know ")||inp.toLowerCase().equals(" i don't know "))
        {
            System.out.print("I can cheer you up in the following ways:\n\n(a)Calculation purposes\n(b)Display short stories and poems\n(c)Be your companion\n\t\t\t\t\t\t\t\t");
            ori=in.readLine();
            inp=" "+ori+" ";
            if(!inp.matches("^[ A-Za-z]+$"))
            {
                inp=inp.replaceAll("[^a-zA-Z0-9/+\\-*=^<>\'\\\\]", " ");
            }
            inp=replace.ap(inp);
            if(inp.toLowerCase().contains(" a "))
            {
                a_i.calc();
                rep=2;
                room();
            }
            else if(inp.toLowerCase().contains(" b "))
            {
                System.out.print("Do you want a poem displayed, or a short story?\n\t\t\t\t\t\t\t\t");
                String p_or_s_o=in.readLine();
                String p_or_s = " "+p_or_s_o.replaceAll("[^a-zA-Z0-9/+\\-*=^<>\'\\\\]", " ")+" ";
                if(p_or_s.toLowerCase().contains(" neither ")||p_or_s.toLowerCase().contains(" none "))
                {
                    room();
                }
                else if(p_or_s.toLowerCase().contains(" either ")||p_or_s.toLowerCase().contains(" any"))
                {
                    Random r_p_s=new Random();
                    int i_p_s=r_p_s.nextInt(2);
                    switch (i_p_s)
                    {
                        case 0:
                        poems.ran();
                        break;
                
                        case 1:
                        stories.ran();
                        break;
                    }
                    rep=2;
                    room();
                }
                else if(p_or_s.toLowerCase().contains(" poe")||p_or_s.toLowerCase().contains(" verse")||p_or_s.toLowerCase().contains(" tale")||p_or_s.toLowerCase().contains(" story ")||p_or_s.toLowerCase().contains(" stori"))
                {
                    room(p_or_s,p_or_s_o);
                }
                else
                {
                    room(p_or_s,p_or_s_o);
                }
            }
            else if(inp.toLowerCase().contains(" c "))
            {
                System.out.println("Then friends we are.");
                rep=0;
                room();
            }
            else
            {
                room(inp,ori);
            }
            return;
        }
        else
        {
            int aryn=-1;
            aryn=learner.ai(arrq,inp,j);
            if(aryn==-1)
            {
                System.out.print("Would you like me to search Google for \""+ori+"\"?\n\t\t\t\t\t\t\t\t");
                String qwerty=" "+in.readLine()+" ";
                if(qwerty.toLowerCase().contains(" yes ")||qwerty.toLowerCase().contains(" yup ")||qwerty.toLowerCase().contains(" ya ")||(qwerty.toLowerCase().contains(" of course ")&&!qwerty.toLowerCase().contains(" not "))||qwerty.toLowerCase().contains(" guess "))
                {
                    Desktop search=Desktop.getDesktop();
                    ori=ori.replace("%","%25");
                    ori=ori.replace("+","%2B");
                    ori=ori.replace(" ","+");
                    ori=ori.replace("\\","%5C");
                    ori=ori.replace("/","%2F");
                    ori=ori.replace("!","%21");
                    ori=ori.replace("@","%40");
                    ori=ori.replace("#","%23");
                    ori=ori.replace("&","%26");
                    ori=ori.replace(":","%3A");
                    ori=ori.replace("'","%27");
                    search.browse(new URI("https://www.google.co.in/search?q="+ori));
                }
                else
                {
                    System.out.print("I do not know how to respond to \""+ori+"\".\nWhat would you expect as a reply to your statement?\n\t\t\t\t\t\t\t\t");
                    arrq[j]=inp;
                    String checkerer=in.readLine();
                    while("                                               ".contains(checkerer))
                    {
                        System.out.print("Pardon me?\n\t\t\t\t\t\t\t\t");
                        checkerer=in.readLine();
                    }
                    String checker=" "+checkerer+" ";
                    checker=checker.replaceAll("[^a-zA-Z0-9/+\\-*=^<>\'\\\\]", " ");
                    checker=replace.ap(checker);
                    if(((checker.toLowerCase().contains(" not ")||checker.toLowerCase().contains("ont ")||checker.toLowerCase().contains("n't "))&&checker.toLowerCase().contains(" know "))||checker.toLowerCase().contains(" dunno "))
                    {
                        System.out.println("Neither do I, so I guess it's alright."); 
                    }
                    else
                    {
                        arrans[j]=checkerer;
                        arrans[j]=arrans[j].replaceAll("[^a-zA-Z0-9/+\\-*=^<>\'\\\\]", " ");
                        arrans[j]=replace.ap(arrans[j]);
                        while(!((arrans[j].charAt(0)>=97&&arrans[j].charAt(0)<=122)||(arrans[j].charAt(0)>=65&&arrans[j].charAt(0)<=90)))
                        {
                            arrans[j]=arrans[j].substring(1,arrans[j].length());
                        }
                        if(arrans[j].charAt(0)>=97&&arrans[j].charAt(0)<=122)
                        {
                            arrans[j]=(char)(arrans[j].charAt(0)-32)+arrans[j].substring(1,arrans[j].length());
                        }
                        j++;
                        System.out.println("Thank you.");
                    }   
                }
            }
            else
            {
                System.out.println(arrans[aryn]);
            }
            rep=2;
        }
        if(exit==0)
        {
            room();
        }
    }
    public void yname() throws Exception
    {
        System.out.println("My name is Awen Irving a.k.a. AI.");
        if(username.equals(""))
        {
            System.out.print("What is yours?\n\t\t\t\t\t\t\t\t");
            String inp=" "+in.readLine()+" ";
            mname(inp);
        }
    }
    public void mname(String inp) throws Exception
    {
        if(!inp.matches("^[ A-Za-z]+$"))
        {
            inp=inp.replaceAll("[^a-zA-Z0-9/+\\-*=^<>\']", " ");
        }
        inp=replace.ap(inp);
        if(inp.toLowerCase().contains(" what ")||inp.toLowerCase().contains(" wht "))
        {
            room(inp,"");
        }
        else if(inp.toLowerCase().contains(" my name is "))
        {
            username=inp.substring(inp.indexOf("my name is ")+10,inp.length());
        }
        else if(inp.toLowerCase().contains(" is my name"))
        {
            username=inp.substring(0,(inp.indexOf(" is ")));
        }
        else if(inp.toLowerCase().contains(" i am "))
        {
            username=inp.substring(inp.indexOf(" i am ")+5,inp.length());
        }
        else if(inp.toLowerCase().contains(" not ")||inp.toLowerCase().contains("ont ")||inp.toLowerCase().contains("n't "))
        {
            System.out.println("It seems as if you wish to keep your identity incognito.");
            return;
        }
        else if(inp.toLowerCase().contains(" me ")&&inp.toLowerCase().contains(" call "))
        {
            username=inp.substring(inp.indexOf(" me ")+3);
            System.out.println("Ok,"+username);return;
        }
        else if(inp.toLowerCase().contains(" go ")||inp.toLowerCase().contains(" going ")||inp.toLowerCase().contains(" goes ")||inp.toLowerCase().contains(" end ")||inp.toLowerCase().contains(" bye ")||inp.toLowerCase().contains(" goodbye ")||inp.toLowerCase().contains(" quit")||inp.toLowerCase().contains(" exit")||inp.toLowerCase().contains(" leav")||((inp.toLowerCase().contains(" you ")||inp.toLowerCase().contains(" u "))&&(inp.toLowerCase().contains(" later ")||inp.toLowerCase().contains(" l8r ")||inp.toLowerCase().contains(" tomorrow ")||inp.toLowerCase().contains(" next "))))
        {
            System.out.println("Goodbye\n...................................................................................................................................................................................................");
            exit=1;return;
        }
        else if(inp.toLowerCase().contains(" shut")||inp.toLowerCase().contains(" off "))
        {
            System.out.println("Goodbye\n...................................................................................................................................................................................................");
            exit=1;return;
        }
        else if((inp.toLowerCase().contains("ont ")||inp.toLowerCase().contains("n't ")||inp.toLowerCase().contains(" not "))&&inp.toLowerCase().contains(" talk"))
        {
            System.out.println("Goodbye\n...................................................................................................................................................................................................");
            exit=1;return;
        }
        else if(inp.matches("^[ A-Za-z\']+$")&&!(inp.toLowerCase().contains(" my ")||inp.toLowerCase().contains(" name ")))
        {
            username=inp;
        }
        else
        {
            System.out.print("Pardon me?\n\t\t\t\t\t\t\t\t");
            inp=" "+in.readLine()+" ";
            mname(inp);
            return;
        }
        System.out.println("Nice to meet you,"+username);
    }
    public void yes_no_be(String inp) throws Exception
    {
        if(inp.toLowerCase().contains(" yes ")||inp.toLowerCase().contains(" yup ")||inp.toLowerCase().contains(" ya ")||(inp.toLowerCase().contains(" of course ")&&!inp.toLowerCase().contains(" not "))||inp.toLowerCase().contains(" guess "))
        {
            System.out.println("I'm afraid I cannot help you in this matter.");
            System.out.print("However, ");
            room("","");return;
        }
        else
        {
            rep=2;
        }
    }
    public void yes_no_fine(String inp) throws Exception
    {
        if(inp.toLowerCase().contains(" no")||inp.toLowerCase().contains(" bad ")||inp.toLowerCase().contains("ont ")||inp.toLowerCase().contains("n't ")||inp.toLowerCase().contains(" horrible "))
        {
            System.out.println("I'm afraid I cannot help you in this matter.");
            System.out.print("However, ");
            room("","");return;
        }
    }
    public void exit()
    {
        System.out.print("Good Bye.");
        exit=1;rep=1;username="";
    }
    public void main() throws Exception
    {
        room();exit=0;rep=1;username="";
    }
}