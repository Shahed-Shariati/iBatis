package com.sabapardazesh.tejaratipgspringapplication.service.dto;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * BaseObject class
 *
 * @author <a href="mailto:kamran.azizzadeh@avanoc.com">Kamran</a>
 *         Date: Jul 27, 2008
 *         Time: 4:22:00 PM
 *  */
public class BaseObject implements Serializable {
    private static final long serialVersionUID = 3256446889040622647L;

    public String toString() {
        ToStringBuilder.setDefaultStyle(ToStringStyle.MULTI_LINE_STYLE);
        String[] excludes = new String[] {"cvv2","pin2","expDate"};
        return ReflectionToStringBuilder.toStringExclude(this, excludes);
    }
}
