package Subject;

import Observer.IAnnouncementListener;

public interface ISchoolAnnouncementBoard{

    public void attach(IAnnouncementListener person);
    public void detach(IAnnouncementListener person);
    public void notifyAll(String message);
    public void notifyStudents(String message);
    public void notifyTeachers(String message);
    
}

