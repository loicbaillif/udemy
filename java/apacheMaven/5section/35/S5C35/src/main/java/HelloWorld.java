import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World...");
        System.out.println(StringUtils.center("Hello, World...", 40, '*'));
    }
}