public class get_Shorted_Path {
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
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortedPath(path));
    }

}
