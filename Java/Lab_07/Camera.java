package Lab_07;
import java.util.Random;
public class Camera {
    public boolean haMovimento(){
        Random rand = new Random();
        return rand.nextInt(100) % 4 == 0;
    }
}