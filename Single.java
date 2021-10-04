package edu.najah.cap.ass3;
import java.util.*;
import java.util.ArrayList;
@SuppressWarnings("unused")

public class Single {
public static void main(String[] args) {
		
		Connections httpConnection1 = Connections.getInstance(Connections.http); 
		Connections httpConnection2 = Connections.getInstance(Connections.http); 
		Connections scpConnection1 = Connections.getInstance("scp"); 
		Connections telnetConnection1 = Connections.getInstance("telnet"); 
		Connections sshConnection1 = Connections.getInstance("ssh"); 
		Connections scpConnection2 = Connections.getInstance("scp"); 

        boolean isReleased = Connections.release(Connections.http); 
		if(Connections == null) {
			return true;
		}
		
		Connections ftpConnection11 = Connections.getInstance("ftp"); 

		if(httpConnection1 == httpConnection2) { 
            return true;
		}; 
		
		ArrayList<String> current= Connections.getCurrentConnection(); 
		system.out.println(current);
		
             scpConnection2.send("hi");
            ftpConnection11.send("hi");	
        }

}
