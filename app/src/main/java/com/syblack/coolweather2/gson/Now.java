package com.syblack.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hhy on 2017/3/30.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
