package aray;


public class aray_1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int sokhachhang = accounts.length;
        int songanhang = accounts[0].length;
        int[] tongtaisan = new int[sokhachhang];
        for (int i = 0; i < sokhachhang; i++) {
            int countI = 0;
            for (int j = 0; j < songanhang; j++) {
                countI +=accounts[i][j];
            }
            tongtaisan[i] = countI;
        }
        int max = 0; 

        for (int i = 0; i < sokhachhang; i++) {
            if(tongtaisan[i] > max){
                max = tongtaisan[i];
            }
            
        }

        return max ;
    }
    // cach rut gon 
    public static int maximumWealth2(int[][] accounts) {
        int sokhachhang = accounts.length;
        int songanhang = accounts[0].length;
        int max = 0; 

        for (int i = 0; i < sokhachhang; i++) {
            int countI = 0;
            for (int j = 0; j < songanhang; j++) {
                countI +=accounts[i][j];
            }
            if(countI > max){
                max = countI;
            }
        }



        return max ;
    }
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{3,2,1}};
        // int[][] b = new int[2][3];
        // int sodong = a.length;
        // int socot = a[0].length;
        // // System.out.println("so hang "+sodong);
        // // System.out.println("so cot " + socot);
        // for (int i = 0; i < sodong; i++) {
        //     for (int j = 0; j < socot; j++) {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
            
        // }
        System.out.println(maximumWealth(a));
    }
}
