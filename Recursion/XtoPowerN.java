public class XtoPowerN {
    public static void main(String[] args){
        System.out.println(printXtoPowerN(2,10));;
    }
    public static int printXtoPowerN(int x, int n){
        // if(n == 0) {
        //     return 1;
        // }
        // int halfPower = printXtoPowerN(x, n/2);
        // if((n % 2) != 0){
        //     halfPower = (n * halfPower * halfPower);
        // }else{
        //     halfPower = (halfPower * halfPower);
        // }
        // return halfPower;
        return (n == 0) ? 1 : (n % 2) != 0 ? (x * printXtoPowerN(x, n/2) * printXtoPowerN(x, n/2)) : (printXtoPowerN(x, n/2) * printXtoPowerN(x, n/2));
    }
}