import java.time.*;

ProcessHandle self = ProcessHandle.current();
long PID = self.pid();
ProcessHandle.Info procInfo = self.info();

System.out.println(procInfo);
