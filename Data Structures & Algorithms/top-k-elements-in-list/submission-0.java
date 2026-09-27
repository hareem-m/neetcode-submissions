class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        List<int[]> valuesArray = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums){
            if (hash.containsKey(num)){
                hash.put(num, hash.get(num)+1);
            }
            else{
                hash.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()){
            valuesArray.add(new int[]{entry.getValue(), entry.getKey()});
        }
        valuesArray.sort((a, b) -> b[0] - a[0]);
        for (int i=0; i<k; i++){
            res.add(valuesArray.get(i)[1]);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();

        // ArrayList<Integer> valuesArray = new ArrayList<>(hash.values());
        // valuesArray.sort(null);
        // int size = valuesArray.size();
        // List<Integer> result = valuesArray.subList(size-k, size);
        // return result.stream().mapToInt(Integer::intValue).toArray();

        // System.out.println(hash);
        // int[] arr = new int[2];
        // return arr;


    }
}
