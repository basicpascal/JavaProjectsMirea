public class SynchClass {
    private static String cat1 = "Рукавичка";
    private static String cat2 = "Пуффин";

    public static void swap() {
        synchronized (SynchClass.class) {
            String s = cat1;
            cat1 = cat2;
            cat2 = s;
        }
    }
}