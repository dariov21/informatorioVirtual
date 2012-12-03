package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Role;

public interface RoleServiceI {
        public List<Role>getallRole();
        public boolean save();
        public boolean delete();
}

