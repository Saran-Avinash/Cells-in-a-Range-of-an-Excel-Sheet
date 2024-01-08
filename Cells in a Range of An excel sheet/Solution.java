class Solution {
    public List<String> cellsInRange(String s) {
    
        List<String> list = new ArrayList<String>();
        char char_start = s.charAt(0);
        char char_end = s.charAt(3);

        int int_start = s.charAt(1) - '0';
        int int_end = s.charAt(4) - '0';

        for(char c = char_start; c <= char_end; c = (char)(c+1)){
            for(int i = int_start; i <= int_end; i++){
                list.add(c+""+i);
            }
        }
        return list;
    }
}