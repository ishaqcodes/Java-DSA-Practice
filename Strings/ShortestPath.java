public class ShortestPath{
    public static void main(String[] args){
        String route = "WNEENESENNN";
        System.out.println("Shortest Path: " + findShortestPath(route));
    }
    public static int findShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'W'){
                x--;
            }
            if(path.charAt(i) == 'E'){
                x++;
            }
            if(path.charAt(i) == 'N'){
                y++;
            }
            if(path.charAt(i) == 'S'){
                y--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        return (int) Math.sqrt(x2 + y2);
    }
}