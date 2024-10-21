public class Methods {
    public static void main(String[] args){

        welcome();
        multiply(5, 100);
        multiply(2, 3);
        divide(100, 2);
    }

    public static void welcome(){
        System.out.println("Welcome to our calculators!");
    }

    public static void multiply(int a, int b){
        System.out.println(a * b);
    }

    public static void divide(int a, int b){
        System.out.println(a / b);
    } 
}
