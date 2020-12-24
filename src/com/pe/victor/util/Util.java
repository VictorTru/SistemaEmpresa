
package com.pe.victor.util;

import java.util.ResourceBundle;

/**
 *
 * @author VictorTru
 */

public class Util {
    public static final int MEMORY=0;
   public static final int FILE=1;
   public static final int DB=2;
   
   public static int opc;
   
   static {
    ResourceBundle properties = ResourceBundle.getBundle("com.pe.victor.util.config");
    opc = Integer.parseInt(properties.getString("opc"));
   }
   
   public static final String RUTA= "D:/tools/Datos1.ini";
}
