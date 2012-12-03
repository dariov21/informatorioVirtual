package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Assistance;


public interface AssistanceServiceI{
   public List<Assistance> getallAssistance();
   public boolean save();
   public boolean delete();
	public void assistancePerPupil();
}

