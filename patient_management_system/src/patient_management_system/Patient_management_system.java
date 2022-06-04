package patient_management_system;

import static java.lang.System.exit;
import java.util.Scanner;

public class Patient_management_system {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         char cho;
        patient[] p = null;
 do{ 
    System.out.println("\t\t**** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE");
    System.out.println("\t\tEnter Your Choice Sir/Madam\n");
    System.out.println("\t\t\tPress  1) To Record a patiants in to the System ");
    System.out.println("\t\t\tPress  2) To Searech Patients Recorded So Far in the System ");
    System.out.println("\t\t\tPress  3) To Update Patients Recorded So Far in the System ");
    System.out.println("\t\t\tPress  4) To Delete Patients from the System ");
    System.out.println("\t\t\tPress  5) To Display Patients Recorded in the System ");
    System.out.println("\t\t\tPress  6) To See the developers of the System ");
    System.out.println("\t\t\tPress  7) To Exit form the system\n ");
    System.out.println("\t\t**** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE");
        int  choice=in.nextInt();
        switch(choice){
            case 1:   
            System.out.println("Enter the Size of Patient that you want to add");
            int size=in.nextInt();
            p = new patient[size];
               patient_Rcored(p);
                break;
            case 2:  
                search_Patient(p);
                break;
            case 3:
               update_patient(p);
                break;
            case 4:
                delete(p);
                break;
           case 5:
                  display(p); 
               break;
           case 6:
               Developers();
               break;
           case 7:
            exit(0);
                break;
            default:
                System.out.println("Wrong choise pleas Enter again");
                  }
        System.out.println("sir/madam Do You want to Continue (Yes/No)");
        cho=in.next().charAt(0);
        
         } while(cho=='y'||cho=='Y');
}
public static void patient_Rcored(patient[] p){
   try{
     System.out.println("\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
     System.out.println("\t\t%%              Well Come               %%");
     System.out.println("\t\t%%      This is patients  record page   %%");         
     System.out.println("\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    Scanner in=new Scanner(System.in);
    for(int i=0;i<p.length;i++){
        p[i] = new patient();
       System.out.println("Enter the" + " " +(i+1)+" Patient Name ");
       p[i].name=in.next();
       System.out.println("Enter the" + " " +(i+1)+" Patient Age");
       p[i].age=in.nextInt();
       System.out.println("Enter the" + " " +(i+1)+" Patient MRN");
       p[i].id=in.nextInt();
       System.out.println("Enter the" + " " +(i+1)+" Patient Kebele");
       p[i].kebele=in.nextInt();
       System.out.println("Enter the" + " " +(i+1)+" Patient Weight");
       p[i].weight=in.nextDouble();
       System.out.println("Enter the" + " " +(i+1)+" Patient Heihgt");
       p[i].heihgt=in.nextDouble(); 
       System.out.println("Enter the" + " " +(i+1)+" Patient Deases");
       p[i].deases=in.next();
    }
   }
   catch(Exception i){
           System.out.println("Input Mismatch Exception occured pleas try again");
           }
}
  public static void display(patient[] p){
      try{
      System.out.println("\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("\t\t%%              Well Come                %%");
      System.out.println("\t\t%%       This is patients recored so far %%");         
      System.out.println("\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");  
      System.out.println("Name : "+"\t | "+"   MRN : "+"\t | "+"   Age : "+"\t | "+"   Kebele : "+"\t | "+"   Weight :"+"\t | "+"   Heihgt : "+"\t | "+"   Deases :"+"\t | ");
        for(int i=0; i < p.length; i++)
        {
            System.out.println(p[i].Display());
        }
      }
        catch (NullPointerException d){
          System.out.println("There is not recoreded Patient in the list");
                }
    }
  public static void search_Patient(patient[] p){
      boolean isFound = false;
      try{
           Scanner in=new Scanner(System.in);
           System.out.println("Enter the patiet ID");
            int n;
           n=in.nextInt();
           for(int i=0;i<p.length;i++){ 
           if(n==p[i].id){
System.out.println("It is found");
System.out.println("Name : "+p[i].name+"\t |"+" age : "+p[i].age+"\t |"+" id : "+p[i].id+"\t |"+"kebele : "+p[i].kebele+"\t |"+"deases : "+p[i].deases);
isFound = true;
break;
    }
           }
      }
           catch (NullPointerException S){
              System.out.println("There is not recoreded Patient in the list");
                   }
       catch(Exception i){
           System.out.println("Input Mismatch Exception occured pleas try again");
           }
      if(isFound == false) {
          System.out.println("It is Not found/Incorrect MRN ");
      }
  }
  public static void update_patient(patient[] p){
      boolean isFound = false;
     try{  
            String de;
            int n;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the patient ID to be Updated");
            n=in.nextInt();
           for(int i=0;i<p.length;i++){  
            if(n==p[i].id){
            System.out.println("Enter the new patient's deases to be Updated");
            de=in.next();
            System.out.println("The process to Updated the deases from "+p[i].deases +" to "+de+" is sucsessfully Done");
            p[i].deases=de; 
            isFound = true;
            break;
            }
     }
     }
           catch(NullPointerException U){
           System.out.println("There is not recoreded Patient in the list");
                   }
      catch(Exception i){
           System.out.println("Input Mismatch Exception occured pleas try again");
           }
           if(isFound == false) {
          System.out.println("Not found /Incorrect MRN ");
     }
  }
  public static void delete(patient[] p){
       boolean isFound = false;
     try{  
            int n;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the patient ID to be Deleted");
            n=in.nextInt();
           for(int i=0;i<p.length;i++){  
            if(n==p[i].id){
          System.out.println("Oh !!! Sorry RIP");
          p[i].name="";
          p[i].age=0;
          p[i].id=0;
          p[i].kebele=0;
          p[i].weight=0; 
          p[i].heihgt=0;
          p[i].deases="";
System.out.println("Name : "+p[i].name+"\t |"+" age : "+p[i].age+"\t |"+" id : "+p[i].id+"\t |"+"kebele : "+p[i].kebele+"\t |"+
        " weight :"+p[i].weight+"\t |"+" heihgt :"+p[i].heihgt+"\t |"+"deases : "+p[i].deases);
            isFound = true;
            break;
            }
     }
     }
           catch(NullPointerException U){
           System.out.println("There is not recoreded Patient in the list");
                   }
      catch(Exception i){
           System.out.println("Input Mismatch Exception occured pleas try again");
           }
           if(isFound == false) {
          System.out.println("Not found /Incorrect MRN ");
     }
  }
  public static void Developers(){
  System.out.println("\t\t**** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE");
  System.out.println("\t\t***************************DEVELOPERS************************************");
  System.out.println("\t\t**************************KIoT Student***********************************");
  System.out.println("\t\tHabtamu Kenaw ....................................................1347/10");
  System.out.println("\t\tGuled Ali ........................................................1336/10");
  System.out.println("\t\tHiluf Meressa.....................................................1463/10");
  System.out.println("\t\tMillion Alemu.....................................................0584/10");
  System.out.println("\t\tBezawit Solomon ..................................................0541/10");
  System.out.println("\t\tAnwar Yusuf.......................................................1527/09");
  System.out.println("\t\t                                                 To :- Eyuele Hayle      ");
  System.out.println("\t\t**** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE ***** SOFTWARE");
  }
} 