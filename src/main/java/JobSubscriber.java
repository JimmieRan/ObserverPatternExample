/**
 * ${DESCRIPTION}
 * <p> User: ran
 * <p> Date: 2017/7/9
 * <p> Version: 1.0
 */
public class JobSubscriber implements Observer {

    private String name;

    public JobSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name+":收到更新通知！");
        System.out.println(subject.toString());
    }
}
