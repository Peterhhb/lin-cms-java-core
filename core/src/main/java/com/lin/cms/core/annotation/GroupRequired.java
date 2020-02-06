package com.lin.cms.core.annotation;

import com.lin.cms.core.enums.UserLevel;

import java.lang.annotation.*;

/**
 * 分组权限
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Required(level = UserLevel.GROUP)
public @interface GroupRequired {
}
