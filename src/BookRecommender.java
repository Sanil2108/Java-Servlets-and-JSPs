/**
 * Created by Admin on 24-06-2017.
 */
public class BookRecommender {
    public static String getBook(String language){
        switch (language.toLowerCase()){
            case "java":
                return "Java the complete reference\n";
            case "c#":
                return "C#:A beginner's guide\n";
            case "c":
                return "ANSI C\n";
            case "c++":
                return "The C++ language by Bjarne Stroustroup\n";
            case "python":
                return "10 ways to kill yourself\n";
            default:
                return null;
        }
    }
}
