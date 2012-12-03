package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Message;

public interface MessageServiceI{
        public List<Message>getallMessage();
        public boolean save();
        public boolean delete();
}

