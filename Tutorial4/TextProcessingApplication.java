public class TextProcessingApplication {

    public static String concatenateWithString(String[] strings) {
        String result = "";
        for (String str : strings) {
            result += str; 
        }
        return result;
    }

    public static String concatenateWithStringBuilder(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String concatenateWithStringBuffer(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseWithStringBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static String replaceWithString(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }

    public static String replaceWithStringBuilder(String str, String target, String replacement) {
        StringBuilder sb = new StringBuilder(str);
        int index = sb.indexOf(target);
        while (index != -1) {
            sb.replace(index, index + target.length(), replacement);
            index = sb.indexOf(target, index + replacement.length());
        }
        return sb.toString();
    }

    public static String replaceWithStringBuffer(String str, String target, String replacement) {
        StringBuffer sb = new StringBuffer(str);
        int index = sb.indexOf(target);
        while (index != -1) {
            sb.replace(index, index + target.length(), replacement);
            index = sb.indexOf(target, index + replacement.length());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test data
        String[] strings = {"Hello", " ", "World", " ", "from", " ", "Java!"};

        // Concatenation
        System.out.println("Concatenation with String: " + concatenateWithString(strings));
        System.out.println("Concatenation with StringBuilder: " + concatenateWithStringBuilder(strings));
        System.out.println("Concatenation with StringBuffer: " + concatenateWithStringBuffer(strings));

        // Reversal
        String original = "Hello World";
        System.out.println("Reversed with StringBuilder: " + reverseWithStringBuilder(original));
        System.out.println("Reversed with StringBuffer: " + reverseWithStringBuffer(original));

        // Replacement
        String text = "Hello World, Hello Java!";
        System.out.println("Replacement with String: " + replaceWithString(text, "Hello", "Hi"));
        System.out.println("Replacement with StringBuilder: " + replaceWithStringBuilder(text, "Hello", "Hi"));
        System.out.println("Replacement with StringBuffer: " + replaceWithStringBuffer(text, "Hello", "Hi"));
    }
}
