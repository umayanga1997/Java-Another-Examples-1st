
import java.util.Scanner;

public class Java extends UserMainCode{

	public static void main(String[] args) {
		add add_object = new add();
		
		Scanner scanner_variable = new Scanner(System.in);
		System.out.println("Enter Age here :");
		int Age = scanner_variable.nextInt();
		
		
		add_object.set_age(Age);
		add_object.saying();
                
                
                int x = 1;
        
        while (x!=0) {            
            Scanner sc = new Scanner(System.in);
                String s1 = sc.nextLine();
                int n = UserMainCode.display(s1);
                if(n==1){
                    x = 0;
                    System.out.println("Valid password");
                }else{
                    System.out.println("Invalid password");
                }
        }
                
     
    
		
	}

}




class UserMainCode {
   
    public static int display(String password){
        
        if(password.matches(".*[0-9]{2,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
                    {
                                    return 1;
                    }
                    else
                    {
                                    return -1;
                    }
       }

    }