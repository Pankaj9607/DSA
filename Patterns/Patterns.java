class Patterns{

/*Pattern1:
   * * * * * 
   * * * * *
   * * * * *
   * * * * *
   * * * * * */
    static void pattern1(int N) {
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/* Pattern2:
    * 
    * *
    * * *
    * * * *
    * * * * *  */
    static void pattern2(int N) {
        for (int i=0; i<N; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/* Pattern3:
    1 
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5  */
    static void pattern3(int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

/* Pattern4: 
    1 
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5 */
    static void pattern4(int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

/* Pattern5:
    * * * * * 
    * * * *
    * * *
    * *
    *   */
    static void pattern5(int N) {
        for (int i=0; i<N; i++) {
            for (int j=N; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/* Pattern6:
    1 2 3 4 5 
    1 2 3 4
    1 2 3
    1 2
    1 */
    static void pattern6(int N) {
        for (int i=0; i<N; i++) {
            for (int j=N; j>i; j--) {
                System.out.print(N-j+1 +" ");
            }
            System.out.println();
        }
    }

/* Pattern7:
        *    
       ***
      *****
     *******
    ********* */
    static void pattern7(int N) {
        for (int i=0; i<N; i++) {
            /* spaces */
            for (int j=0; j<N-i-1; j++) {
                System.out.print(" ");
            }
            /* stars */
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            /* spaces */
            for (int j=0; j<N-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

/* Pattern8:
    *********
     *******
      *****
       ***
        * */
    static void pattern8(int N) {
        for (int i=0; i<N; i++) {
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<2*N - (2*i + 1); j++) {
                System.out.print("*");
            }
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern8(N);
    }
}