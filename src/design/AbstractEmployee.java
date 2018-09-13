package design;

public abstract class AbstractEmployee  implements Employee{

    public String Name = "Subhra";
    public void Address(){
        System.out.println(Name+" 48-13 67th street");
    }
    public void vacation(){
        System.out.println("Every Employee will get a paid vacation");
    }

}
