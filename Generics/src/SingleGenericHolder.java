public class SingleGenericHolder<T> {
    T obj;

    SingleGenericHolder(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
