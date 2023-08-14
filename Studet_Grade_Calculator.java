import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the mark of all subject: ");
        int totalMarkOfAllSubject=0;
        for(int i=0;i<5;i++){
            System.out.print("Subject: ");
            String sb =  sc.next();
//            System.out.println();
            System.out.print("Mark: ");
            int mark = sc.nextInt();
//            System.out.println();
            arr.add(mark);
        }
        for(int i=0;i<arr.size();i++){
            totalMarkOfAllSubject+=arr.get(i);
        }
        if((totalMarkOfAllSubject/arr.size())>=90 && (totalMarkOfAllSubject/arr.size())<=100){
            System.out.println("The total mark obtain is: "+totalMarkOfAllSubject);
            System.out.println("The average percentage is: "+(totalMarkOfAllSubject/arr.size()+"%"));
            System.out.println("The Grade is: "+'A');
        }
        else if((totalMarkOfAllSubject/arr.size())>=80 && (totalMarkOfAllSubject/arr.size())<90){
            System.out.println("The total mark obtain is: "+totalMarkOfAllSubject);
            System.out.println("The average percentage is: "+(totalMarkOfAllSubject/arr.size()+"%"));
            System.out.println("The Grade is: "+'B');
        }
        else if((totalMarkOfAllSubject/arr.size())>=70 && (totalMarkOfAllSubject/arr.size())<80){
            System.out.println("The total mark obtain is: "+totalMarkOfAllSubject);
            System.out.println("The average percentage is: "+(totalMarkOfAllSubject/arr.size()+"%"));
            System.out.println("The Grade is: "+'C');
        }
        else{
            System.out.println("The total mark obtain is: "+totalMarkOfAllSubject);
            System.out.println("The average percentage is: "+(totalMarkOfAllSubject/arr.size()+"%"));
            System.out.println("The Grade is: "+'D');
        }
    }
}