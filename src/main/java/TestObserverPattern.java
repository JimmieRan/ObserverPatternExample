/**
 * ${DESCRIPTION}
 * <p> User: ran
 * <p> Date: 2017/7/9
 * <p> Version: 1.0
 */
public class TestObserverPattern {

    public static void main(String[] args) {

        JobSubscriber ken = new JobSubscriber("Ken");
        JobSubscriber jimmie = new JobSubscriber("Jimmie");
        JobSubscriber tom = new JobSubscriber("Tom");

        HeadCounter headCounter = new HeadCounter();
        headCounter.registerObserver(ken);
        headCounter.registerObserver(jimmie);
        headCounter.registerObserver(tom);
        headCounter.publishJob("XXX公司招聘Java工程师");


    }

}
