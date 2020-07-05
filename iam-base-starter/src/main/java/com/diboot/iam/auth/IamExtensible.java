/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.iam.auth;

import com.diboot.iam.entity.IamRole;

import java.util.List;

/**
 * IAM扩展接口
 * @author mazc@dibo.ltd
 * @version v2.0
 * @date 2020/01/04
 */
public interface IamExtensible {
    /**
     * 获取可扩展的角色
     * @param userType
     * @param userId
     * @return
     */
    List<IamRole> getExtentionRoles(String userType, Long userId);

}
