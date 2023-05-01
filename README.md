# Data-Structure-and-Algorithms
Practice with Java

Recursion - Đệ quy
---
1. Sum of numbers from 1 to n - Tính tổng dãy số từ 1 đến n
```
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
```
