import java.net.*;


public class InetDemo 
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress i=InetAddress.getLocalHost();
		System.out.println(i);
		i=InetAddress.getByName("osborne.com");
		System.out.println(i);
		InetAddress arr[]=InetAddress.getAllByName("www.nba.com");
		for(int j=0;j<arr.length;j++)
			System.out.println(arr[j]);
		
		System.out.println("Host name "+i.getHostAddress());
		
		
	}

}
