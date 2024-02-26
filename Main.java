import java.util.*;
public class Main {
    public static boolean Uno_a_n(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
            return true;
        return false;
    }
    public static boolean dos_a_raizN(int n)
    {
        int c=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==0 && n!=1)
            return true;
        return false;
    }
    public static void criba(boolean[] primo)
    {
        Arrays.fill(primo,true);
        primo[0]=primo[1]=false;
        int i=2;
        int n=primo.length-2;
        while(i*i<=n)
        {
            if(primo[i])
            {
                for(int j=i*i;j<=n+1;j+=i)
                {
                    primo[j]=false;
                }
            }
            i+=1;
        }
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("n=");
        int n=leer.nextInt();
        System.out.println("");
        
        System.out.println(Uno_a_n(n)+"\t 1-"+n);
        System.out.println(dos_a_raizN(n)+"\t 2-raiz de "+n);
        System.out.println("");
        
        System.out.println("--CRIBA--");
        boolean[] primo=new boolean[n+2];
        criba(primo);
        for(int c=2;c<=n;c++)
        {
            if(primo[c])
            {
                System.out.print(c+" - ");
            }
        }
        System.out.println("");
    }
    
}
