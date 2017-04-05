/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package gradecalculator;
import java.util.Scanner;
/**
 *
 * @author miwoj2051
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int percentage;  
      Scanner input = new Scanner (System.in);
      
      System.out.print("Enter the percentage:");
      percentage = input.nextInt();
      
      switch (percentage) {
        case 100:
        case 99:
        case 98:    
        case 97:    
        case 96:    
        case 95:    
        case 94:   
        case 93:    
        case 92:    
        case 91:               
	case 90:System.out.println("The corresponding letter grade is A+"); break;
        case 89:
        case 88:
        case 87:
        case 86: 
        case 85:System.out.println("The corresponding letter grade is A"); break;
        case 84: 
        case 83:
        case 82: 
        case 81:  
	case 80:System.out.println("The corresponding letter grade is A-"); break;
        case 79:
        case 78:
        case 77:System.out.println("The corresponding letter grade is B+"); break;
        case 76: 
        case 75:
        case 74: 
        case 73:System.out.println("The corresponding letter grade is B"); break;
        case 72: 
        case 71:
        case 70:System.out.println("The corresponding letter grade is B-"); break;
        case 69:
        case 68:
        case 67:System.out.println("The corresponding letter grade is C+"); break;
        case 66: 
        case 65:
        case 64: 
        case 63:System.out.println("The corresponding letter grade is C"); break;
        case 62: 
        case 61:
        case 60: System.out.println("The corresponding letter grade is C-"); break;
        case 59:
        case 58:
        case 57:System.out.println("The corresponding letter grade is D+"); break;
        case 56: 
        case 55:
        case 54: 
        case 53:System.out.println("The corresponding letter grade is D"); break;
        case 52: 
        case 51:
        case 50: System.out.println("The corresponding letter grade is D-"); break;
        default: System.out.println ("The corresponding letter grade is F"); break;
      }
        
        // TODO code application logic here
    }
    
}
