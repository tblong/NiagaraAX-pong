package com.github.tblong.niagarapong.wb;

import javax.baja.sys.BIcon;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.workbench.tool.BWbNavNodeTool;

public class BPongWbTool
    extends BWbNavNodeTool
{
  /*-
   class BPongWbTool
   {
     properties
     {
     
     }
     actions
     {
     }
     topics
     {
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.github.tblong.niagarapong.wb.BPongWbTool(2247919916)1.0$ @*/
/* Generated Mon Jun 29 07:22:06 EDT 2015 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPongWbTool.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  
  
////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////
 
  private static final BIcon ICON = BIcon
      .make("local:|module://pong/com/github/tblong/niagarapong/icons/pongIcon.png");

////////////////////////////////////////////////////////////////
// Overridden methods
////////////////////////////////////////////////////////////////
  
  /*
   * (non-Javadoc)
   * 
   * @see javax.baja.sys.BComponent#getIcon()
   */
  @Override
  public BIcon getIcon()
  {
    return ICON;
  }

}
