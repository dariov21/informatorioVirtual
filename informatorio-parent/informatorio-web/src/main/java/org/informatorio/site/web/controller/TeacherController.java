package org.informatorio.site.web.controller;

import org.informatorio.site.persist.TeacherServiceI;
import org.informatorio.site.persist.exceptions.NoTeacherException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: alumno
 * Date: 12/14/12
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/teachers")
public class TeacherController {

    private TeacherServiceI service;

    @RequestMapping(method= RequestMethod.GET)
    public String getTeacherList(Model model) {
        List<Teacher> teacherList = service.getAllTeacher();
        model.addAttribute("teachers",teacherList);
        return "teachers/list";
    }

    @RequestMapping(value = "/new",method=RequestMethod.GET)
    public String getCreateTeacherForm(Model model) {
        model.addAttribute(new Teacher());
        return "teachers/createTeacherForm";
    }

    @RequestMapping(value ="/delete/{id}",method=RequestMethod.GET)
    public String getDeleteTeacher(@PathVariable Long id,Model model) throws NoTeacherException {
        service.delete(new Teacher(id));
        return "teachers/list";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String createTeacher(@Validated Teacher teacher, BindingResult result) {
        if (result.hasErrors()) {
            return "teachers/createTeacherForm";
        }
        service.save(teacher);
        return "redirect:/teachers/"+ teacher.getId();
    }

    @RequestMapping(value="{id}", method=RequestMethod.GET)
    public String getTeacherView(@PathVariable Long id, Model model) throws NoTeacherException {

        Teacher teacher = service.getTeacherById(id);
        model.addAttribute(teacher);
        return "teachers/teacherView";
    }


    public TeacherServiceI getService() {
        return service;
    }

    public void setService(TeacherServiceI service) {
        this.service = service;
    }
}
