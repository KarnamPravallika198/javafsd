import java.io.Serializable;
public class SerializationDemo implements Serializable{
   private int id;
   private String name;
   private String email;
   private String password;

   public SerializationDemo(int id, String name, String email, String password) {
	   this.id = id;
	   this.name = name;
	   this.email = email;
	   this.password = password;
   }
   public void display() {
	   System.out.println(id+" "+name+" "+email+" "+password);
   }
   public static void main(String[] args) {
	   SerializationDemo sd = new SerializationDemo(1,"prav","prav@123.com","aaa123");
	   sd.display();
   }
}
