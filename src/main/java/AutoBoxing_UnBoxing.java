public class AutoBoxing_UnBoxing {

    public static void main(String[] args) {
       int x = 10 ;
       Integer y = new Integer(10);
       int z = x + y;// unboxing
        System.out.println(z);

        // wrapper class có các hàm chuyển đổi kiểu String => int ( unboxing )
        int z1 = Integer.valueOf("45");
        int z2 = Integer.parseInt("45");

        // boxing 10 là kiểu int => dc tự động chuyển sang kiểu Integer
        Integer k = 10 ;//10 tại đây là kiểu primitive được autoboxing sang kiểu Integer để gán cho k
        k = new Integer(10);

        int x1=10;
        int x2 = 10;
        Integer x3 = 10;
        System.out.println("boxing :");
        System.out.println(x1 == x2);//true
        System.out.println(x1 == x3);// true
// chú ý :
        Integer k1 = new Integer(10);
        Integer k2 = new Integer(10);
        int k3 = 10;
        System.out.println("chú ý :");
        System.out.println(k1 == k2);//false do đây là 2 đối tượng phải sử dụng phương thức so sánh hai đối tượng là equal()
        System.out.println(k1 == k3);//true do k1 sẽ được java unboxing thành kiểu int

        testNum(k3);

    }

    private static void testNum (Integer a) {
        int b = 10;
        Integer c = 10;
        System.out.println("testNum :");
        System.out.println(b == a);
        System.out.println(a instanceof Integer);
    }

}
