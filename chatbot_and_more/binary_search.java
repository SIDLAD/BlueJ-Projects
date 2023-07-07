class binary_search
{
    public static void main(int ar[],int chk)
    {
        //bubble sort
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int tmp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tmp;
                }
            }
        }
        int l=0,u=ar.length-1,m,flag=-1;
        while(l<u)
        {
            m=(l+u)/2;
            if(chk>ar[m])
            {
                l=m+1;
            }
            else if(chk<ar[m])
            {
                u=m-1;
            }
            else
            {
                flag=m;
                break;
            }
        }
        System.out.println(flag);
    }
}