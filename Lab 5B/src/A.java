public class A
{
    public void a(int c,int b)
    {
        if (b == 0) return;

        a(c,b/2);

        for(int i = 0; i < c; i++)
            System.out.print(" ");

        for(int i = 0; i < b; i++)
            System.out.print("*");

        System.out.print("\n");

        a(c+b/2,b/2);

    }
}
