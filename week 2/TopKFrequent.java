import java.util.*;

class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        int[] result = new int[k];

        for (int i = 0; i < k; i++)
            result[i] = pq.poll();

        return result;
    }

    public static void main(String[] args) {

        TopKFrequent t = new TopKFrequent();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(t.topKFrequent(nums, k)));
    }
}