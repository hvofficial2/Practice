public class StudentToString {
    String StudentName;
    int rollno;
     StudentToString(String s, int r){
        this.StudentName = s;
        this.rollno = r;
     }

    public String toString(){
        //Object class toString()
        // return getClass().getName()+"@"+Integer.toHexString(hashcode());
        return StudentName+"        "+rollno;
    }

    public static void main(String...args){
        StudentToString s1 = new StudentToString("Dhoni", 01);
        StudentToString s2 = new StudentToString("Virat", 02);
        StudentToString s3 = new StudentToString("Sachin", 03);        
    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }    
}
