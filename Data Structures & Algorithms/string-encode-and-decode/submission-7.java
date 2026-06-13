class Solution {

    public String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();

        for (String item : strs){
            str.append(item + "%end%");
        }
        return str.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList();
        
        StringBuilder temp= new StringBuilder();
        int i=0;
        while ( i< str.length()){

            if (temp.toString().endsWith("%end%")){
                list.add(temp.toString().substring(0,temp.length()-5));
                temp= new StringBuilder();
            }
            else{
                temp.append(str.charAt(i));
                i++;
            }

        }
        if (temp.length()>0){
        list.add(temp.toString().substring(0,temp.length()-5));
        }

        return list;

    }
}