/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamOnlineListRequest  extends AbstractModel{

    /**
    * 您的加速域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 取得第几页，默认1。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页大小，最大100。 
取值：1~100之前的任意整数。
默认值：10
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 获取您的加速域名。
     * @return DomainName 您的加速域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置您的加速域名。
     * @param DomainName 您的加速域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取应用名称。
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取取得第几页，默认1。
     * @return PageNum 取得第几页，默认1。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置取得第几页，默认1。
     * @param PageNum 取得第几页，默认1。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页大小，最大100。 
取值：1~100之前的任意整数。
默认值：10
     * @return PageSize 每页大小，最大100。 
取值：1~100之前的任意整数。
默认值：10
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页大小，最大100。 
取值：1~100之前的任意整数。
默认值：10
     * @param PageSize 每页大小，最大100。 
取值：1~100之前的任意整数。
默认值：10
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

