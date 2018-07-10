public class Pluralize {

    public static void main(String[] args) {

//       int count = 1;
//       System.out.println("I own " + count + " " + pluralize("cat", count) + ".");
       int count = 0;
        System.out.println("I own " + count + " " + pluralize("dog", count) + ".");
    }

    public static String pluralize(String own, int count) {
        if (count > 1 || count == 0) {
            return own+ "s";
        } else {
            return own;
        }
    }
}
