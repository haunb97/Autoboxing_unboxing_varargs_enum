import java.util.List;

public class Varargs {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println("sử dụng varargs :");
        add(1);
        add(1, 2);
        add(arr);
        System.out.println("cách bình thường :");
        only(1,2);
        // String
        System.out.println("sử dụng varargs :");
        String listString[] = {"iphone", "samsung", "xiaomi"};
        displayString("s");// em nghĩ nó có kiểu Character rồi nên nó xe không cho phép để ở đây là kiểu kí tự ' ' được
        displayString("đây là một chuỗi String");
        displayString(listString);
        System.out.println("cách bình thường :");
        displayListString(listString);


    }
    public static void add ( int...values){
        for (int value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static void displayString(String...strings){
        for (String string : strings
        ) {
            System.out.print(string + ", ");
        }
        System.out.println();
    }

    public static  void only(int num1 , int num2) {
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void displayElement(int [] nums){
        for (int num : nums
             ) {
            System.out.println(num);
        }
    }

    public static void displayListString(String[] stringList){
        for (String string : stringList
             ) {
            System.out.print(string + ", ");
        }
        System.out.println();
    }




}
