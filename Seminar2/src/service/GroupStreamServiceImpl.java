package service;

import data.GroupStream;
import data.comparators.GroupStreamComparator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService {
    @Override
    public void streamsSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}

