package mobile;

public class mobile {
	public  void sentmessage() {
		System.out.println("sent a message");
	}
	public  void sharedocument() {
		System.out.println("sent a document");
		
	}
	public  void videocall() {
		System.out.println("video call");
		
	}
public  void audiocall() {
	System.out.println("audio call");
	
}
public static void main(String[] args) {
	//className objectName = New className();
	mobile obj=new mobile();
	//objectna.methodname(related)
	obj.sentmessage();
	obj.sharedocument();
	obj.videocall();
	obj.audiocall();
}
}
