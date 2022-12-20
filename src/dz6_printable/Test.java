package dz6_printable;

public class Test {
    private static Printable[] printables = new Printable[]
            {
                    new Shop(),
                    new Book(),
                    new Shop(),
                    new Book(),
                    new Shop(),
                    new Book()
            };
    public static void main(String[] args)
    {
        for(Printable printable:printables)
        {
            printable.print();
        }
    }
}
