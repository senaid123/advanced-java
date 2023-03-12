public class Thread2 implements Runnable{
    MathUtils mu;

    public Thread2(MathUtils mu){
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            mu.getMultiplies(3);
        }catch (Exception e){
            System.out.println("Caught exception");
        }
    }
}
