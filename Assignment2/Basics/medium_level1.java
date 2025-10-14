public class medium_level1 {
    public static void main(String[] args) {
        faculty f = new faculty();
        f.view();
        f.setfacultydetails("Dinesh","26/5/1992", "871981891");
        f.displayfaculty();   
        students s = new students();
        s.setstudentdetails("Arumugam B", "28/02/2005", "953622244008");
        s.displaystudents();
        
        
    }
}
    class college{
        public void view(){
            System.out.println("View faculty ans students details");
        }
    }
    class faculty extends college{
        String facultyname;
        String facultyDOB;
        String facultyid;
        public void setfacultydetails(String facultyname,String facultyDOB,String facultyid){
            this.facultyname = facultyname;
            this.facultyDOB = facultyDOB;
            this.facultyid = facultyid;
        }
        public void displayfaculty(){
            System.out.println("Faculty Name : "+facultyname);
            System.out.println("Faculty DOB : "+facultyDOB);
            System.out.println("Faculty ID : "+facultyid);
        }
    }
    class students extends college{
        String studentname;
        String studentDOB;
        String studentid;
        public void setstudentdetails(String studentname,String studentDOB,String studentid){
            this.studentname = studentname;
            this.studentDOB = studentDOB;
            this.studentid = studentid;
        }
        public void displaystudents(){
            System.out.println("Student Name : "+studentname);
            System.out.println("Student DOB : "+studentDOB);
            System.out.println("Student ID : "+studentid);
        }
    }
    
