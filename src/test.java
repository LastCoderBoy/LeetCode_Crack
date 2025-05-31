public class test {
    public static void main(String[] args) {
        System.out.println(cost(5));
        System.out.println(cost(7));
    }
    public static double cost(int numWidgets){
        int remaining = numWidgets % 3;
        int completePart = numWidgets / 3;
        return 1*completePart + 0.65*remaining;
    }
}
