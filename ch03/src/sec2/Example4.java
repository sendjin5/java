package sec2;public class Example4 {
    public static void main(String[] args) {
        //중첩 for문

        int cnt = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                cnt++;
                if (cnt > 31) {
                    break;
                }
                System.out.printf("%2d\t", cnt);

            }
            System.out.print("\n");

        }


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 1; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%dx%d=%2d\t", j, i, j*i);
            }
            System.out.println("");
        }

    }

}




