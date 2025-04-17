package utilityClasses;

public class UniqueQuestions {
    // suppose you have display method with overload String and Object, if we call these with null value which method will execute.

    public static void display(String s){
        System.out.println("your are in String overloaded method.");
    }

    public static void display(Object o){
        System.out.println("your are in Object overloaded method.");
    }

    // NOTE: what if we have more overloaded method with StringBuilder and StringBuffer
}
