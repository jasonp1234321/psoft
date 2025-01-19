package hw0;
import java.util.Random;
public class RandomHello {
    public static void main(String[] args) {
        RandomHello randomHello = new RandomHello();
        System.out.println(randomHello.getGreeting());
    }
    public String getGreeting() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(0,5);
        if (randomInt == 0){
            return "Hello World";
        } else if(randomInt == 1){
            return "Hola Mundo";
        }else if(randomInt == 2){
            return "Bonjour, le Monde";
        }else if(randomInt == 3){
            return "Hallo Welt";
        } else{
            return "Ciao Mondo";
        }
    }
}
