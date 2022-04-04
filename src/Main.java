public class Main {
    public static void main(String[] args) {
        System.out.println(Second(10));
    }

    public static int Second(int parameter)
    {
        int factorial = 1;
        for (int i = 1; i <= parameter; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}
