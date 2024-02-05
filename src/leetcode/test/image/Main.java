package leetcode.test.image;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        testImageWebp();
        testImageWebpV2();
    }

    private static void testImageWebpV2() {
        try {
            String imageUrl = "https://demo-dev.digicommerce.cloud:6060/cms/uploads/fashion_1_4d45df37cd.webp"; // Replace with your image URL
            byte[] imageBytes = readImageBytesFromUrl(imageUrl);
            System.out.println();
            // Now you have the image data as a byte array (imageBytes)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] readImageBytesFromUrl(String imageUrl) throws Exception {
        URL url = new URL(imageUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream inputStream = connection.getInputStream();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            return outputStream.toByteArray();
        } else {
            throw new Exception("Failed to fetch image from URL. Response code: " + responseCode);
        }
    }

    static void testImageWebp() {
        try {
            // Load the WebP image file
            File inputFile = new File("https://demo-dev.digicommerce.cloud:6060/cms/uploads/fashion_1_4d45df37cd.webp");
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputFile);

            // Get a WebP image reader
            Iterator<ImageReader> readers = ImageIO.getImageReaders(imageInputStream);
            if (!readers.hasNext()) {
                throw new IOException("No suitable image reader found for WebP format.");
            }

            ImageReader reader = readers.next();
            reader.setInput(imageInputStream);

            // Read the image into a BufferedImage
            BufferedImage bufferedImage = reader.read(0);
            if (bufferedImage != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                String typeImage = ".webp";
                ImageIO.write(bufferedImage, typeImage, baos);
                byte[] imageBytes = baos.toByteArray();
                String res = Base64.getEncoder().encodeToString(imageBytes);
                System.out.println();
            }
            // Close the reader and input stream
            reader.dispose();
            imageInputStream.close();

            // Now you have the WebP image in a BufferedImage
            // You can work with the BufferedImage as needed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
