public class Thread1 extends Thread{
    MathUtils mu;

    public Thread1(MathUtils mu){
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            mu.getMultiplies(3);
        }catch (Exception e){
            System.out.println("caught exception");
        }
    }
}
