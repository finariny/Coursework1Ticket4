import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String [] animals = {"Cat", "Dog", "Dog", "Horse", "Pig", "Pig", "Cat"};
        System.out.println(Arrays.toString(animals));
        for (int i = 0; i < animals.length; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    animals[j] = "";
                }
            }
        }
        System.out.println(Arrays.toString(animals));
        String finalString = "";
        for (String animal : animals) {
            finalString = finalString + animal;
        }
        System.out.println(finalString);
    }
}