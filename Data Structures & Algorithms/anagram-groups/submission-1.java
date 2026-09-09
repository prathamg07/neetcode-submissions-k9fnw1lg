class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character,Integer>, List<String>> map = new HashMap<>();

        for (String str : strs){
             HashMap <Character , Integer> temp = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                temp.put(c, temp.getOrDefault(c, 0) + 1);
            }
            if (map.containsKey(temp)) {
                map.get(temp).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            }
        }

        return new ArrayList<>(map.values());

        
    }
}
