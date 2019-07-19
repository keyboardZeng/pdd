package com.jtzeng.springmvc.serviceImpl;

import com.jtzeng.springmvc.entity.ComEntity;
import com.jtzeng.springmvc.serviceI.UtilServiceI;
import com.jtzeng.springmvc.util.MyProperties;
import com.jtzeng.springmvc.util.PddClient;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.request.PddTimeGetRequest;
import com.pdd.pop.sdk.http.api.request.PddUtilDivideBase64ImageRequest;
import com.pdd.pop.sdk.http.api.request.PddUtilDivideImageRequest;
import com.pdd.pop.sdk.http.api.response.PddTimeGetResponse;
import com.pdd.pop.sdk.http.api.response.PddUtilDivideBase64ImageResponse;
import com.pdd.pop.sdk.http.api.response.PddUtilDivideImageResponse;
import org.springframework.stereotype.Service;

@Service("utilServiceImpl")
public class UtilServiceImpl implements UtilServiceI {
    public String timeGet(ComEntity param) {

        PopClient client = PddClient.getPopHttpClient();

        PddTimeGetRequest request = new PddTimeGetRequest();
        PddTimeGetResponse response = null;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String divideBase64Image(ComEntity param) {

        PopClient client = PddClient.getPopHttpClient();

        PddUtilDivideBase64ImageRequest request = new PddUtilDivideBase64ImageRequest();
        request.setImgData(param.getImg_data());
        PddUtilDivideBase64ImageResponse response = null;
        try {
            response = client.syncInvoke(request, MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String divideImage(ComEntity param) {

        PopClient client = PddClient.getPopHttpClient();

        PddUtilDivideImageRequest request = new PddUtilDivideImageRequest();
        request.setImageUrl(param.getImage_url());
        PddUtilDivideImageResponse response = null;
        try {
            response = client.syncInvoke(request,  MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }
}
