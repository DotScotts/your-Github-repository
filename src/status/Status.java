/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * class used by status app
 * MidTerm-Exam
 * @author srinivsi
 * @author Scott Sharrard
 */

public class Status {
    
    // Added enums to simpilfy input & create data type
    
    public enum UserStatus {
        REJECTED("REJECTED"),
        PENDING("PENDING"),
        PROCESSING("PROCESSING"),
        APPROVED("APPROVED");
        
        private final String status;
        
        private UserStatus(String status) {
            this.status = status;
        }
        
        public String getStatus() {
            return status;
        }
    }
    
    public void printUserStatus(UserStatus status) {
        System.out.println(status.getStatus());
    }
}
