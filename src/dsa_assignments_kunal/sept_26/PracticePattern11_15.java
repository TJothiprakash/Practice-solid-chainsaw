package dsa_assignments_kunal.sept_26;


/**/
public class PracticePattern11_15 {
    public static void main(String[] args) {
  new PracticePattern11_15().printReverseTriangle(5);
    }

    //pattern 11
    public void printReverseTriangle(int n){
        for (int i = n; i >=0; i--) {
            for (int k = i; k <=n ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //pattern 12
    public void printtopandbottomTriangle(int n){
        for (int i = n; i >0; i--) {
            for (int k = i; k <=n ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i <n; i--) {
            for (int k = i; k <n ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
