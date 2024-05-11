import javax.imageio.stream.ImageInputStream;

public class Hollow_reactangle_patter {
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i = 1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollow_rectangle(7,8);
    }
}

