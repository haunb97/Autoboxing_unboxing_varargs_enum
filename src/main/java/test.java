 enum motoBike{
    HONNDA,YAMAHA, SYM
}

public class test {
    enum car{
        HUYNDAI, KIA, NOVO

    }

    public static void main(String[] args) {
        motoBike hau = motoBike.SYM;
        System.out.println(hau);

        car min = car.NOVO;
        System.out.println(min);
        String keyCheck = "yamaha";
//        switch (keyCheck){
//            case motoBike.HONNDA:
//                System.out.println("đây là xe honda");
//                break;
//            default:
//                System.out.println("một xe nào đó khác honda");
//                break;
//        }
    }

}
