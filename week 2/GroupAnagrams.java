import java.util.*;

class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        GroupAnagrams g = new GroupAnagrams();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(g.groupAnagrams(strs));
    }
}