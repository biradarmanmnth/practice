package Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class PracticedPrograms {
    public static void main(String[] args) {
        String s = "java is programming language";String s1 = "java is object oriented programming language. Java is very famous because of java 8 features.";
        String[] as = {"ram", "ramesh", "seeta","Kapil","Ranu","madam"};String[] as1 = {"rama", "jitesh", "seema","Sunil","sima","Ranu","parmeshwar"};
        int[] arr={100,2,3,4,4,5,8}, arr1={20,6,8,9,11};List<Integer> numList=Arrays.asList(5,8,9,3,6,8,5,7,43,67,6,5,44,4,4,4);
        List<Student> lStudent=Arrays.asList(new Student(56,"sham"),
                                            new Student(76.2,"sham"),
                                            new Student(43.3,"ranu"),
                                            new Student(92.0,"Ravi"));

        // 1.Find the sum of all elements of List.
 //        int sum=numList.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

        //1.1 Find the sum of all Elements of Arrays.
//        int sum=Arrays.stream(arr1).sum();
//        System.out.println(sum);

        //Sort the array of String according length of elements.
//        List<String> sortedList=Arrays.stream(as1).sorted().map(String::toLowerCase).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//        System.out.println(sortedList);

      // classify the student as FAIL and PASS
      //  Map<String,List<Student>> ClassifiedStudents=lStudent.stream().collect(Collectors.groupingBy(student->student.grade >= 70 ? "PASS" : "FAIL"));
      //  System.out.println(ClassifiedStudents);//merge and sort two array string


      //  List<String> distinctSortedArray= Stream.concat(Arrays.stream(as),Arrays.stream(as1)).distinct().map(String::toLowerCase).sorted().toList();
      //  System.out.println(distinctSortedArray);
        // mearge two sorted array into one sorted array
//        int[] sortedArray= IntStream.concat(Arrays.stream(arr),Arrays.stream(arr1)).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArray));

        // Given the list of words and filter the palindrome and print it.
      //  List<String> listString=Arrays.asList(as);
       // List<String> palindrome=listString.stream().filter(word->word.contentEquals(new StringBuilder(word).reverse())).collect(Collectors.toList());
       // System.out.println(palindrome);

//remove the duplicates from array
       // Arrays.stream(arr).distinct().forEach(System.out::print);

      //  int [] distinctArray=Arrays.stream(arr).distinct().toArray();
       // System.out.println(Arrays.toString(distinctArray));

//find the duplicate and print the numbers
//        List<Integer> duplicate=Arrays.stream(arr).boxed()
//                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
//                .entrySet().stream().filter(i->i.getValue()>1)
//                .map(Map.Entry::getKey).toList();
//        System.out.println(duplicate);

//Grouping on the basis of first letter and count total words.
//Map<Character,Long> freqwords= Arrays.stream(as).collect(Collectors.groupingBy(c->c.toLowerCase().charAt(0),Collectors.counting()));
//System.out.println(freqwords);

//        List<Integer> listInteger=Arrays.asList(1234,5467,987,128,654,135);
//        List<Integer> intList=listInteger.stream().filter(n->String.valueOf(n).startsWith("1")).toList();
//        System.out.println(intList);

        //find the freq of words.
        // String[] words=s.split(" ");
        // Map<String, Long> freqWord=Arrays.stream(words).map(String :: toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    //    Map<String, Long> freqWord = Arrays.stream(s1.trim().split("\\s+")).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
       // System.out.println(freqWord);

        //remove empty string from array of string
        // List<String> notDuplicate = Arrays.stream(as).filter(i -> i.length() > 1).toList();
        //  System.out.println(notDuplicate);

        // frequency of char
         //Map<Character,Long>charF=s.chars().filter(i->i!=' ').mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(charF);
        // reverse each word of sentance.
        // String rString=Arrays.stream(s.split(" ")).map(i-> new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" "));

        // consecutive same letters.
        // List<String> consecutiveSameLetters= IntStream.range(0,s.length()-1).filter(i -> s.charAt(i)==s.charAt(i+1)).mapToObj(i-> s.charAt(i)+"->"+s.charAt(i+1)).collect(Collectors.toList());

    }
}