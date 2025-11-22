public class SubArraySum {
    
    public static void MaxSum(int arr[]){
        int size = arr.length;
        int PreFixArr[] = new int[size];
        PreFixArr[0] = arr[0];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int s=0;
        int l=0;
        int st=0;
        int lt=0;
        for(int i=1; i<PreFixArr.length; i++){
            PreFixArr[i] = PreFixArr[i-1] + arr[i];
        }

        
        
        for(int i=0; i<arr.length; i++){
            int start = i;
            int currentsum = 0;
            for(int j=i; j<arr.length; j++){
                int end = j;
               currentsum = start== 0 ? PreFixArr[end] : PreFixArr[end]-PreFixArr[start-1];
               if(currentsum > largest){
                largest = currentsum;
                st = start;
                lt = end;
               }
               if(currentsum < smallest){
                smallest = currentsum;
                s = start;
                l = end;
               }

            }
        }
        for(int i=0; i<PreFixArr.length; i++){
            System.out.print(PreFixArr[i] + " ");
        }
        System.out.println();
        System.out.println("Largest Sum = " + largest);
        System.out.println("Smallest Sum = " + smallest);
        System.out.println("Smallest = Start = "+s+ " end =  " + l);
        System.out.println("Largest = Start = "+st+ " end =  " + lt);

    }
    public static void main(String args[]){
        int arr[] = {2,-5,7,3,-10,4};
        MaxSum(arr);
    }
}
