/*
Divide the decimal number by n,Treat the division as the integer division
Write the the remainder (in  n-base notation)
Divide the quotient again by n, Treat the division as integer division
Repeat step 2 and 3 until the quotient is 0
The n-base value is the sequence of the remainders from first to last
Assumption:
1 < n < = 36

Example:

Input
n: 12
num: 718

Output
AB4

Explanation
num       Divisor       quotient       remainder
718           12               59                 10(A)
59             12                4                   11(B)
4               12                0                   4(4)

Sample Input
n: 21
num: 5678

Sample Output
8IC

 */

//Solution:
public class Problem3 {
    int num = 718,n=12,rem,q;

    public static void main(String[] args) {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Problem3 ob = new Problem3();

        while(true) {
            int res = DectoNBase(ob.n,ob.num);
            System.out.print(arr[res]);
            ob.num = ob.num/ob.n;
            if(ob.num == 0) break;
        }
    }
    static int DectoNBase(int n,int num)
    {
        int rem,q;
        rem = num%n;
        q = num/n;
        return rem;
    }
}
