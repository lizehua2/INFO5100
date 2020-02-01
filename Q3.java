public class Q3 {
    public static void main(String[] args) {
        String s = "i am the      motherfucker";
        String result = reverse(s);

        System.out.println(result);
    }
    public static String reverse(String s) {
    String x = "";
    int a ;
    int b = 0;
    for (a = s.length() - 1; a > 0; a--) {
        if (s.charAt(a) == ' ') {
            x += s.substring(a + 1, a + 1 + b) + ' ';
            while(s.charAt(a-1)==' ') {
                a-=1;

            }

            b = 0;
        }
        if (s.charAt(a)  != ' ') {

            b += 1;

        }

    }
    x += s.substring(a, a+1+b);
    return x;
}
}



