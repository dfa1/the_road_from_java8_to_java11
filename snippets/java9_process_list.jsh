import java.time.*;

ProcessHandle.allProcesses().map(ProcessHandle::info).forEach(System.out::println);
