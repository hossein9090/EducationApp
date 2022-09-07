package ir.hossein.EducationApp.controller;


import ir.hossein.EducationApp.model.TeacherModel;
import ir.hossein.EducationApp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @GetMapping("/list")
    public String listTeachers(Model theModel) {
        List<TeacherModel> theTeacherEntities = teacherService.getTeacher();
        theModel.addAttribute("teacher", theTeacherEntities);
        return "list-teacher";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        TeacherModel theTeacherEntity = new TeacherModel();
        theModel.addAttribute("teacher", theTeacherEntity);
        return "teacher-form";
    }

    @PostMapping("/save")
    public String saveTeacher(@ModelAttribute("teacher") TeacherModel theTeacherModel) {
        teacherService.saveTeacher(theTeacherModel);
        return "redirect:/main";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("teacherId") int teacherId, Model theModel) {
        TeacherModel theTeacherEntity = teacherService.getTeacher(teacherId);
        theModel.addAttribute("teacher", theTeacherEntity);
        return "teacher-form";
    }

    @GetMapping("/delete")
    public String deleteTeacher(@RequestParam("teacherId") int teacherId) {
        teacherService.deleteTeacher(teacherId);
        return "redirect:/main";
    }
}
