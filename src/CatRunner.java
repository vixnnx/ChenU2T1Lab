public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("abigial", 12, 8.7);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Timmy", 4, 10.4);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
