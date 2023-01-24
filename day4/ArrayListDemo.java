import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> langs = new ArrayList<String>();
        // ArrayList<String> langs2 = new ArrayList<String>();
        langs.add("JAVA");
        langs.add("CPP");
        langs.add("PYTHON");
        langs.add("KOTLIN");
        langs.add("RUBY");
        langs.add("C#");
        System.out.println(langs);
        langs.remove("JAVA");
        System.out.println(langs);
        langs.remove(0);
        System.out.println(langs);
        System.out.println(langs.size());
        //langs2 = langs.clone();

    }
}
