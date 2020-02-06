package com.lin.cms.core.annotation;

import com.lin.cms.core.enums.UserLevel;

import java.lang.annotation.*;

/**
 * 刷新令牌权限
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Required(level = UserLevel.REFRESH)
public @interface RefreshRequired {
}
