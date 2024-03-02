import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SubjectImplementation implements Subject<String>{

    private final Set<Observer<String>> observers =
            new CopyOnWriteArraySet<>();
    /*
    * Thread safe set implementation that
    * creates a new copy of its elements each time
    * the update operation happens.
    * //TODO test with hashSet, or other sets.
    * */

    @Override
    public void registerObserver(Observer<String> observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer<String> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        observers.forEach(
                observer -> observer.observe(event)
        );
    }
}
