public class BitManipulation {

    /* public static void main(String args[]) {
        System.out.println(5 & 6);  //binary AND
        System.out.println(5 | 6);  //binary OR
        System.out.println(5 ^ 6);  //binary XOR
        System.out.println((~5));  //binary One's complement(NOT)
        System.out.println(5 << 2);  //binary LEFT SHIFT
        System.out.println(6 >> 1);  //binary RIGHT SHIFT
    }*/

    public static int getIthBit(int n,int i) { //by using GetIthBit we can get the value of binary value
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n,int i) { //change the value
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int cleartIthBit(int n,int i) {
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit) {
        if(newBit == 0) {
            return cleartIthBit(n,i);
        } else {
            return setIthBit(n,i);
        }

        /*n = cleartIthBit(n,i);  //for interview
        int bitMask = newBit << i;
        return n | bitMask;*/
    }

    public static int clearIBit(int n,int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsinRAnge(int n,int i,int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    
    public static void main(String args[]){
        System.out.println(getIthBit(10,1));

        System.out.println(setIthBit(10,2)); 

        System.out.println(cleartIthBit(10,1));

        System.out.println(updateIthBit(10,2,1));    

        System.out.println(clearIBit(14,2));  

        System.out.println(clearBitsinRAnge(10,2,4));
    }
}