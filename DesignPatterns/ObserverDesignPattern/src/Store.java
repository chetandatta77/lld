import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]){
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("xy1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("3749273", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);


        iphoneStockObservable.setStockCount(10);
    }
}
