public class NewsListner implements Observer {
        private String name;

        public NewsListner(String name) {
            this.name = name;
        }
        public void Subscribe(NewsChannel newsChanel) {
            newsChanel.registerObserver(this);
        }
        public void Unsubscribe(NewsChannel newsChanel) {
            newsChanel.removeObserver(this);
        }

        @Override
        public void update(String news) {
            System.out.println("Пользователь '" + name + "' получил новость: " + news);
        }
        
    
}
