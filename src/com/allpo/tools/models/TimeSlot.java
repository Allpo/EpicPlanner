package com.allpo.tools.models;

import java.util.Date;

public class TimeSlot {
    private final Constants.StaffRoles role;
    private final Date startTime;
    private final Date endTime;

    public TimeSlot(Constants.StaffRoles role, Date startTime, Date endTime) {
        this.role = role;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Constants.StaffRoles getRole() {
        return role;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
}
