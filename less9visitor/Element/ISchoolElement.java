package Element;

import Visitor.ISchoolVisitor;
public interface ISchoolElement{

    public void accept(ISchoolVisitor visitor);

}

