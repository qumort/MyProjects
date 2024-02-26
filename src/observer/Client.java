package observer;

import java.util.List;

public class Client implements Observer{
    public String name;
    public Client(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> books) {
        System.out.println("Dear " + name + ", we have some updates!");
    }
}
