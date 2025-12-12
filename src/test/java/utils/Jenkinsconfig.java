package utils;

public class Jenkinsconfig {
	public static String getENV() {
		return System.getProperty("env","DEV");
	}
	public static String getBrowser() {
		return System.getProperty("browser","chrome");
	}

}
