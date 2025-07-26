public class Operations{
    public static void main(String[] args){
        getIthBit(3, 1);
        setIthBit(1010, 2);
        clearIthBit(10, 1);
        updateIthBit(10, 1, 0);
        clearLastIBit(15, 2);
        clearRangeOfBit(2515,2,7);
    }
    public static void getIthBit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            System.out.println("Bit at " + i + " position is 0");
        }
        else{
            System.out.println("Bit at " + i + " position is 1");
        }
    }
    public static void setIthBit(int num, int i){
        int bitMask = 1<<i;
        System.out.println("Number after setting " + i + "th bit is: " + (num| bitMask));
    }
    public static void clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        System.out.println("Number after clearing " + i + "th bit is: " + (num & bitMask));        
    }
    public static void updateIthBit(int num, int i, int newBit){
        if (newBit != 0) {
            clearIthBit(num, i);
        }
        else {
            setIthBit(num, i);
        }
    }
    public static void clearLastIBit(int num, int i){
        int bitMask = (-1) << i;
        System.out.println("Number after clearing last " + i + " bits is: " + (num & bitMask));
    }
    public static void clearRangeOfBit(int num, int i, int j){
        int a = (1 << i) - 1; // All bits from 0 to i-1 are set to 1
        int b = (-1) << (j + 1); // All bits from i
        int bitMask = (a|b);
        System.out.println("Number after clearing bits from 0 to " + i + " is: " + (num & bitMask));
    }
}