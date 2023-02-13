class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] res = new int[queries.length];
        int resIndex = 0;
        Map<Integer, String[][]> trimmed = new HashMap<>();
        for(int[] query : queries) {
            int trim = query[1];
            int minVar = query[0] - 1;
            if(!trimmed.containsKey(trim)) {
                String[][] arr = new String[nums.length][2];
                int i = 0;
                for(String num : nums) {
                    int sz = num.length();
                    arr[i] = new String[]{num.substring(sz - trim), "" + i++};
                }
                Arrays.sort(arr, Comparator.comparing(a -> a[0]));
                trimmed.put(trim, arr);
            }
            res[resIndex++] = Integer.parseInt(trimmed.get(trim)[minVar][1]);
        }
        return res;
    }
}