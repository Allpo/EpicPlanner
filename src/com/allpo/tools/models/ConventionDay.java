package com.allpo.tools.models;

import java.util.Date;
import java.util.List;

public class ConventionDay {
    private final List<StaffMember> staffMembers;
    private final Date contestStartTime;
    private final Date contestEndTime;

    private final static int MIN_STAFF_CHANGING_G = 2;
    private final static int MIN_STAFF_CHANGING_B = 1;

    public ConventionDay(List<StaffMember> staffMembers, Date contestStartTime, Date contestEndTime) {
        this.staffMembers = staffMembers;
        this.contestStartTime = contestStartTime;
        this.contestEndTime = contestEndTime;
    }
}
