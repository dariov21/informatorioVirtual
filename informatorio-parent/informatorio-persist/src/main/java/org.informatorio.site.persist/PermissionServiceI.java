package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Permission;

public interface PermissionServiceI{
      public List<Permission> getallPermission();
      public boolean save();
      public boolean delete();

}