public class Test{


	public static void main(String args[]){

	Person p1=new Person("Ali",20,6.2);
	Person p2=new Person("Asian","Islam","Pakistani");
	Person p3=new Person("Male","Lahore","Asghar");

	System.out.printf("Name:%s\n",p1.name);
	System.out.printf("Age:%d\n",p1.age);
	System.out.printf("Height:%f\n",p1.height);


	System.out.printf("Ethnicity:%s\n",p2.ethnicity);
	System.out.printf("Religion:%s\n",p2.religion);
	System.out.printf("Nationality:%s\n",p2.nationality);

	System.out.printf("Gender:%s\n",p3.gender);
	
	System.out.printf("City:%s\n",p3.city);
	
	System.out.printf("Father Name:%s\n",p3.fathername);
		
		



}









}