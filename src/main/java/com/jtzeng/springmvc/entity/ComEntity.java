package com.jtzeng.springmvc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ComEntity implements Serializable {
    private String img_data;
    private String image_url;
    private String source_url;
    private String pid;
    private String p_id;
    private String custom_parameters;
    private String order_sn;
    private String[] p_id_list;
    private String[] coupon_ids;
    private String[] pid_list;
    private String start_time;
    private String last_order_id;
    private String end_time;
    private String url;
    private String keyword;
    private String[] p_id_name_list;
    private String range_list;
    private long parent_cat_id;
    private long goods_id;
    private long zs_duo_id;
    private long[] goods_id_list;
    private long mall_id;
    private long start_update_time;
    private long end_update_time;
    private long number;
    private long[] theme_id_list;
    private long theme_id;
    private long opt_id;
    private long cat_id;
    private int parent_opt_id;
    private int page_size;
    private int page;
    private int style;
    private int channel_type;
    private int resource_type;
    private int page_number;
    private int offset;
    private int sort_type;
    private int limit;
    private int merchant_type;
    private int[] merchant_type_list;
    private int plan_type;
    private boolean generate_weapp_webview;
    private boolean generate_short_url;
    private boolean multi_group;
    private boolean return_count=true;
    private boolean generate_mobile;
    private boolean we_app_web_view_short_url;
    private boolean we_app_web_view_url;
    private boolean generate_weiboapp_webview;
    private boolean generate_we_app;
    private boolean with_coupon;
    private boolean is_brand_goods;

}
