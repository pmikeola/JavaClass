
class Student {
      int studentId;
      String studentName;

}// END OF STUDENT CLASS


class ClassDemo2{// This class is main class (class with main method)
    public static void main(String[] args){

// STEP 2

  Student s1= new Student();
  Student s2= new Student();
  Student s3= new Student();
// STEP 3


s1.studentId = 1;
s1.studentName = "Michael";
s2.studentId = 2;
s2.studentName = "Mike";
s3.studentId = 3;
s3.studentName = "Segun";

//STEP 4


System.out.println(s1.studentId);
System.out.println(s1.studentName);

System.out.println(s2.studentId);
System.out.println(s2.studentName);

System.out.println(s3.studentId);
System.out.println(s3.studentName);
 }
}