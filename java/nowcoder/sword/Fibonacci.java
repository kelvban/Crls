class Fibonacci{
    public int Fibonacci(int n) {
        if(n<0)
        return n;
        if(n==0)
        return 0;
        if(n==1)
        return 1;

        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.Fibonacci(38));
    }
}