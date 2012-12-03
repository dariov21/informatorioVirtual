
package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.StudentMaterial;

public interface StudentMaterialI{ 
	public List<StudentMaterial>getallStudentMaterial();
	public boolean save();
	public boolean delete();
}





