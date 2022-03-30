import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int grade;
	
    System.out.print("Enter grade: "); 
    grade = scan.nextInt();   
    
	if(grade>=90 && grade<=100){
		System.out.println("A");
	}
	else if(grade>=80 && grade <=89){
		System.out.println("B+");
	}
		else if(grade>=70&& grade <=79){
			System.out.println("B");
		}
		else if(grade>=60&& grade <=69){
			System.out.println("C+");
		}
		else if(grade>=55&& grade <=59){
			System.out.println("C");
		}
		else if(grade>=50&& grade <=54){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
  }
}