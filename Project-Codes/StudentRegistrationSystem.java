import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {

        welcome();

   Scanner sc = new Scanner(System.in);

   System.out.println("How many students do you want to register?");
    int students = sc.nextInt();

    sc.nextLine();

    int children =0;
    int teens =0;
    int adults = 0;

    int totalAge =0;

   for( int i =1; i <= students; i++){
       System.out.println("Enter student name:");
       String name = sc.nextLine();

       System.out.println("Enter student age:");
       int age = sc.nextInt();

       sc.nextLine();

       totalAge +=age;

       String message;

       if(age < 13) {
           message = "Child"; children++;
       }
       else if(age >= 13 && age <= 17){
           message = "Teen"; teens++;
       }
       else{
           message = "Adult";  adults++;
       }

        System.out.println("---------------------------------");
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Category: " + message );
        System.out.println("--------------------------------");

    }

    double averageAge=(double) totalAge / students;

   System.out.println("Children: " + children);
   System.out.println("Teens: " + teens);
   System.out.println("Adults: " + adults);

   System.out.println("Total Age: " + totalAge);
   System.out.println("Average: " + averageAge);

   System.out.println("Registration Finished");

   sc.close();

    }
    static void welcome(){System.out.println("Welcome to Student Registration System");}
}
