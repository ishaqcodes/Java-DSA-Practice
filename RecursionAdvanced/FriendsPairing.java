public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));;
    }
    public static int friendsPairing(int n){
        return (n == 1 || n ==2) ? n : (friendsPairing(n-1)+((n-1) * friendsPairing(n-2)));
    }
}