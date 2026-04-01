class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);

        int index = 0;

        while (k > 0) {

            int max = 0;
            int element = list.get(0);

            for (int i = 0; i < list.size(); i++) {

                int temp = list.lastIndexOf(list.get(i)) - list.indexOf(list.get(i)) + 1;

                if (temp > max) {
                    max = temp;
                    element = list.get(i);
                }
            }

            result[index++] = element;

            // fix for lambda (make variable effectively final)
            int finalElement = element;
            list.removeIf(n -> n == finalElement);

            k--;
        }

        return result;
    }
}