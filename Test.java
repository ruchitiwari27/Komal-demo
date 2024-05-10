public class Test {

    Test(){
        System.out.println("Hello arguement constructor");
    }

    Test(int a, int b){
        this();
        System.out.println("Hello 2 arguement constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        Test t = new Test();
        System.out.println("Main Method end");
    }
}
