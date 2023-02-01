package day9;
// to avoid and handle null pointer exception...
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] str = new String[20];
        // //apply function
        // //Generates null pointer exception
         //str[0] = "sAgNik";

        // Optional<String[]> checkNull = Optional.ofNullable(str);
        Optional<String> checkNull = Optional.ofNullable(str[0]);
        if(checkNull.isPresent()){
            String str2 = str[0].toUpperCase();
            System.out.println(str2);
        }
        else{
            System.out.println("Empty string");
        }

        // // empty ->
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // // of ->
        // // Notice it throws Null Pointer Exception if empty...
        String str3 = new String("test");
        try {
            Optional<String> value = Optional.of(str3);
            // Optional<String> value2 = Optional.of(str[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // // get ->
        // // returns value of string if present else Null pointer exception
        Optional<String> value = Optional.of(str3);
        System.out.println(value.get());

        // // Hashcode ->
        // // returns hashcode if value is present else throws null pointer exception
        System.out.println(value.hashCode());

        // // Empty , present 
        System.out.println(value.isEmpty());
        System.out.println(value.isPresent());

        value.ifPresent(System.out::println);
        value.ifPresentOrElse(System.out::println,()->{System.out.println("Empty");});
    }
}
