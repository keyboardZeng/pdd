package com.jtzeng.springmvc.controller;

import com.jtzeng.springmvc.entity.ComEntity;
import com.jtzeng.springmvc.serviceI.DdkServiceI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pdd/ddk")
public class DdkController {
    @Resource
    private DdkServiceI ddkServiceImpl;
    @RequestMapping("/theme/list/get")
    public String themeListGet(ComEntity param){
        return ddkServiceImpl.themeListGet(param);
    }
    @RequestMapping("/goods/zs/unit/url/gen")
    public String goodsZsUnitUrlGen(ComEntity param){
        return ddkServiceImpl.goodsZsUnitUrlGen(param);
    }
    @RequestMapping("/zs/unit/goods/query")
    public String zsUnitGoodsQuery(ComEntity param){
        return ddkServiceImpl.zsUnitGoodsQuery(param);
    }
    @RequestMapping("/weapp/qrcode/url/gen")
    public String weappQrcodeUrlGen(ComEntity param){
        return ddkServiceImpl.weappQrcodeUrlGen(param);
    }
    @RequestMapping("/goods/basic/info/get")
    public String goodsBasicInfoGet(ComEntity param){
        return ddkServiceImpl.goodsBasicInfoGet(param);
    }
    @RequestMapping("/order/detail/get")
    public String orderDetailGet(ComEntity param){
        return ddkServiceImpl.orderDetailGet(param);
    }
    @RequestMapping("/mall/url/gen")
    public String mallUrlGen(ComEntity param){
        return ddkServiceImpl.mallUrlGen(param);
    }
    @RequestMapping("/phrase/generate")
    public String phraseGenerate(ComEntity param){
        return ddkServiceImpl.phraseGenerate(param);
    }
    @RequestMapping("/oauth/order/detail/get")
    public String oauthOrderDetailGet(ComEntity param){
        return ddkServiceImpl.oauthOrderDetailGet(param);
    }
    @RequestMapping("/oauth/phrase/generate")
    public String oauthPhraseGenerate(ComEntity param){
        return ddkServiceImpl.oauthPhraseGenerate(param);
    }
    @RequestMapping("/oauth/weapp/qrcode/url/gen")
    public String oauthWeappQrcodeUrlGen(ComEntity param){
        return ddkServiceImpl.oauthWeappQrcodeUrlGen(param);
    }
    @RequestMapping("/oauth/zs/unit/goods/query")
    public String oauthZsUnitGoodsQuery(ComEntity param){
        return ddkServiceImpl.oauthZsUnitGoodsQuery(param);
    }
    @RequestMapping("/oauth/theme/prom/url/generate")
    public String oauthThemePromUrlGenerate(ComEntity param){
        return ddkServiceImpl.oauthThemePromUrlGenerate(param);
    }
    @RequestMapping("/act/prom/url/generate")
    public String actPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.actPromUrlGenerate(param);
    }
    @RequestMapping("/app/new/bill/list/get")
    public String appNewBillListGet(ComEntity param){
        return ddkServiceImpl.appNewBillListGet(param);
    }
    @RequestMapping("/check/in/prom/url/generate")
    public String checkInPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.checkInPromUrlGenerate(param);
    }
    @RequestMapping("/mall/coupon/url/gen")
    public String mallCouponUrlGen(ComEntity param){
        return ddkServiceImpl.mallCouponUrlGen(param);
    }
    @RequestMapping("/oauth/color/order/increment/get")
    public String oauthColorOrderIncrementGet(ComEntity param){
        return ddkServiceImpl.oauthColorOrderIncrementGet(param);
    }
    @RequestMapping("/goods/game/virtual/url/generate")
    public String goodsGameVirtualUrlGenerate(ComEntity param){
        return ddkServiceImpl.goodsGameVirtualUrlGenerate(param);
    }
    @RequestMapping("/order/list/increment/get")
    public String orderListIncrementGet(ComEntity param){
        return ddkServiceImpl.orderListIncrementGet(param);
    }
    @RequestMapping("/goods/guess/like")
    public String goodsGuessLike(ComEntity param){
        return ddkServiceImpl.goodsGuessLike(param);
    }
    @RequestMapping("/direct/goods/query")
    public String directGoodsQuery(ComEntity param){
        return ddkServiceImpl.directGoodsQuery(param);
    }
    @RequestMapping("/cms/prom/url/generate")
    public String cmsPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.cmsPromUrlGenerate(param);
    }
    @RequestMapping("/goods/promotion/url/generate")
    public String goodsPromotionUrlGenerate(ComEntity param){
        return ddkServiceImpl.goodsPromotionUrlGenerate(param);
    }
    @RequestMapping("/goods/unit/query")
    public String goodsUnitQuery(ComEntity param){
        return ddkServiceImpl.goodsUnitQuery(param);
    }
    @RequestMapping("/coupon/info/query")
    public String couponInfoQuery(ComEntity param){
        return ddkServiceImpl.couponInfoQuery(param);
    }
    @RequestMapping("/lottery/url/gen")
    public String lotteryUrlGen(ComEntity param){
        return ddkServiceImpl.lotteryUrlGen(param);
    }
    @RequestMapping("/order/list/range/get")
    public String orderListRangeGet(ComEntity param){
        return ddkServiceImpl.orderListRangeGet(param);
    }
    @RequestMapping("/goods/sale/month/query")
    public String goodsSaleMonthQuery(ComEntity param){
        return ddkServiceImpl.goodsSaleMonthQuery(param);
    }
    @RequestMapping("/resource/url/gen")
    public String resourceUrlGen(ComEntity param){
        return ddkServiceImpl.resourceUrlGen(param);
    }
    @RequestMapping("/goods/pid/query")
    public String goodsPidQuery(ComEntity param){
        return ddkServiceImpl.goodsPidQuery(param);
    }
    @RequestMapping("/goods/pid/generate")
    public String goodsPidGenerate(ComEntity param){
        return ddkServiceImpl.goodsPidGenerate(param);
    }
    @RequestMapping("/rp/prom/url/generate")
    public String rpPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.rpPromUrlGenerate(param);
    }
    @RequestMapping("/theme/prom/url/generate")
    public String themePromUrlGenerate(ComEntity param){
        return ddkServiceImpl.themePromUrlGenerate(param);
    }
    @RequestMapping("/mall/goods/list/get")
    public String mallGoodsListGet(ComEntity param){
        return ddkServiceImpl.mallGoodsListGet(param);
    }
    @RequestMapping("/top/goods/list/query")
    public String topGoodsListQuery(ComEntity param){
        return ddkServiceImpl.topGoodsListQuery(param);
    }
    @RequestMapping("/goods/recommend/get")
    public String goodsRecommendGet(ComEntity param){
        return ddkServiceImpl.goodsRecommendGet(param);
    }
    @RequestMapping("/theme/goods/search")
    public String themeGoodsSearch(ComEntity param){
        return ddkServiceImpl.themeGoodsSearch(param);
    }
    @RequestMapping("/oauth/top/goods/list/query")
    public String oauthTopGoodsListQuery(ComEntity param){
        return ddkServiceImpl.oauthTopGoodsListQuery(param);
    }
    @RequestMapping("/oauth/goods/recommend/get")
    public String oauthGoodsRecommendGet(ComEntity param){
        return ddkServiceImpl.oauthGoodsRecommendGet(param);
    }
    @RequestMapping("/goods/search")
    public String goodsSearch(ComEntity param){
        return ddkServiceImpl.goodsSearch(param);
    }
    @RequestMapping("/goods/detail")
    public String goodsDetail(ComEntity param){
        return ddkServiceImpl.goodsDetail(param);
    }
    @RequestMapping("/oauth/rp/prom/url/generate")
    public String oauthRpPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.oauthRpPromUrlGenerate(param);
    }
    @RequestMapping("/oauth/resource/url/gen")
    public String oauthResourceUrlGen(ComEntity param){
        return ddkServiceImpl.oauthResourceUrlGen(param);
    }
    @RequestMapping("/oauth/order/list/range/get")
    public String oauthOrderListRangeGet(ComEntity param){
        return ddkServiceImpl.oauthOrderListRangeGet(param);
    }
    @RequestMapping("/oauth/order/list/increment/get")
    public String oauthOrderListIncrementGet(ComEntity param){
        return ddkServiceImpl.oauthOrderListIncrementGet(param);
    }
    @RequestMapping("/oauth/mall/url/gen")
    public String oauthMallUrlGen(ComEntity param){
        return ddkServiceImpl.oauthMallUrlGen(param);
    }
    @RequestMapping("/oauth/lottery/url/gen")
    public String oauthLotteryUrlGen(ComEntity param){
        return ddkServiceImpl.oauthLotteryUrlGen(param);
    }
    @RequestMapping("/oauth/goods/zs/unit/url/gen")
    public String oauthGoodsZsUnitUrlGen(ComEntity param){
        return ddkServiceImpl.oauthGoodsZsUnitUrlGen(param);
    }
    @RequestMapping("/oauth/goods/prom/url/generate")
    public String oauthGoodsPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.oauthGoodsPromUrlGenerate(param);
    }
    @RequestMapping("/oauth/goods/pid/query")
    public String oauthGoodsPidQuery(ComEntity param){
        return ddkServiceImpl.oauthGoodsPidQuery(param);
    }
    @RequestMapping("/oauth/goods/pid/generate")
    public String oauthGoodsPidGenerate(ComEntity param){
        return ddkServiceImpl.oauthGoodsPidGenerate(param);
    }
    @RequestMapping("/oauth/cms/prom/url/generate")
    public String oauthCmsPromUrlGenerate(ComEntity param){
        return ddkServiceImpl.oauthCmsPromUrlGenerate(param);
    }
    @RequestMapping("/oauth/check/in/bill/incr/get")
    public String oauthCheckInBillIncrGet(ComEntity param){
        return ddkServiceImpl.oauthCheckInBillIncrGet(param);
    }
    @RequestMapping("/oauth/app/new/bill/list/get")
    public String oauthAppNewBillListGet(ComEntity param){
        return ddkServiceImpl.oauthAppNewBillListGet(param);
    }
    @RequestMapping("/all/order/list/increment/get")
    public String allOrderListIncrementGet(ComEntity param){
        return ddkServiceImpl.allOrderListIncrementGet(param);
    }
}
