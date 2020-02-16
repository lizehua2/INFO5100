public class P4 {
    public static String sub(String s ){
        int i;
        int j;
        int max = 0;
        String Max = new String();
        int cur = 0;
        for(i=0;i<s.length()-1;i++){
            for(j = i+1; j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) ){
                    cur = j-i+1;
                    if(cur >= max){
                        max = cur;
                        Max = s.substring(i,j+1);
                        break;

                    }
                    else if(cur < max){
                        break;
                    }
                }
                else if(s.charAt(i) != s.charAt((j))){
                    continue;
                }
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        String s = "baababaaaaaab";
        System.out.print(sub(s));
    }
}
