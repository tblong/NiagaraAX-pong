package com.github.tblong.niagarapong.wb;

import javax.baja.sys.BAbsTime;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.ui.options.BOptions;

/**
 * The game's persistent user options.
 *
 * @author TBLong
 * @creation Jul 2, 2015
 * @version Jul 2, 2015
 *
 */ 
public class BPongUserOptions
    extends BOptions
{
  /*-
   class BPongUserOptions
   {
     properties
     {
       lastOpened: BAbsTime
         -- Last time the app was opened.
         default{[BAbsTime.DEFAULT]}
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
/*@ $com.github.tblong.niagarapong.wb.BPongUserOptions(1724870338)1.0$ @*/
/* Generated Thu Jul 02 20:51:17 EDT 2015 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "lastOpened"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>lastOpened</code> property.
   * Last time the app was opened.
   * @see com.github.tblong.niagarapong.wb.BPongUserOptions#getLastOpened
   * @see com.github.tblong.niagarapong.wb.BPongUserOptions#setLastOpened
   */
  public static final Property lastOpened = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>lastOpened</code> property.
   * Last time the app was opened.
   * @see com.github.tblong.niagarapong.wb.BPongUserOptions#lastOpened
   */
  public BAbsTime getLastOpened() { return (BAbsTime)get(lastOpened); }
  
  /**
   * Set the <code>lastOpened</code> property.
   * Last time the app was opened.
   * @see com.github.tblong.niagarapong.wb.BPongUserOptions#lastOpened
   */
  public void setLastOpened(BAbsTime v) { set(lastOpened,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPongUserOptions.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////
 
  private static BPongUserOptions options;

  /**
   * Get the game's user options
   */
  public static BPongUserOptions make()
  {
    if (options == null)
      options = (BPongUserOptions) load(BPongUserOptions.TYPE);
    return options;
  }

}
