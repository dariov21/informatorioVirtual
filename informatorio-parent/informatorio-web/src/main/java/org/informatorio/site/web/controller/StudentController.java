package org.informatorio.site.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.informatorio.site.persist.StudentServiceI;
import org.informatorio.site.persist.exceptions.NoStudentException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: nico
 * Date: 06/01/13
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/students")
public class StudentController {
    private StudentServiceI service;

    @RequestMapping(method= RequestMethod.GET)
    public String getStudentList(Model model) {
        List<Student> studentList = service.getAllStudent();
        model.addAttribute("students",studentList);
        return "students/list";
    }

    @RequestMapping(value = "/new",method=RequestMethod.GET)
    public String getCreateStudentForm(Model model) {
        model.addAttribute(new Student());
        return "students/createStudentForm";
    }

    @RequestMapping(value ="/delete/{id}",method=RequestMethod.GET)
    public String getDeleteStudent(@PathVariable Long id,Model model) throws NoStudentException {
        service.delete(new Student(id));
        return "students/list";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String createStudent(@Validated Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "students/createStudentForm";
        }
        service.save(student);
        return "redirect:/students/"+ student.getId();
    }

    @RequestMapping(value="{id}", method=RequestMethod.GET)
    public String getStudentView(@PathVariable Long id, Model model) throws NoStudentException {

        Student student = service.getStudentById(id);
        model.addAttribute(student);
        return "students/studentView";
    }


    public StudentServiceI getService() {
        return service;
    }

    public void setService(StudentServiceI service) {
        this.service = service;
    }
}
