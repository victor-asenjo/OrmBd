package edu.upc.dtim.ormbd.Project;


import java.util.List;

public class Project {
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    // Unique identifier for the project
    private String projectId;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    // Name of the project
    private String projectName;

    // Description of the project
    private String projectDescription;

    // Privacy level of the project (e.g. private, public)
    private String projectPrivacy;

    // Color associated with the project (not sure what this is used for)
    private String projectColor;

    // Username of the user who created the project
    private String createdBy;

    public String getProjectPrivacy() {
        return projectPrivacy;
    }

    public void setProjectPrivacy(String projectPrivacy) {
        this.projectPrivacy = projectPrivacy;
    }

    public String getProjectColor() {
        return projectColor;
    }

    public void setProjectColor(String projectColor) {
        this.projectColor = projectColor;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    public List<String> getLocalGraphIDs() {
        return localGraphIDs;
    }

    public void setLocalGraphIDs(List<String> localGraphIDs) {
        this.localGraphIDs = localGraphIDs;
    }

    // List of local graph IDs associated with the project (not sure what this is used for)
    private List<String> localGraphIDs;

    // constructor, getters, setters, etc.
}

