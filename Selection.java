public class Selection {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "kiwi", "pear", "grape"};
        System.out.println("Original String Array:");
        printArray(words);
        
        sortAlphabetically(words);
        System.out.println("\nSorted String Array:");
        printArray(words);

        int[] arr = {5, 2, 8, 1, 6, 3};
        System.out.println("\nOriginal Integer Array:");
        printArray(arr);
        
        sort(arr);
        System.out.println("\nSorted Integer Array:");
        printArray(arr);
    }
    
    public static void sort(int[] a){
        for(int i = 0; i < a.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[minIndex])
                    minIndex = j;
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
    
    public static void sortAlphabetically(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
