package com.jtzeng.springmvc.serviceImpl;

import com.jtzeng.springmvc.entity.ComEntity;
import com.jtzeng.springmvc.serviceI.DdkServiceI;
import com.jtzeng.springmvc.util.MyProperties;
import com.jtzeng.springmvc.util.PddClient;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.common.util.StringUtils;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.request.*;
import com.pdd.pop.sdk.http.api.response.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ddkServiceImpl")
public class DdkServiceImpl implements DdkServiceI {
    public String themeListGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkThemeListGetRequest request = new PddDdkThemeListGetRequest();
        if (param.getPage_size()!=0)
        request.setPageSize(param.getPage_size());
        if (param.getPage()!=0)
        request.setPage(param.getPage());
        PddDdkThemeListGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsZsUnitUrlGen(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsZsUnitUrlGenRequest request = new PddDdkGoodsZsUnitUrlGenRequest();
        request.setSourceUrl(param.getSource_url());
        request.setPid(param.getPid());
        PddDdkGoodsZsUnitUrlGenResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String zsUnitGoodsQuery(ComEntity param) {
            return "{}";
    }

    public String weappQrcodeUrlGen(ComEntity param) {
        
        PopClient client = PddClient.getPopHttpClient();

        PddDdkWeappQrcodeUrlGenRequest request = new PddDdkWeappQrcodeUrlGenRequest();
        request.setPId(param.getP_id());
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        request.setGoodsIdList(goodsIdList);
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        if (param.getZs_duo_id()!=0)
        request.setZsDuoId(param.getZs_duo_id());
        PddDdkWeappQrcodeUrlGenResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsBasicInfoGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsBasicInfoGetRequest request = new PddDdkGoodsBasicInfoGetRequest();
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        request.setGoodsIdList(goodsIdList);
        PddDdkGoodsBasicInfoGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String orderDetailGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOrderDetailGetRequest request = new PddDdkOrderDetailGetRequest();
        request.setOrderSn(param.getOrder_sn());
        PddDdkOrderDetailGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String mallUrlGen(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkMallUrlGenRequest request = new PddDdkMallUrlGenRequest();
        request.setMallId(param.getMall_id());
        request.setPid(param.getPid());
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        request.setGenerateShortUrl(param.isGenerate_short_url());
        request.setMultiGroup(param.isMulti_group());
        request.setCustomParameters(param.getCustom_parameters());
        PddDdkMallUrlGenResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String phraseGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkPhraseGenerateRequest request = new PddDdkPhraseGenerateRequest();
        request.setPId(param.getP_id());
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        request.setGoodsIdList(goodsIdList);
        request.setMultiGroup(false);
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        if (param.getZs_duo_id()!=0)
        request.setZsDuoId(param.getZs_duo_id());
        if (param.getStyle()!=0)
        request.setStyle(param.getStyle());
        PddDdkPhraseGenerateResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthOrderDetailGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOauthOrderDetailGetRequest request = new PddDdkOauthOrderDetailGetRequest();
        request.setOrderSn(param.getOrder_sn());
        PddDdkOauthOrderDetailGetResponse response;
        try {
            response = client.syncInvoke(request, MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthPhraseGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOauthPhraseGenerateRequest request = new PddDdkOauthPhraseGenerateRequest();
        request.setPId(param.getP_id());
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        request.setGoodsIdList(goodsIdList);
        request.setMultiGroup(param.isMulti_group());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        if (param.getZs_duo_id()!=0)
        request.setZsDuoId(param.getZs_duo_id());
        if (param.getStyle()!=0)
        request.setStyle(param.getStyle());
        PddDdkOauthPhraseGenerateResponse response;
        try {
            response = client.syncInvoke(request, MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthWeappQrcodeUrlGen(ComEntity param) {
            return "{}";
    }

    public String oauthZsUnitGoodsQuery(ComEntity param) {
            return "{}";
    }

    public String oauthThemePromUrlGenerate(ComEntity param) {
        return "{}";
    }

    public String actPromUrlGenerate(ComEntity param) {
            return "{}";
    }

    public String appNewBillListGet(ComEntity param) {
            return "{}";
    }

    public String checkInPromUrlGenerate(ComEntity param) {
            return "{}";
    }

    public String mallCouponUrlGen(ComEntity param) {
            return "{}";
    }

    public String oauthColorOrderIncrementGet(ComEntity param) {
            return "{}";
    }

    public String goodsGameVirtualUrlGenerate(ComEntity param) {
            return "{}";
    }

    public String orderListIncrementGet(ComEntity param) {
        
        PopClient client = PddClient.getPopHttpClient();

        PddDdkOrderListIncrementGetRequest request = new PddDdkOrderListIncrementGetRequest();
        request.setStartUpdateTime(param.getStart_update_time());
        request.setEndUpdateTime(param.getEnd_update_time());
        if (param.getPage_size()!=0)
        request.setPageSize(param.getPage_size());
        if (param.getPage()!=0)
        request.setPage(param.getPage());
        if (param.isReturn_count())
        request.setReturnCount(param.isReturn_count());
        PddDdkOrderListIncrementGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsGuessLike(ComEntity param) {
            return "{}";
    }

    public String directGoodsQuery(ComEntity param) {
            return "{}";
    }

    public String cmsPromUrlGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkCmsPromUrlGenerateRequest request = new PddDdkCmsPromUrlGenerateRequest();
        request.setGenerateShortUrl(param.isGenerate_short_url());
        request.setGenerateMobile(param.isGenerate_mobile());
        request.setMultiGroup(param.isMulti_group());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        request.setWeAppWebViewShortUrl(param.isWe_app_web_view_short_url());
        request.setWeAppWebViewUrl(param.isWe_app_web_view_url());
        if (param.getChannel_type()!=0)
        request.setChannelType(param.getChannel_type());
        List<String> pIdList = new ArrayList<String>();
        pIdList.add(param.getP_id_list());
        request.setPIdList(pIdList);
        PddDdkCmsPromUrlGenerateResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsPromotionUrlGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsPromotionUrlGenerateRequest request = new PddDdkGoodsPromotionUrlGenerateRequest();
        request.setPId(param.getP_id());
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        request.setGoodsIdList(goodsIdList);
        request.setGenerateShortUrl(param.isGenerate_short_url());
        request.setMultiGroup(param.isMulti_group());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        if (param.getZs_duo_id()!=0)
        request.setZsDuoId(param.getZs_duo_id());
        request.setGenerateWeApp(param.isGenerate_weapp_webview());
        request.setGenerateWeiboappWebview(param.isGenerate_weiboapp_webview());
        PddDdkGoodsPromotionUrlGenerateResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsUnitQuery(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsUnitQueryRequest request = new PddDdkGoodsUnitQueryRequest();
        request.setGoodsId(param.getGoods_id());
        if (param.getZs_duo_id()!=0)
        request.setZsDuoId(param.getZs_duo_id());
        PddDdkGoodsUnitQueryResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String couponInfoQuery(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkCouponInfoQueryRequest request = new PddDdkCouponInfoQueryRequest();
        List<String> couponIds = new ArrayList<String>();
        couponIds.add(param.getCoupon_ids());
        request.setCouponIds(couponIds);
        PddDdkCouponInfoQueryResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String lotteryUrlGen(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkLotteryUrlGenRequest request = new PddDdkLotteryUrlGenRequest();
        List<String> pidList = new ArrayList<String>();
        pidList.add(param.getPid_list());
        request.setPidList(pidList);
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        request.setGenerateShortUrl(""+param.isGenerate_short_url());
        request.setMultiGroup(param.isMulti_group());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setGenerateWeApp(param.isGenerate_we_app());
        PddDdkLotteryUrlGenResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String orderListRangeGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOrderListRangeGetRequest request = new PddDdkOrderListRangeGetRequest();
        request.setStartTime(param.getStart_time());
        if (!StringUtils.isEmpty(param.getLast_order_id()))
        request.setLastOrderId(param.getLast_order_id());
        if (param.getPage_size()!=0)
        request.setPageSize(param.getPage_size());
        request.setEndTime(param.getEnd_time());
        PddDdkOrderListRangeGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsSaleMonthQuery(ComEntity param) {
            return "{}";
    }

    public String resourceUrlGen(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkResourceUrlGenRequest request = new PddDdkResourceUrlGenRequest();
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setPid(param.getPid());
        if (param.getResource_type()!=0)
        request.setResourceType(param.getResource_type());
        if (!StringUtils.isEmpty(param.getUrl()))
        request.setUrl(param.getUrl());
        PddDdkResourceUrlGenResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsPidQuery(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsPidQueryRequest request = new PddDdkGoodsPidQueryRequest();
        if (param.getPage()!=0)
        request.setPage(param.getPage());
        if (param.getPage_size()!=0)
        request.setPageSize(param.getPage_size());
        List<String> pidList = new ArrayList<String>();
        if (!StringUtils.isEmpty(param.getPid_list()))
        pidList.add(param.getPid_list());
        request.setPidList(pidList);
        PddDdkGoodsPidQueryResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsPidGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsPidGenerateRequest request = new PddDdkGoodsPidGenerateRequest();
        request.setNumber(param.getNumber());
        List<String> pIdNameList = new ArrayList<String>();
        if (!StringUtils.isEmpty(param.getP_id_name_list()))
        pIdNameList.add(param.getP_id_name_list());
        request.setPIdNameList(pIdNameList);
        PddDdkGoodsPidGenerateResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String rpPromUrlGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkRpPromUrlGenerateRequest request = new PddDdkRpPromUrlGenerateRequest();
        request.setGenerateShortUrl(param.isGenerate_short_url());
        List<String> pIdList = new ArrayList<String>();
        pIdList.add(param.getPid_list());
        request.setPIdList(pIdList);
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        request.setWeAppWebViewShortUrl(param.isWe_app_web_view_short_url());
        request.setWeAppWebWiewUrl(param.isWe_app_web_view_url());
        request.setGenerateWeApp(param.isGenerate_we_app());
        if (param.getChannel_type()!=0)
        request.setChannelType(param.getChannel_type());
        PddDdkRpPromUrlGenerateResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String themePromUrlGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkThemePromUrlGenerateRequest request = new PddDdkThemePromUrlGenerateRequest();
        request.setPid(param.getPid());
        List<Long> themeIdList = new ArrayList<Long>();
        themeIdList.add(param.getTheme_id_list());
        request.setThemeIdList(themeIdList);
        request.setGenerateShortUrl(param.isGenerate_short_url());
        request.setGenerateMobile(param.isGenerate_mobile());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        request.setWeAppWebViewShortUrl(param.isWe_app_web_view_short_url());
        request.setWeAppWebWiewUrl(param.isWe_app_web_view_url());
        request.setGenerateWeApp(param.isGenerate_we_app());
        PddDdkThemePromUrlGenerateResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String mallGoodsListGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkMallGoodsListGetRequest request = new PddDdkMallGoodsListGetRequest();
        request.setMallId(param.getMall_id());
        request.setPageNumber(param.getPage_number());
        request.setPageSize(param.getPage_size());
        PddDdkMallGoodsListGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String topGoodsListQuery(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkTopGoodsListQueryRequest request = new PddDdkTopGoodsListQueryRequest();
        if (!StringUtils.isEmpty(param.getP_id()))
        request.setPId(param.getP_id());
        if (param.getOffset()!=0)
        request.setOffset(param.getOffset());
        if (param.getSort_type()!=0)
        request.setSortType(param.getSort_type());
        if (param.getLimit()!=0)
        request.setLimit(param.getLimit());
        PddDdkTopGoodsListQueryResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsRecommendGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsRecommendGetRequest request = new PddDdkGoodsRecommendGetRequest();
        if (param.getOffset()!=0)
        request.setOffset(param.getOffset());
        if (param.getLimit()!=0)
        request.setLimit(param.getLimit());
        if (param.getChannel_type()!=0)
        request.setChannelType(param.getChannel_type());
        if (!StringUtils.isEmpty(param.getPid()))
        request.setPid(param.getPid());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        PddDdkGoodsRecommendGetResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String themeGoodsSearch(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkThemeGoodsSearchRequest request = new PddDdkThemeGoodsSearchRequest();
        request.setThemeId(param.getTheme_id());
        PddDdkThemeGoodsSearchResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthTopGoodsListQuery(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOauthTopGoodsListQueryRequest request = new PddDdkOauthTopGoodsListQueryRequest();
        if (!StringUtils.isEmpty(param.getP_id()))
        request.setPId(param.getP_id());
        if (param.getOffset()!=0)
        request.setOffset(param.getOffset());
        if (param.getSort_type()!=0)
        request.setSortType(param.getSort_type());
        if (param.getLimit()!=0)
        request.setLimit(param.getLimit());
        PddDdkOauthTopGoodsListQueryResponse response;
        try {
            response = client.syncInvoke(request, MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthGoodsRecommendGet(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOauthGoodsRecommendGetRequest request = new PddDdkOauthGoodsRecommendGetRequest();
        if (param.getOffset()!=0)
        request.setOffset(param.getOffset());
        if (param.getLimit()!=0)
        request.setLimit(param.getLimit());
        if (param.getChannel_type()!=0)
        request.setChannelType(param.getChannel_type());
        if (!StringUtils.isEmpty(param.getPid()))
        request.setPid(param.getPid());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        PddDdkOauthGoodsRecommendGetResponse response;
        try {
            response = client.syncInvoke(request, MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsSearch(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsSearchRequest request = new PddDdkGoodsSearchRequest();
        if (!StringUtils.isEmpty(param.getKeyword()))
        request.setKeyword(param.getKeyword());
        if (param.getOpt_id()!=0)
        request.setOptId(param.getOpt_id());
        if (param.getPage()!=0)
        request.setPage(param.getPage());
        if (param.getPage_size()!=0)
        request.setPageSize(param.getPage_size());
        if (param.getSort_type()!=0)
        request.setSortType(param.getSort_type());
        request.setWithCoupon(param.isWith_coupon());
        if (!StringUtils.isEmpty(param.getRange_list()))
        request.setRangeList(param.getRange_list());
        if (param.getCat_id()!=0)
        request.setCatId(param.getCat_id());
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        if (param.getGoods_id_list()!=0)
        request.setGoodsIdList(goodsIdList);
        if (param.getMerchant_type()!=0)
        request.setMerchantType(param.getMerchant_type());
        if (!StringUtils.isEmpty(param.getPid()))
        request.setPid(param.getPid());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        List<Integer> merchantTypeList = new ArrayList<Integer>();
        merchantTypeList.add(param.getMerchant_type_list());
        if (param.getMerchant_type_list()!=0)
        request.setMerchantTypeList(merchantTypeList);
        request.setIsBrandGoods(param.is_brand_goods());
        PddDdkGoodsSearchResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String goodsDetail(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkGoodsDetailRequest request = new PddDdkGoodsDetailRequest();
        List<Long> goodsIdList = new ArrayList<Long>();
        goodsIdList.add(param.getGoods_id_list());
        request.setGoodsIdList(goodsIdList);
        if (!StringUtils.isEmpty(param.getPid()))
        request.setPid(param.getPid());
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        if (param.getZs_duo_id()!=0)
        request.setZsDuoId(param.getZs_duo_id());
        if (param.getPlan_type()!=0)
        request.setPlanType(param.getPlan_type());
        PddDdkGoodsDetailResponse response;
        try {
            response = client.syncInvoke(request);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthRpPromUrlGenerate(ComEntity param) {
        PopClient client = PddClient.getPopHttpClient();
        PddDdkOauthRpPromUrlGenerateRequest request = new PddDdkOauthRpPromUrlGenerateRequest();
        request.setGenerateShortUrl(param.isGenerate_short_url());
        List<String> pIdList = new ArrayList<String>();
        pIdList.add(param.getPid_list());
        request.setPIdList(pIdList);
        if (!StringUtils.isEmpty(param.getCustom_parameters()))
        request.setCustomParameters(param.getCustom_parameters());
        request.setGenerateWeappWebview(param.isGenerate_weapp_webview());
        request.setWeAppWebViewShortUrl(param.isWe_app_web_view_short_url());
        request.setWeAppWebWiewUrl(param.isWe_app_web_view_url());
        request.setGenerateWeApp(param.isGenerate_we_app());
        if (param.getChannel_type()!=0)
        request.setChannelType(param.getChannel_type());
        PddDdkOauthRpPromUrlGenerateResponse response;
        try {
            response = client.syncInvoke(request, MyProperties.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
        return JsonUtil.transferToJson(response);
    }

    public String oauthResourceUrlGen(ComEntity param) {

        return "{}";
    }

    public String oauthOrderListRangeGet(ComEntity param) {

        return "{}";
    }

    public String oauthOrderListIncrementGet(ComEntity param) {

        return "{}";
    }

    public String oauthMallUrlGen(ComEntity param) {
        return "{}";
    }

    public String oauthLotteryUrlGen(ComEntity param) {
        return "{}";
    }

    public String oauthGoodsZsUnitUrlGen(ComEntity param) {
        return "{}";
    }

    public String oauthGoodsPromUrlGenerate(ComEntity param) {
        return "{}";
    }

    public String oauthGoodsPidQuery(ComEntity param) {
        return "{}";
    }

    public String oauthGoodsPidGenerate(ComEntity param) {
        return "{}";
    }

    public String oauthCmsPromUrlGenerate(ComEntity param) {
        return "{}";
    }

    public String oauthCheckInBillIncrGet(ComEntity param) {
        return "{}";
    }

    public String oauthAppNewBillListGet(ComEntity param) {
        return "{}";
    }

    public String allOrderListIncrementGet(ComEntity param) {
        return "{}";
    }
}
