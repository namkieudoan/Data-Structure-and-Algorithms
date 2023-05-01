public class hello {
    public static void main(String a[]) 
    {
        int sum = sum(5);
        System.out.print(sum);
    
    }

    public static int sum(int n)
    {
        if(n>0)
            return n = n + sum(n -1);
        return 0; 
    }
}