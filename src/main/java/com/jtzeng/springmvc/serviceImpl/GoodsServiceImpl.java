package com.jtzeng.springmvc.serviceImpl;

import com.jtzeng.springmvc.entity.ComEntity;
import com.jtzeng.springmvc.serviceI.GoodsServiceI;
import com.jtzeng.springmvc.util.PddClient;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;
import com.pdd.pop.sdk.http.api.request.PddGoodsCatsGetRequest;
import com.pdd.pop.sdk.http.api.request.PddGoodsCpsUnitDeleteRequest;
import com.pdd.pop.sdk.http.api.request.PddGoodsOptGetRequest;
import com.pdd.pop.sdk.http.api.response.PddGoodsCatsGetResponse;
import com.pdd.pop.sdk.http.api.response.PddGoodsCpsUnitDeleteResponse;
import com.pdd.pop.sdk.http.api.response.PddGoodsOptGetResponse;
import org.springframework.stereotype.Service;

@Service("goodsServiceImpl")
public class GoodsServiceImpl implements GoodsServiceI {
    public String catsGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddGoodsCatsGetRequest request = new PddGoodsCatsGetRequest();
        request.setParentCatId(param.getParent_cat_id());
        PddGoodsCatsGetResponse response=null;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String optGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddGoodsOptGetRequest request = new PddGoodsOptGetRequest();
        request.setParentOptId(param.getParent_opt_id());
        PddGoodsOptGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String cpsUnitGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();

        PddGoodsCpsUnitDeleteRequest request = new PddGoodsCpsUnitDeleteRequest();
        request.setGoodsId(param.getGoods_id());
        PddGoodsCpsUnitDeleteResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }
}
