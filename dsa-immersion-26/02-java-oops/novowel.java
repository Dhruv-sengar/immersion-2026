public class novowel {
    public static void main(String[] args) {
        String name = "Dhruv";

        for (char ch : name.toCharArray()) {
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                System.out.print(ch);
            }
        }
    }
}