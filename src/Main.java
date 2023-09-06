public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        int value = 2;
        System.out.println(contains(array, value));
    }
    static boolean contains (int [] array, int value)
    {
        boolean contains = false;
        for (int i = 0; i <= array.length-1; i++)
        {
            if (array [i] == value)

                contains = true;

        }
        return contains;
    }
}