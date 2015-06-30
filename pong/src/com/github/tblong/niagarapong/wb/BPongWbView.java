package com.github.tblong.niagarapong.wb;

import javax.baja.sys.BObject;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.util.Lexicon;
import javax.baja.workbench.view.BWbView;

public class BPongWbView
    extends BWbView
{
  /*-
   class BPongWbView
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
/*@ $com.github.tblong.niagarapong.wb.BPongWbView(2419197384)1.0$ @*/
/* Generated Tue Jun 30 17:59:29 EDT 2015 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPongWbView.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////
  


  
  
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////
  
  public BPongWbView()
  {
    // TODO constructor
    
  }
  
  
////////////////////////////////////////////////////////////////
// Lexicon
////////////////////////////////////////////////////////////////
  
  private static final Lexicon LEX = Lexicon.make(BPongWbView.class);

  // TODO fill out LEX
  
  
////////////////////////////////////////////////////////////////
// Overridden methods
////////////////////////////////////////////////////////////////
  
  /*
   * (non-Javadoc)
   * 
   * @see javax.baja.workbench.BWbEditor#doLoadValue(javax.baja.sys.BObject, javax.baja.sys.Context)
   */
  @Override
  protected void doLoadValue(BObject value, Context context) throws Exception
  {
    // TODO build widget tree

    super.doLoadValue(value, context);
  }
  
////////////////////////////////////////////////////////////////
// Command inner classes
////////////////////////////////////////////////////////////////
  
  
}
