import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

public class javafetch {
	public static void main(String[] args) {
		printSystemInfo();
	} 

	static void printSystemInfo() {
		try {

			String ascii = """
                                               
                         @                   
                       @@@                   
                    @@@@    @@               
                  @@@@   @@@                 
                 @@@.   @@@                  
                 @@@     @@@                 
                   @@     @@                 
                     @    @                  
            @@@@                . @@@        
           .@@@@@@@@@@@@@@@@@@     @@@       
              @@@@@@@@@@@@@        @@        
              @@@@@@@@@@@@@@@:   @@@                                   
               -@@@@@@@@@@@@    @@           
        @@@@                 @@@@            
           .@@@@@@@@@@@@@@@@@      .@        
                               .@@@          
               @@@@@@@@@@@@@@@.              
""";

			String user = System.getProperty("user.name");
			String os = System.getProperty("os.name");
			String javaVersion = System.getProperty("java.version");
			String arch = System.getProperty("os.arch");
			
			InetAddress ip = InetAddress.getLocalHost();
			String host = ip.getHostName();

			System.out.println(ascii);

			System.out.println("\n");
			System.out.println("User: " + user);
			System.out.println("Host: " + host);
			System.out.println("Operating System: " + os);
			System.out.println("Arch: " + arch);
			System.out.println("Java: " + javaVersion);
			System.out.println("Time: " + LocalDateTime.now());
			System.out.println("\n");

		} catch (UnknownHostException e) {
			System.out.println("Error getting host info /:");
		}
	}
}