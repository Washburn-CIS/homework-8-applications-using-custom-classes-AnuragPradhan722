import java.util.Scanner;

public class GradeBook {
    private static Student[] students;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        students = new Student[] { new Student(), new Student() };
        students[0].setFirstName("Alan");
        students[1].setFirstName("Ada");
        students[0].setLastName("Turing");
        students[1].setLastName("Lovelace");
        students[0].setGrade(95);
        students[1].setGrade(87);

        System.out.println("Welcome to the CM111 Grade Book App!");

        while(true) {
            System.out.println("\nPlease make a selection:\n");
            System.out.println("1) List Class Grades");
                        System.out.println("2) Update Student Grade");
            System.out.println("3) Exit");
            System.out.print("\nPlease choose an option: ");
            String choice = input.nextLine();
            System.out.println();
            switch(choice) {
                case "1": // TODO: write a loop that, for each student prints 
                          //       lname, fname: grade 
                    for (Student student : students) {
                        System.out.println(student.getLastName() + ", " + student.getFirstName() + ": " + student.getGrade());
                    }
                    break;
        
                case "2":
                     System.out.print("Enter the first name of the student to update: ");
                    String firstName = input.nextLine();
                    boolean found = false;

                     for (Student student : students) {
                        if (student.getFirstName().equalsIgnoreCase(firstName)) {
                            System.out.print("Enter the new grade for " + student.getFirstName() + " " + student.getLastName() + ": ");
                            double newGrade = Double.parseDouble(input.nextLine());
                            student.setGrade(newGrade);
                            System.out.println("Grade updated!");
                            found = true;
                            break;
                        }
                     }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");

                // Challenge: write another option to allow updating grades for a selected student
            }
        }
    }
}
