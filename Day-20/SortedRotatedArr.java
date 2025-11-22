public class SortedRotatedArr {
    
    public static int findTarget(int arr[], int tar, int si, int ei){
        int mid = (si + ei) / 2;
        // if(si > ei){
        //     return -1;
        // }
        if(arr[mid] == tar){
            return mid;
        }


        while (si < ei) {
            if(arr[si] <= tar && tar <= arr[mid]){
                return findTarget(arr, tar, si, mid-1);
            }else{
                return findTarget(arr, tar, mid+1, ei);
            }
        }
        // if(arr[si] <= arr[mid]){
        //     if(arr[si] <= tar && tar <= arr[mid]){
        //         return findTarget(arr, tar, si, mid-1);
        //     }else{
        //         return findTarget(arr, tar, mid+1, ei);
        //     }
        //  }else{
        //     if(arr[mid] <= tar && tar <=arr[ei]){
        //         return findTarget(arr, tar, mid+1, ei);
        //     }else{
        //         return findTarget(arr, tar, si, mid-1);
        //     }
        // }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int targetidx = findTarget(arr, 0, 0, arr.length-1);
        System.out.println(targetidx);
    }
}
