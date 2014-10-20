public class JavaStringDemo {

    public static void main(String[] args) {
        final String dog = "length: 10";
        final String pig = "length: " + dog.length();
        System.out.println("dog:" + dog);
        System.out.println("pig:" + pig);
        System.out.println("pig equal dog:" + (pig == dog));
        System.out.println("a\u0022.length() + \u0022b".length());
    }
}
