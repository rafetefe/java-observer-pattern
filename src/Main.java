public class Main {
    public static void main(String[] args) {

        Subject subject = new SubjectImplementation();
        Observer obA = new ObserverImplementation();
        Observer obB = new ObserverImplementation2();

        subject.notifyObservers("No Listener");

        subject.registerObserver(obA);

        subject.notifyObservers("Message for A");

        subject.registerObserver(obB);
        subject.notifyObservers("Message for all");

        subject.unregisterObserver(obB);
        subject.notifyObservers("B removed, message for A");
    }
}