package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Course;

public interface CourseServiceI{
	public List<Course>getallCourse();
	public boolean save();
	public boolean delete();
	public void addCourse();
	public void deleteCourse();
	public void updateCourse();
	
}















































