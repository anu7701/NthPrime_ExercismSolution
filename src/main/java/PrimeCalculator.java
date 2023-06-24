class PrimeCalculator {

    int nth(int nth) {
        if(nth==0)
        {
            throw new IllegalArgumentException();
        }
        int count=0;
        int num=2;
        while(count<nth)
        {
            if(isPrime(num))
            {
                count++;
            }
            num++;
        }
        return num-1;
    }
    public Boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
