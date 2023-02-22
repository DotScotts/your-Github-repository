
package status;

/**
 * 
 * this is the main file for the status app
 * MidTerm-Exam
 * @author srinivsi
 * @author Scott Sharrard
 */

import java.util.Scanner;
public class StatusUser {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0, 1, 2, 3): ");
        int code = in.nextInt();
        Status statusUser = new Status();
        
        switch (code) {
            case 0:
                statusUser.printUserStatus(Status.UserStatus.REJECTED);
                break;
            case 1:
                statusUser.printUserStatus(Status.UserStatus.PENDING);
                break;
            case 2:
                statusUser.printUserStatus(Status.UserStatus.PROCESSING);
                break;
            case 3:
                statusUser.printUserStatus(Status.UserStatus.APPROVED);
                break;
            default:
                System.out.println("Invalid status code!");
                break;
        }
    }
}
   

