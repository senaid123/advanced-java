public class Main {
    public static void main(String[] args) {
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<Integer>(0);
        System.out.println(iObj.getObj());

        SingleGenericHolder<String> sObj = new SingleGenericHolder<String>("Code");
        System.out.println(sObj.getObj());

        DualGenericHolder<Integer, String> dualObj = new DualGenericHolder<Integer, String>(2, "Senaid");
        dualObj.display();
    }
}