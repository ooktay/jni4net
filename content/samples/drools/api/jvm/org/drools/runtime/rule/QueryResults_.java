// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package org.drools.runtime.rule;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class QueryResults_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return org.drools.runtime.rule.QueryResults_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        org.drools.runtime.rule.QueryResults_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __QueryResults extends system.Object implements org.drools.runtime.rule.QueryResults {
    
    protected __QueryResults(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/util/Iterator;")
    public native java.util.Iterator iterator();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int size();
    
    @net.sf.jni4net.attributes.ClrMethod("()[Ljava/lang/String;")
    public native java.lang.String[] getIdentifiers();
}
//</generated-proxy>