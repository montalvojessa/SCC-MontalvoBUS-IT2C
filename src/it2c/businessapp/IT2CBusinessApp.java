
package it2c.businessapp;

import java.util.Scanner;

public class IT2CBusinessApp {
     
    

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String response;
        
        
        do{
        System.out.println("-------------------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("-------------------------------------");

        System.out.print("Enter Action: ");
        int option = sc.nextInt();
        IT2CBusinessApp business = new IT2CBusinessApp();

        
      
         switch(option){

            case 1:
                business.addCustomer();
                break;
            case 2:
                business.viewBusiness();
                break;
            case 3:
                business.updateCustomer();
                break;
            case 4:
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid action. Please Try Again.");
                    }

            System.out.println("Do you want to continue?(Y/N1): ");
            response = sc.next();
        }while(response.equals("yes"));

    }
     public void addCustomer(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
         
       
        System.out.print("Enter Business Name: ");
        String name = sc.next();
        System.out.print("Enter Business Type: ");
        String type = sc.next();
        System.out.print("Enter Business Address: ");
        String add = sc.next();
        System.out.print("Contact: ");
        String cont = sc.next();

        String sql = "INSERT INTO bus (b_name, b_type, b_address, b_contact) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, name, type, add, cont);
    }

private void viewBusiness() {
         config conf = new config();
        String votersQuery = "SELECT * FROM bus";
        String[] votersHeaders = {"ID", "Name", "Type", "Address", "Contact"};
        String[] votersColumns = {"b_id", "b_name", "b_type", "b_address", "b_contact"};
        
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }

    private void updateCustomer() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter ID: ");
        
        
        
    }

}

