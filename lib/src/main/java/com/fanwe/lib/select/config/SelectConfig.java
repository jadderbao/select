/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fanwe.lib.select.config;

import android.view.View;

import com.fanwe.lib.select.properties.ViewProperties;

/**
 * View的状态参数配置
 */
public interface SelectConfig<T extends ViewProperties>
{
    /**
     * 初始化配置参数
     *
     * @param initer
     * @return
     */
    SelectConfig init(PropertiesIniter<T> initer);

    /**
     * 清空配置
     *
     * @return
     */
    SelectConfig clear();

    /**
     * 设置选中状态
     *
     * @param selected
     * @return
     */
    SelectConfig setSelected(boolean selected);

    /**
     * 设置选中状态
     *
     * @param selected
     * @param view
     * @return
     */
    SelectConfig setSelected(boolean selected, View view);

    interface PropertiesIniter<T extends ViewProperties>
    {
        void init(T normal, T selected);
    }
}