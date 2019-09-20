package TestDemo;

public class TestDemo {
    public static void main(String[] args){
        try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            System.out.println("12345");
            arr = null;
            System.out.println(arr[0]);
            System.out.println("12345");
        }finally {
            System.out.println(12);
        }
    }
}
