
package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Score;

public interface ScoreServiceI{
        public List<Score>getallScore();
        public boolean save();
        public boolean delete();
}

