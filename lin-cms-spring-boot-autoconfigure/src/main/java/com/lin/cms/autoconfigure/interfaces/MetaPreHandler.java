package com.lin.cms.autoconfigure.interfaces;

import com.lin.cms.core.annotation.RouteMeta;

/**
 * 路由收集前置处理器
 */
public interface MetaPreHandler {

    /**
     * 处理路由信息
     *
     * @param meta 路由信息
     */
    void handle(RouteMeta meta);
}
