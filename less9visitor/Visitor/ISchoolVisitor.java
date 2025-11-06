package Visitor;

import ConcreteElement.*;

public interface  ISchoolVisitor {
    
    public void visit(Student student);
    public void visit(Teacher teacher);
    public void visit(Classroom classroom);

}
