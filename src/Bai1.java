import java.util.Arrays;

public class Bai1 {

    // cach 1
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] == 0){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] != 0){
                        int a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                        break;
                    }
                }
            }
        }
    }

    // cach 2
    public static int[] newArray(int[] arr){
        int[] arrTmp = new int[arr.length];
        int count = 0;
        for (int j : arr) {
            if (j != 0) {
                arrTmp[count++] = j;
            }
        }
        return arrTmp;
    }



    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 1, 0, 3, 5, 0, 6, 0};

//        sort(arr); // cach 1
        int[] arrTmp = newArray(arr); // cach 2
        System.out.println(Arrays.toString(arrTmp));
    }
}
