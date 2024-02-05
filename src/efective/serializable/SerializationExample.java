package efective.serializable;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
//        serializableInteger();
        serializableClass();
    }

    private static void serializableClass() {
        // Create a Person instance
        Person person = new Person("John Doe", 25);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Object obj = ois.readObject();
            if (obj instanceof Person) {
                Person deserializedPerson = (Person) obj;
                System.out.println("Deserialized Person: " + deserializedPerson);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serializableInteger() {
        Integer originalInteger = 42;

        // Tuần tự hóa
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(originalInteger);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Giải tuần tự hóa
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            Object obj = ois.readObject();
            if (obj instanceof Number) {
                Number deserializedNumber = (Number) obj;
                System.out.println("Số đã giải tuần tự hóa: " + deserializedNumber);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
