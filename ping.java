//pings ip (local)
import java.io.*; 
import java.net.*; 
import java.util.Scanner;
  
class ping
{ 
  public static void sendPingRequest(String ipAddress) throws UnknownHostException, IOException 
  { 
    InetAddress ip = InetAddress.getByName(ipAddress);
    if (ip.isReachable(5000)) 
      System.out.println("Host is reachable"); 
    else
      System.out.println("Cannot reach host"); 
  }

  public static void main(String[] args) throws UnknownHostException, IOException 
  {
    Scanner sc0 = new Scanner(System.in);
    System.out.println("Avail. Hosts:");
    System.out.println("192.168.68.139 -- sriram (LinuxMintLaptop)");
    System.out.println("192.168.68.132 -- ubuntu (RaspberryPi Ubuntu LTS)");
    System.out.println("192.168.68.135 -- Macbook (Macbook)");
    System.out.println("Enter IP:");
    String ipAddress = sc0.nextLine(); 
    sendPingRequest(ipAddress);
  } 
}