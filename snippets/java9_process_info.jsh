ProcessHandle self = ProcessHandle.current();
ProcessHandle.Info procInfo = self.info();
System.out.println(procInfo);
