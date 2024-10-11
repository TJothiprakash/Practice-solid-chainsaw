package dsa_assignments_kunal.oct_11;

/*pattern 12 */
public class Patterns {
    public static void main(String[] args) {
        printtopandbottomTriangle(5);
            }
    public static void printtopandbottomTriangle(int n){
        for (int i = n; i >=0; i--) {
            for (int k = i; k <=n ; k++) {
                System.out.print(k );
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i <=n; i++) {
            for (int k = i; k <=n ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
