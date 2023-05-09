package edu.upc.dtim.ormbd.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    private final ProjectService projectService;
    ProjectController(@Autowired ProjectService projectService){
        this.projectService = projectService;
    }

    @PostMapping("/project")
    public Project saveProject(@RequestParam String id)
    {
        Project project = new Project();
        project.setProjectId(id);
        return projectService.saveProject(project);
    }

    @GetMapping("/project")
    public Project getProject(@RequestParam String id)
    {
        return projectService.getProject(id);
    }

    @GetMapping("/projects")
    public List<Project> getAllProjects()
    {
        return projectService.getAllProjects();
    }

    @PostMapping("/deleteProjects")
    public boolean deleteProject(@RequestParam String id){
        return projectService.deleteProject(id);
    }

    @DeleteMapping("/deleteProjects")
    public boolean deleteAllProjects(){
        return projectService.deleteAllProjects();
    }

}
