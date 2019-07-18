package com.jtzeng.springmvc.serviceI;

import com.jtzeng.springmvc.entity.ComEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public interface DdkServiceI {
    String themeListGet(ComEntity param);

    String goodsZsUnitUrlGen(ComEntity param);

    String zsUnitGoodsQuery(ComEntity param);

    String weappQrcodeUrlGen(ComEntity param);

    String goodsBasicInfoGet(ComEntity param);

    String orderDetailGet(ComEntity param);

    String mallUrlGen(ComEntity param);

    String phraseGenerate(ComEntity param);

    String oauthOrderDetailGet(ComEntity param);

    String oauthPhraseGenerate(ComEntity param);

    String oauthWeappQrcodeUrlGen(ComEntity param);

    String oauthZsUnitGoodsQuery(ComEntity param);

    String oauthThemePromUrlGenerate(ComEntity param);

    String actPromUrlGenerate(ComEntity param);

    String appNewBillListGet(ComEntity param);

    String checkInPromUrlGenerate(ComEntity param);

    String mallCouponUrlGen(ComEntity param);

    String oauthColorOrderIncrementGet(ComEntity param);

    String goodsGameVirtualUrlGenerate(ComEntity param);

    String orderListIncrementGet(ComEntity param);

    String goodsGuessLike(ComEntity param);

    String directGoodsQuery(ComEntity param);

    String cmsPromUrlGenerate(ComEntity param);

    String goodsPromotionUrlGenerate(ComEntity param);

    String goodsUnitQuery(ComEntity param);

    String couponInfoQuery(ComEntity param);

    String lotteryUrlGen(ComEntity param);

    String orderListRangeGet(ComEntity param);

    String goodsSaleMonthQuery(ComEntity param);

    String resourceUrlGen(ComEntity param);

    String goodsPidQuery(ComEntity param);

    String goodsPidGenerate(ComEntity param);

    String rpPromUrlGenerate(ComEntity param);

    String themePromUrlGenerate(ComEntity param);

    String mallGoodsListGet(ComEntity param);

    String topGoodsListQuery(ComEntity param);

    String goodsRecommendGet(ComEntity param);

    String themeGoodsSearch(ComEntity param);

    String oauthTopGoodsListQuery(ComEntity param);

    String oauthGoodsRecommendGet(ComEntity param);

    String goodsSearch(ComEntity param);

    String goodsDetail(ComEntity param);

    String oauthRpPromUrlGenerate(ComEntity param);

    String oauthResourceUrlGen(ComEntity param);

    String oauthOrderListRangeGet(ComEntity param);

    String oauthOrderListIncrementGet(ComEntity param);

    String oauthMallUrlGen(ComEntity param);

    String oauthLotteryUrlGen(ComEntity param);

    String oauthGoodsZsUnitUrlGen(ComEntity param);

    String oauthGoodsPromUrlGenerate(ComEntity param);

    String oauthGoodsPidQuery(ComEntity param);

    String oauthGoodsPidGenerate(ComEntity param);

    String oauthCmsPromUrlGenerate(ComEntity param);

    String oauthCheckInBillIncrGet(ComEntity param);

    String oauthAppNewBillListGet(ComEntity param);

    String allOrderListIncrementGet(ComEntity param);
}
