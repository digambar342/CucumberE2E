package utils;

import java.io.IOException;

public class ConfigReader {
    private static String baseUrl;
    private static String browserName;

    public static String getBaseUrl() throws IOException {
        baseUrl= Utils.getConfig("baseUrl");
        return baseUrl;
    }

    public static String getBrowserName() throws IOException {
        browserName = Utils.getConfig("browserName");
        return browserName;
    }

}
