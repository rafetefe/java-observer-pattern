public class ObserverImplementation implements Observer<String>{
    @Override
    public void observe(String event){
        System.out.println("Observer A says:"+event);
    }
}
