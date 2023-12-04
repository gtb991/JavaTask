public class LargestValueArray {

    public static void main(String[] args) {

        int[] arr = {99,12,21,28,30,34,36,38,39,46,53,60,70,84,91};

        int val = arr[0];

        for (int i = 0; i <arr.length; i++){
            if (arr[i] > val ){
                val = arr[i];
            }
        }
        System.out.println("Largest is = " + val);


    }
}
