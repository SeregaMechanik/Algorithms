public class Task1 {

    public static int findTrue (boolean[] example)
    {
        if (example != null && example.length > 0)
        {
            int low = 0;
            int high = example.length - 1;
            while (low <= high)
            {
                int mid = (low + high) / 2;
                if (example[mid] && mid > 0)
                {
                    if (example[mid-1])
                    {
                        high = mid - 1;
                    }
                    else {
                        return mid;
                    }
                } else if (example[mid] && mid == 0)
                {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int findTrue2 (boolean[] example)
    {
        if (example != null && example.length > 0)
        {
            int low = 0;
            int high = example.length - 1;
            while (low <= high)
            {
                int mid = (low + high) / 2;
                if (!example[mid])
                {
                    low = mid + 1;
                }
                else if (low == mid)
                {
                    return mid;
                }
                else
                {
                    high = mid;
                }
            }
        }
        return -1;
    }
}
