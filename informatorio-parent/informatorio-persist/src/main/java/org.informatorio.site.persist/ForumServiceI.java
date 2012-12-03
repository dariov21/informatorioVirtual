package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Forum;

public interface ForumServiceI{
        public List<Forum>getallForum();
        public boolean save();
        public boolean delete();
	public void addpost();
	public void removepost();
	public void sendmessage();
	public void deletemessage();
	
}

