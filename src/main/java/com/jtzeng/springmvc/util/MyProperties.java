package com.jtzeng.springmvc.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyProperties {
   @Value("#{configProperties['pdd.apiServerUrl']}")
   private String apiServerUrl;
   @Value("#{configProperties['pdd.clientId']}")
   private String clientId;
   @Value("#{configProperties['pdd.clientSecret']}")
   private String clientSecret;
   private static String accessToken;

   public static String getAccessToken() {
      return accessToken;
   }

   public static void setAccessToken(String accessToken) {
      MyProperties.accessToken = accessToken;
   }
}
