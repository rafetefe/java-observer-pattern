public class ObserverImplementation2 implements Observer<String>{
    @Override
    public void observe(String event){
        System.out.println("Observer B says:"+event);
    }
}
