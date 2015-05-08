package jssc;

public class JSSCProperties {
	
	public static String libDirectory;

	{
		String osName = System.getProperty("os.name");
		String fileSeparator = System.getProperty("file.separator");
		String userHome = System.getProperty("user.home");

		// Cleanup OSName
		if (osName.equals("Linux")) {
			osName = "linux";
		} else if (osName.startsWith("Win")) {
			osName = "windows";
		} else if (osName.equals("SunOS")) {
			osName = "solaris";
		} else if (osName.equals("Mac OS X")) {
			osName = "mac_os_x";
		}

		libDirectory = userHome + fileSeparator + ".jssc" + fileSeparator + osName;
	}
}
