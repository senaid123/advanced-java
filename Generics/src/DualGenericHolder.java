public class DualGenericHolder<T, U> {
    T obj;

    U obj2;

    public DualGenericHolder(T obj, U obj2){
        this.obj = obj;
        this.obj2 = obj2;
    }
    public void display(){
        System.out.println(obj);
        System.out.println(obj2);
    }
}
