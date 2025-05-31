package InterviewQ;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> anagramGroups = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            String str = strs[i];

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            anagramGroups.get(sortedStr).add(str);
            if (result.stream().noneMatch(list -> list.contains(str))) {
                result.add(anagramGroups.get(sortedStr));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
