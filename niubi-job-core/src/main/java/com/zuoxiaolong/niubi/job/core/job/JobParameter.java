package com.zuoxiaolong.niubi.job.core.job;

/*
 * Copyright 2002-2015 the original author or authors.
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

import java.util.HashMap;

/**
 * @author 左潇龙
 * @since 1/12/2016 16:58
 */
public class JobParameter extends HashMap<String, Object> {

    public static final String DATA_MAP_KEY = "_job_parameter";

    public Integer getInteger(String key) {
        return Integer.valueOf(get(key).toString());
    }

    public Long getLong(String key) {
        return Long.valueOf(get(key).toString());
    }

    public String getString(String key) {
        return get(key).toString();
    }

}
