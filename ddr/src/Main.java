public class Main {
    public static void main(String[] args) {

        String[] strings = {"apple", "orange", "banana", "apple", "grape", "banana"};


        System.out.println("Исходный массив:");
        printArray(strings);


        removeDuplicates(strings);


        System.out.println("\nМассив после удаления повторов:");
        printArray(strings);
    }


    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }


    public static void removeDuplicates(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != null && arr[i].equals(arr[j])) {
                    arr[j] = "null";
                }
            }
        }
    }
}
