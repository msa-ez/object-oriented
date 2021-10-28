public class Application {
    public static void main(String args[]) {
        System.out.println("선택한 동물은:" + args[0]);

        if("Dog".equals(args[0])) {
            System.out.println("멍멍");
        } else if("Cat".equals(args[0])) {
            System.out.println("냐옹"); 
        } else if("Chicken".equals(args[0])) {
            System.out.println("꼬꼬댁");
        }
    } 
}
