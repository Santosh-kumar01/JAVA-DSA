public class Strings_equal_or_not {
    public static float getShortedPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length();i++){
            char direction = path.charAt(i);
            if(direction == 's'){
                y--;
            }
            else if(direction == 'N'){
                y++;
            } else if (direction == 'W') {
                x--;

            } else if (direction == 'E') {
                x++;

            }
        }
        int x2 =x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String s1 = "santosh";
        String s2 = "santosh";
        String s3 = new String("santosh");
        /*if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        if(s1 == s3){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }*/
        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}
