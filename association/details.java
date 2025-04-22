package association;

public class details {
    String address;
    person p1;
    details(String address,person p1){
        this.address=address;
        this.p1=p1;
    }
    void show(){
        System.out.println("adress"+address +" name"+p1.name);
    }
}
