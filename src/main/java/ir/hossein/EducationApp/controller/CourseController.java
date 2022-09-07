package ir.hossein.EducationApp.controller;

import ir.hossein.EducationApp.model.CourseModel;
import ir.hossein.EducationApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/Course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping("/list")
    public String listCourses(Model theModel) {
        List<CourseModel> theCourseEntities = courseService.getCourse();
        theModel.addAttribute("courses", theCourseEntities);
        return "list-course";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        CourseModel theCourseEntity = new CourseModel();
        theModel.addAttribute("course", theCourseEntity);
        return "course-form";
    }

    @PostMapping("/save")
    public String saveCourse(@ModelAttribute("course") CourseModel theCourseModel) {
        courseService.saveCourse(theCourseModel);
        return "redirect:/main";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("courseId") int theId, Model theModel) {
        CourseModel theCourseEntity = courseService.getCourse(theId);
        theModel.addAttribute("course", theCourseEntity);
        return "course-form";
    }

    @GetMapping("/delete")
    public String deleteCourse(@RequestParam("courseId") int courseId) {
        courseService.deleteCourse(courseId);
        return "redirect:/main";
    }
}
