import java.util.Properties;

public class SysProp {
	 public static void main(String[] args) {

	        Properties properties = System.getProperties();
	        // Java 8
	        properties.forEach((k, v) -> System.out.println(k + ":" + v));

	 }

}
