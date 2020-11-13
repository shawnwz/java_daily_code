//find middle item for a input stream, if the size is even, return the middle left one.

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMiddleNum {

    int count = 0;
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    public void insert( Integer num ){
        if (count % 2 == 0) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        count++;
        System.out.println(FindMiddleNum.GetMedian());

    }

    public static int GetMedian(){
        return maxHeap.peek();
    }


    public static void main(String[] args) {
        FindMiddleNum t = new FindMiddleNum();
        t.insert(1);

        t.insert(2);

        t.insert(0);

        t.insert(20);

        t.insert(10);

        t.insert(22);


    }
}
