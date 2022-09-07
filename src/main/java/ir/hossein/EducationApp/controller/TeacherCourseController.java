package ir.hossein.EducationApp.controller;


import ir.hossein.EducationApp.model.TeacherCourseModel;
import ir.hossein.EducationApp.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Teacher-Course")
public class TeacherCourseController {

    @Autowired
    private TeacherCourseService teacherCourseService;


    @GetMapping("/list")
    public String listTeacherCourses(Model theModel) {
        List<TeacherCourseModel> theTeacherCourseEntities = teacherCourseService.getTeacherCourse();
        theModel.addAttribute("teacherCourse", theTeacherCourseEntities);
        return "list-teacherCourse";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        TeacherCourseModel theTeacherCourseEntity = new TeacherCourseModel();
        theModel.addAttribute("teacherCourse", theTeacherCourseEntity);
        return "teacherCourse-form";
    }

    @PostMapping("/save")
    public String saveTeacherCourse(@ModelAttribute("teacherCourse") TeacherCourseModel theTeacherCourseModel) {
        teacherCourseService.saveTeacherCourse(theTeacherCourseModel);
        return "redirect:/main";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("teacherCourseId") int teacherCourseId, Model theModel) {
        TeacherCourseModel theTeacherCourseEntity = teacherCourseService.getTeacherCourse(teacherCourseId);
        theModel.addAttribute("teacherCourse", theTeacherCourseEntity);
        return "teacherCourse-form";
    }

    @GetMapping("/delete")
    public String deleteTeacherCourse(@RequestParam("teacherCourseId") int teacherCourseId) {
        teacherCourseService.deleteTeacherCourse(teacherCourseId);
        return "redirect:/main";
    }
}
