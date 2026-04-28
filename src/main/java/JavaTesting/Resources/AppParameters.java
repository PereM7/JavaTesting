package JavaTesting.Resources;

public class AppParameters {
    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT = "80";

    //SINGLETON PATTERN
    private static AppParameters instance;

    private void AppParameters () {}

    private void initApp() {
        //Codi necessari per iniciar l'app
    }
    public void resetApp() {
        //Codi per reconfigurar l'app
    }

    public static AppParameters getInstance () {
        if (instance == null) {
            instance = new AppParameters();
        }
        return instance;
    }

    public static String deployedURL() {
        return "https://" + DOMAIN + ":" + PORT;
    }
}
