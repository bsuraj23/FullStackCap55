
public class SystemProperties {

    public static void main(String[] args) {

        String nameOS = System.getProperty("os.name");
        System.out.println("Operating system Name=>" + nameOS);
        String osType = System.getProperty("os.arch");
        System.out.println("Operating system type =>" + osType);
        String osVersion = System.getProperty("os.version");
        System.out.println("Operating system version =>" + osVersion);

        System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));
        System.out.println(System.getenv("PROCESSOR_ARCHITECTURE"));
        System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));

    }

}
