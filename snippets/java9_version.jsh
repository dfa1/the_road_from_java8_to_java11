import java.lang.Runtime.Version;
import java.lang.System;

String versionString = System.getProperty("java.version");
Version version = Version.parse(versionString);
System.out.printf("java %d.%d%n", version.major(), version.minor());
