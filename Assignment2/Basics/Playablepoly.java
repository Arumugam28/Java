interface Playable{
    void play();
}
class Guitar implements Playable{

    public void play() {
        System.out.println("The guiter is playing");
    }
    
}
class Piano implements Playable{
    public void play(){
        System.out.println("The piano is playing");
    }
}
public class Playablepoly{
     public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play(); 
        piano.play();  
     }
}

