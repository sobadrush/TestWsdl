package com.nanshan.app;

import com.nanshan.app.wsdl.OQIArrayOfString;
import com.nanshan.app.wsdl.OQIWeatherWebServiceSoap;

/**
 * @author RogerLo
 * @date 2023/8/16
 */
public class TestWsdlMain {

    public static void main(String[] args) throws Exception {
        String url = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";
        OQIWeatherWebServiceSoap service = new OQIWeatherWebServiceSoap(url,30000);
        OQIArrayOfString rsData = service.getSupportCity("台湾");
        System.err.println("rsData = " + rsData);
    }

}
