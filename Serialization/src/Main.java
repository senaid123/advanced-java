import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 25, "23 Srebrenicka");

        String filename = "/home/senaid/Desktop/text.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized : \n" + student);
        }catch (IOException ex){
            System.out.println("IOException is caught");
        }

        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try{
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized : " + object);

            fileIn.close();
            objIn.close();
        }catch (IOException ex){
            System.out.println("IOException is caught");
        }catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException is caught");
        }
    }
}