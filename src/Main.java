class Main {
    public static void main(String[] args) {
        BinOps bcalc = new BinOps();
        System.out.println("Демонстрация операций с двоичными строками.");
        System.out.println("2 + 3 == 5 :  " + bcalc.sum("10", "11"));
        System.out.println("3 * 3 == 9 :  " + bcalc.mult("11", "11"));
    }
}
