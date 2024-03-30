public class Searching {
    
    public static int linearSearch(int arr[], int x){
        for(int i=0; i <arr.length; i++){
            if(arr[i] ==x){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchs(int arr[], int x){
        int low = 0;
        int high=arr.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(x==arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[],int x){
        return binarySearchRecursive(arr,x,0,arr.length -1);
    }

    private static int binarySearchRecursive(int arr[],int x,int low,int high){
        if(high>=low){
            int mid = (low + high)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                return binarySearchRecursive(arr, x, low, mid -1);
            }
            else {
                return binarySearchRecursive(arr, x, mid +1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    
        int[] arr1={2,5,6,3,1,2,8,6,5,3};
        System.out.println(linearSearch(arr1,8));
    
        
        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchs(arr2, 9));
        

        int[] arr3={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr3, 9));

    
    
    }
}
