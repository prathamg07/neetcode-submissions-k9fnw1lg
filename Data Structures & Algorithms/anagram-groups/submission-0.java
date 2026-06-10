class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <Character , Integer> [] maps = new HashMap[strs.length];
        for (int i =0 ; i<strs.length ; i++){
            maps[i] = new HashMap<> () ;

            for (int j=0 ; j<strs[i].length(); j++){
                char ch = strs[i].charAt(j); 
                maps[i].put(ch, maps[i].getOrDefault(ch,0)+1);
            }
        }
        List<List<String>> lists = new ArrayList<>();
        boolean[] visited = new boolean [strs.length];

        for (int i =0 ; i < strs.length;i++){

            if (visited[i]){
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(strs[i]);

            for (int j=i+1 ; j<strs.length;j++){

                if (maps[i].equals(maps[j])){
                    list.add(strs[j]);
                    visited[j]=true;
                }

            }
            lists.add(list);
        }


        return lists;

        
    }
}
