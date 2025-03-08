package ex_9thfeb_tasks;

public class SecondSmallestINumInArray {

    public static void main(String[] args) {

        int[] numbers = {13, 6, 56, 1, 34, 67, 89};

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
//        System.out.println(smallest);
//        System.out.println(second_smallest);
        for(int num : numbers)
        {
            if (num<smallest )
            {
                second_smallest = smallest;   // update old smallest to second_smallest
                smallest = num;
            } else if (num>smallest && num < second_smallest)
            {
                second_smallest = num;
            }
        }

        if (second_smallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second smallest number: " + second_smallest);
        }

        }
    }

