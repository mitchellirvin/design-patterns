class Demo {
    public static void main(String[] args) {
        Petersons p = new Petersons();
        Thread pA = new Thread(new processA(p));
        Thread pB = new Thread(new processB(p));
        pA.start();
        pB.start();
    }
}