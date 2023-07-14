package io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableSample {

    public static void main(String[] args) throws IOException {
        Serializable serializable = null;
        ObjectInputStream objectInputStream = new ObjectInputStream(null);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(null);
    }
}
