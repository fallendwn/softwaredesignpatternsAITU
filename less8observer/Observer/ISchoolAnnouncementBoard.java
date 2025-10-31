package Observer;

import Subject.IAnnouncementListener;

public interface ISchoolAnnouncementBoard{

    public void attachStudent(IAnnouncementListener student);
    public void detachStudent(IAnnouncementListener student);
    public void attachTeacher(IAnnouncementListener teacher);
    public void detachTeacher(IAnnouncementListener teacher);
    public void notifyAll(String message);
    public void notifyStudents(String message);
    public void notifyTeachers(String message);
    
}

