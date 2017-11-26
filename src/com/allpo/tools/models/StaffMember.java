package com.allpo.tools.models;

import java.util.Date;
import java.util.List;

public class StaffMember {
    private final String name;
    private List<TimeSlot> planning;

    public StaffMember(String name) {
        this.name = name;
    }

    /**
     * Check if the staff member is available on a specific period
     * @param startTime is the begining of the period we want to test the staff availability for
     * @param endTime is the end of the period we want to test the staff availability for
     * @return true if the staff is available on this period, false otherwise
     */
    public boolean isStaffAvailable(Date startTime, Date endTime) {
        for (TimeSlot timeSlot : planning) {
            Date timeSlotStart = timeSlot.getStartTime();
            Date timeSlotEnd = timeSlot.getEndTime();
            if ((startTime.after(timeSlotStart)
                    && startTime.before(timeSlotEnd))
                    || (endTime.after(timeSlotStart)
            && endTime.before(timeSlotEnd))) {
                return true;
            }
        }

        return true;
    }
}
