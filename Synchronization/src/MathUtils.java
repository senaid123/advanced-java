public class MathUtils {
    synchronized void getMultiplies(int n){

       synchronized(this) {
            for (int i = 0; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println("Caught exception " + e);
                }
            }
        }

    }

}
