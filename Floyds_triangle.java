public class Floyds_triangle {
    public static void main(int n ) {
        int counter = 1;
        for(int i = 0; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        main(6);
    }
}
