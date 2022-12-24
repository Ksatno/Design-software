import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         //Теоретически можем создать несколько разных каналов
        var newsChannel = new NewsChannel(); 
        //Заводим пользователей
        var Listner1 = new NewsListner("Валерий Петрович");
        var Listner2 = new NewsListner("Светлана Петровна");
        var Listner3 = new NewsListner("Сыр Камамбер");
        //Подписываем их на нужный новостной канал
        Listner1.Subscribe(newsChannel); 
        Listner2.Subscribe(newsChannel); 
        Listner3.Subscribe(newsChannel); 
        //Можем так же и отписать их
        Listner3.Unsubscribe(newsChannel);
        while (true) {
            //Пользователи получают новости, введенные в терминал
            String news= in.nextLine();
            newsChannel.setNews(news);
        }
        
    }
}
