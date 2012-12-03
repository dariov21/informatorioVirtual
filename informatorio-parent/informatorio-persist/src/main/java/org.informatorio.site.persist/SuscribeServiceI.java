package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Suscribe;

public interface SuscribeServiceI{
    public List<Suscribe>getallInscripto();
    public boolean save();
    public boolean delete();
}