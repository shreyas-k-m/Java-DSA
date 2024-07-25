public class InvertdHalfPyramidNumbers {
    public static void Invertd_Half_Pyramid_Numbers(int n) {
        for(int i = 1;i <=n;i++){
        //inner number
        for(int j = 1;j <= n-i + 1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
    
    public static void main(String args[]) {
        //hollow rectangle
        Invertd_Half_Pyramid_Numbers(5);
    }
}