package observer;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Observed{
    List<String> books = new ArrayList<>();
    List<Observer> clients = new ArrayList<>();
    public void addBook(String book){
        this.books.add(book);
        notifyObservers();
    }
    public void removeBook(String book){
        this.books.remove(book);
        notifyObservers();
    }
    @Override
    public void removeObserver(Observer observer) {
        this.clients.remove(observer);
    }
    @Override
    public void addObserver(Observer observer) {
        this.clients.add(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer: clients){
            observer.handleEvent(this.books);
        }
    }
}
