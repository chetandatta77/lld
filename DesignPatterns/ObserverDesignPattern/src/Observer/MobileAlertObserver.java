package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String mobileNumber;

    StockObservable observable;

    public MobileAlertObserver(String mobileNumber, StockObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSms(mobileNumber,"Product is in Stock");
    }

    private void sendSms(String mobileNumber, String message) {
        System.out.println("Message sent to this "+ mobileNumber);
    }
}
