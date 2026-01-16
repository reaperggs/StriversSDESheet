class Solution {
    public void nextPermutation(int[] arr) {
        int indx = -1;

        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                //haan 
                indx = i;
                break;
            }
        }

        if(indx == -1){
            reverse(arr,0,arr.length-1);
            return;
        }

        for(int i = arr.length -1; i >= 0; i--){
            if(arr[i] > arr[indx]){
                int temp = arr[i];
                arr[i] = arr[indx];
                arr[indx] = temp;
                break;
            }
        }

        reverse(arr, indx+1, arr.length-1);
    }

    public void reverse(int[] arr, int i,  int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]  = temp;
            i++;
            j--;
        }
    }
}

public class NextPermutation{
    public static void main(String[] args){
        //
    }
}