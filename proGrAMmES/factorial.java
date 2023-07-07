class factorial
{
    static int calc(int j)
    {
        int k=1;
        for(int i=1;i<=j;i++)
        {
            k=i*k;
        }
        return k;
    }
    static int sum(int j)
    {
        int k=0;
        for(int i=1;i<=j;i++)
        {
            k=k+calc(i);
        }
        return k;
    }
}