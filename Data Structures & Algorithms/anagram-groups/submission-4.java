// import java.util.Array;
// import java.util.ArrayList;
// import java.util.Map;
// import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // ArrayList<String> sortedArray = new ArrayList<>();
        List<List<String>> sortedArray = new ArrayList<List<String>>();
        Map<String, Integer> sorted = new HashMap<>();
        for (int i=0; i<strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String word = new String(charArray);

            if (sorted.containsKey(word)){
                int index = sorted.get(word);
                sortedArray.get(index).add(strs[i]);
            }

            else{
                sorted.put(word, sorted.size());
                ArrayList<String> anagramList = new ArrayList<>();
                anagramList.add(strs[i]);
                sortedArray.add(anagramList);
            }

            // System.out.println(sorted);
            // System.out.println(sortedArray);

        }
        return sortedArray;
    }
}
