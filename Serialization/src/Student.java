import java.io.Serializable;

public class Student  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    private String address;

    /* For those variables that we don't want to serialize we use transient for declaration*/
    transient int x;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
