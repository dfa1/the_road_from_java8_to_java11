import java.lang.Runtime.Version
import java.lang.System

String versionProperty = System.getProperty("java.version")
Version parsedVersion = Version.parse(versionProperty)
System.out.println(parsedVersion.version())
