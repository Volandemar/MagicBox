public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox(7);

        magicBox.add(12);
        magicBox.add(146785218);
        magicBox.add("\\%");
        magicBox.add(32);
        magicBox.add(52);
        magicBox.add("asdasd");
        magicBox.add(72);

        System.out.println(magicBox.pick());
    }
}