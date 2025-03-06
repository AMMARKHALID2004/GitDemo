package main.LoginSystem;
import java.util.Scanner;
import users.UserManager.java;
public class LoginSystem{
	
	public static void main(String args[]){
	String pass;
	String Email;
	Scanner sc=new Scanner(System.in);
	Scanner sa=new Scanner(System.in);
	System.out.println(" Please Enter Your Email:");
	Email=sc.nextLine();
	System.out.println("Please Enter Your Password:");
	pass=sa.nextLine();
	if(Email.equals(UserManager.email)){
	System.out.println("Credentials are correct and you have been verified");
	




}




}
}