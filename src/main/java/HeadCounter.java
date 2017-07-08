import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 * <p> User: ran
 * <p> Date: 2017/7/9
 * <p> Version: 1.0
 */
public class HeadCounter implements Subject {

    private List<Observer> observerList = null;

    private List<String> jobList = null;

    public HeadCounter() {
        observerList = new ArrayList<>();
        jobList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }


    public void publishJob( String jobInfo ){
        jobList.add(jobInfo);
        notifyAllObservers();
    }

    @Override
    public String toString() {
        return jobList.toString();
    }
}
