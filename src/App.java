public class App {
    public static void main(String[] args) throws Exception {
        Searching obj = new Searching();
        int [] arr = {1,2,3,4};
        int s = 3;
        System.out.println(obj.LinearSearch(arr, s));
        System.out.println(obj.BinarySearch(arr, s));
    }
}
