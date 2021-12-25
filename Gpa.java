import java.util.*;
class Gpa
{  
   
   public static void main(String args[]){
  
    String sub[]={"graphics","pps","java","chemistry","english","technical skills","data structures"};
    double credits[]={2,4,3,3,2,1.5,4};
    int points=0;
    double gpa=0,tcr=0;
    for(int i=0;i<7;i++)
    { 
       System.out.println("enter the grades of"+sub[i]+":");
       Scanner s=new Scanner(System.in);
       char ch=s.next().charAt(0);
       switch(ch)
       {  
          case 'O' : points=10;
                     break;
          case 'A' : points=9;
                     break;
          case 'B' : points=8;
                     break;
          case 'C' : points=7;
                     break;
          case 'D' : points=6;
                     break;
          case 'E' : points=5;
                     break;
          default  : System.out.println("entered wrong grade");
       }
       if(points==0)
       {  
         System.out.println("You can't get grade");
          break;
       }
       else {
		tcr=tcr+credits[i];
       
       		gpa+=(points*credits[i]);
      
       }
       
  }
  double sgpa=gpa/tcr;
  System.out.println("SGPA of students is"+sgpa);
  System.out.println("Total credits of student is"+tcr);

}
}














