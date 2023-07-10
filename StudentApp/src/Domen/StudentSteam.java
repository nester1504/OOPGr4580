package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    int streamNumber;
    private List<StudentGroup> groupSteam;


    public StudentSteam(int streamNumber, List<StudentGroup> groupSteam) {
        this.streamNumber = streamNumber;
        this.groupSteam = groupSteam;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StudentGroup> getGroup() {
        return groupSteam;
    }

    public void setGroup(List<StudentGroup> group) {
        this.groupSteam = group;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

            private int counter;

            @Override
            public boolean hasNext() {
                if (counter < groupSteam.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return groupSteam.get(counter++);
            }

        };
    }
}



