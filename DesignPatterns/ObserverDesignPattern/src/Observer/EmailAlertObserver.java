package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;

    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in Stock hurry up");
    }

    private void sendEmail(String email, String message) {
        System.out.println("mail sent to - "+ email);
    }
}
