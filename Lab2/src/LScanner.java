import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;


public class LScanner {
    public static void main(String[] args)  {

        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        try {
            Scanner fin = new Scanner(Paths.get(dir, "input.txt"), StandardCharsets.UTF_8);
            int num = 1;
            while(fin.hasNext()){
                System.out.println(num + ": " + fin.next());
                num++;
            }

        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }

    }
}