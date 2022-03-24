import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class project_2 {
	public static void main(String[] args) {
		boolean flag= false;
		String[] listOfMails = {"ken123@email.com","rana456@email.com","raj245@email.com",
				                "jinnu335@email.com","jimmy324@email.com","george124@email.com",
				                "lisa678@email.com","john789@email.com","lolly987@email.com"};
		System.out.println("Enter the email-id: ");
		Scanner sc = new Scanner(System.in);
		String Email_Id = sc.next();
		String pattern = "[a-z]{1,15}[0-9]{1,5}@email.com";
		Pattern p1 = Pattern.compile(pattern);
		Matcher matcher = p1.matcher(Email_Id);
		if(matcher.matches() == false) {
    		System.out.println("Enter valid Email-Id");
    	}
		else {
		System.out.println("The email you have entered is: "+Email_Id);
		Email_Id = Email_Id.replace(".","");
		for(int i=0;i<listOfMails.length;i++) {
			listOfMails[i] = listOfMails[i].replace(".","");
				if(listOfMails[i].equals(Email_Id)) {
					flag = true;
					break;
				}
		}
		if(flag) {
    		System.out.println("The email-id is present in the list");
		}
		else {
			System.out.println("The email-id is not present in the list");
		
		}
	}
	}
}
