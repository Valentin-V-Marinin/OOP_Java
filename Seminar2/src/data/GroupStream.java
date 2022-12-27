package data;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentsGroup;
    private String name;

    public GroupStream(List<StudentGroup> studentsGroup, String name) {
        this.studentsGroup = studentsGroup;
        this.name = name;
    }

    public List<StudentGroup> getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(List<StudentGroup> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        Iterator<StudentGroup> sgi = new Iterator<StudentGroup>() {
            int idx = 0;

            @Override
            public boolean hasNext() {
                return idx < studentsGroup.size();
            }

            @Override
            public StudentGroup next() {
                return studentsGroup.get(idx++);
            }
        };
        return sgi;
    }

}
