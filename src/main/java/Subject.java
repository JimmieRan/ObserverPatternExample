/**
 * ${DESCRIPTION}
 * <p> User: ran
 * <p> Date: 2017/7/9
 * <p> Version: 1.0
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyAllObservers();


}
