package com.java9.processApi;
import java.util.Optional;

/*Before java9 
 * communicating to the processor /OS from java program was very difficult
 * we have to write very lengthy code
 * We have to depend on native code / third party APIs
 * 
 *  
 *  From java9
 *  communicating to the processor /OS from java program is easy
 *  we have to write very few lines of code
 *  no need to depend on native code / third party APIs
 * 
 * 
 * Process API updates
 * Get PID process from java
 * Create process from java
 * Destroy process from java
 * Get process handle from java
 * Wait for process to terminate
 * Get process information
 * Get the parent details of the process
 * Get children details of the process
 * */
public class ProcessApiDemoSelf {

	public static void main(String[] args) {

		int pid = 17068; // from Task manager get actual value
		int pid2 = 99156; // dummy value

		Optional<ProcessHandle> processHandle1 = ProcessHandle.of(pid);
		Optional<ProcessHandle> processHandle2 = ProcessHandle.of(pid2);
		System.out.println(processHandle1.isPresent());
		System.out.println(processHandle2.isPresent());

		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println(processHandle.info());
		// o/p

		// cmd: C:\Program Files\Java\jdk-11.0.1\bin\javaw.exe, startTime:
		// Optional[2019-01-04T11:10:21.743Z], totalTime: Optional[PT0.1875S]]

	}
}