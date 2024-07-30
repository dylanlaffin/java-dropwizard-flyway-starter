package org.example.models;

import java.sql.Date;

public class OpenJobRoleResponse {
    /*
    instantiates a string of Job Role Name in the Job Role Response
     */
    private String jobRoleName;
    /*
    instantiates a ENUM of Job Role LOCATION in the Job Role Response
     */
    private Locations jobRoleLocation;
    /*
    instantiates a ENUM of Job Role CAPABILITY in the Job Role Response
     */
    private String jobRoleCapability;
    /*
    instantiates a ENUM of Job Role BAND in the Job Role Response
     */
    private String jobRoleBand;
    /*
    instantiates a Date of Job Role CLOSING Date in the Job Role Response
     */
    private Date jobRoleClosingDate;
    /*
    instantiates an Integer of number of open positions in the Job Role Response
    */
    private int numOpenPos;


    public OpenJobRoleResponse(
            final String jRName,
            final Locations jRLocation,
            final String jRCapability,
            final String jRBand,
            final Date jRClosingDate,
            final int numOpenPos) {
        this.jobRoleName = jRName;
        this.jobRoleLocation = jRLocation;
        this.jobRoleCapability = jRCapability;
        this.jobRoleBand = jRBand;
        this.jobRoleClosingDate = jRClosingDate;
        this.numOpenPos = numOpenPos;
    }

    public String getJobRoleName() {
        return jobRoleName;
    }

    public void setJobRoleName(final String jRName) {
        this.jobRoleName = jRName;
    }

    public Locations getJobRoleLocation() {
        return jobRoleLocation;
    }

    public void setJobRoleLocation(final Locations jobRoleLocation) {
        this.jobRoleLocation = jobRoleLocation;
    }

    public String getJobRoleCapability() {
        return jobRoleCapability;
    }

    public void setJobRoleCapability(final String jobRoleCapability) {
        this.jobRoleCapability = jobRoleCapability;
    }

    public String getJobRoleBand() {
        return jobRoleBand;
    }

    public void setJobRoleBand(final String jobRoleBand) {
        this.jobRoleBand = jobRoleBand;
    }

    public Date getJobRoleClosingDate() {
        return jobRoleClosingDate;
    }

    public void setJobRoleClosingDate(final Date jobRoleClosingDate) {
        this.jobRoleClosingDate = jobRoleClosingDate;
    }

    public int getNumOpenPos() {
        return numOpenPos;
    }

    public void setNumOpenPos(final int numOpenPos) {
        this.numOpenPos = numOpenPos;
    }
}

