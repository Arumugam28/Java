abstract class Univ {
    abstract void departments();
    public void displaydetails(){
        System.out.println("Academic Details");
    }
}
class faculty extends Univ{
    void departments() {
        System.out.println("Faculty Department");
    }

}
class students extends Univ{
    void departments() {
        System.out.println("Students Department");
    }

}
public class AbstractUniv{
    public static void main(String[] args) {
        faculty f = new faculty();
        f.displaydetails();
        f.departments();
        students s = new students();
        s.departments();

    }
}