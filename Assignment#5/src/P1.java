public class P1 {
    public static int Find(String a) {
        int i;
        int j;
        int length = a.length();
        int count = 0;
        for (i = 0; i <= length - 1; i++) {
            for (j = 0; j <= length - 1; j++) {
                if (i != j) {
                    if (a.charAt(i) != a.charAt(j)) {
                        count++;
                        if (count == length - 1 - i) {
                            return i;
                        }
                    }
                    if (a.charAt(i) == a.charAt(j)) {
                        count = 0;
                        break;
                    }
                }
                }

        }

        return -1;
    }

    public static void main(String[] args) {
        P1 p = new P1();
        String a = "aaa";
        System.out.println(Find(a));
    }
}
