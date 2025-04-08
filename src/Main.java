import java.util.*;

public class Main {
    public static void main(String[] args) {
     //flat map example List<List<String>>
        List<List<String>> address=Arrays.asList(Arrays.asList("a","b","b","d","e","f"),Arrays.asList("z","x","y","u","v"));
        System.out.println(address);

        List<String> listAddress=address.stream().flatMap(Collection::stream).toList();

        System.out.println(listAddress);
    }
}



