public class Main {
    public static void main(String[] args)
    {
        boolean[] example = {false, false, false, false, false, false, false, true, true, true};
        boolean[] example2 = {false, false, false};
        System.out.println(findTrue(example2));
    }

    public static int findTrue (boolean[] example)
    {
        if (example != null && example.length > 0)
        {
            int low = 0;
            int high = example.length - 1;
            while (low <= high)
            {
                int mid = (low + high) / 2;
                if (example[mid])
                {
                    if (example[mid-1])
                    {
                        high = mid - 1;
                    }
                    else {
                        return mid;
                    }
                }
                else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}