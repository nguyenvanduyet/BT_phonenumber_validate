import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidData {
    public static final String VALIDATE_PHONE = "^[\\(]84[\\)]-[\\(]09[0-9]{8}[\\)]";
    public  static String validPhone="(84)-(0934798343)";
//    Pattern pattern = Pattern.compile(VALIDATE_PHONE);
//    Matcher matcher =pattern.matcher();

    public static void main(String[] args) {
        System.out.println(validPhone.matches(VALIDATE_PHONE));
    }
}
