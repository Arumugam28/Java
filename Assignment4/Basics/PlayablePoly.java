interface Playable{
    void play();
}

class Guitar implements Playable{
    public void play(){
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("Playing the piano");
    }
}

public class PlayablePoly{
    public static void main(String args[]){
        Playable p;

        p=new Guitar();
        p.play();

        p=new Piano();
        p.play();
    }
}
