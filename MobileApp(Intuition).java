//INTUITION MOBILE APP (For study purpose that how things work using interfaces and classes & how to secure our app)
interface Gps{
    void TrackLocation();
}
interface camera{
    void TakeSnap();
    void Record4kVideo();
}

interface Mp3player{
    default void setprofile(){
        System.out.println("Your Media Profile has been Set!");
    }
    void playMusic();
}
//suppose we have phone for just holding contact details and calling purpose
class phone{
    void on(){
        System.out.println("The boot system phone is being initiated....");
    }
    void contactDetails(){
        System.out.println("Contact Log :");
    }
}
//As it is a smartphone it would do contain more apps like mp3 player ,Gps system app,camera & many more
class smartphone extends phone implements Gps,camera,Mp3player{
     public void TakeSnap(){
         System.out.println("Taking snap...");
     }
     public void Record4kVideo(){
         System.out.println("Recording 4k video...");

     }
     public void TrackLocation(){
         System.out.println("Tracking Location");

     }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class Main{
    public static void main(String[] args) {
        //for example we just wanna give access to mp3player  for a particular person then we use reference of Mp3player and create smartphone class obj
        Mp3player person = new smartphone();//person can only access his overriden methods in smartphone
        person.setprofile();
        person.playMusic();
//        person.on();//would give an error you can't access out of scope of reference of an interface
        smartphone s = new smartphone();
        System.out.println("\nSmartphone Functionalities : ");
        //but smartphone will have access to every single overriden method in interfaces
        s.on();
        s.playMusic();
        s.Record4kVideo();
        s.setprofile();
        s.TakeSnap();
        s.contactDetails();
        s.TrackLocation();
    }
}
