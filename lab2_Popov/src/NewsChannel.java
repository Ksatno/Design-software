import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Observable {
    private List<Observer> observers;
    private String news;

    public NewsChannel(){
        observers = new ArrayList<>();
    }

    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers)
        observer.update(this.news);
    }
}
