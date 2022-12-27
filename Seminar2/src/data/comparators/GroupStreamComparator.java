package data.comparators;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int gr1 = o1.getStudentsGroup().size();
        int gr2 = o2.getStudentsGroup().size();
        return Integer.compare(gr1, gr2);
    }
}


